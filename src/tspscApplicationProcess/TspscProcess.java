package tspscApplicationProcess;

import tspscApplicationProcess.model.JobsInfo;
import tspscApplicationProcess.model.UserInfo;

public abstract class TspscProcess implements JobNotification,PaymentProcess,UserLogin,UserRegistration {
    UserInfo userInfo;
    JobsInfo jobsInfo;
    private String tspscId;
    private String otp;
    private String tspscTxId="9999";

    public String getTspscTxId() {
        return tspscTxId;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    private int totalPrice;
    public TspscProcess(){
        this.userInfo= new UserInfo();
        this.jobsInfo=new JobsInfo();
    }
    @Override
    public int  applyJob(String education) {
        if(education.equals(userInfo.getEducation())){
            System.out.println("you are eligible for job");
            totalPrice=jobsInfo.group1+jobsInfo.group2;

            return totalPrice;
        }else{
            System.out.println("you are not eligible for job");
        }
        return totalPrice;
    }

    @Override
    public boolean userLoginCredentials(String userTspscId, String mobileNo) {
        if(this.tspscId.equals(userTspscId)&& userInfo.getMobileNo().equals(mobileNo)){
            //System.out.println("login successful");
            return true;
        }else{
           // System.out.println("in valid login credentials");
            return false;
        }
    }

    @Override
    public String generateOTP(String tspscId) {
        if(this.tspscId.equals(tspscId)){
            this.otp="5555";
        }
        return otp;
    }

    @Override
    public boolean validateOTP(String otp) {
        if(this.otp.equals(otp)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String userReg(String name, String mobileNo, String adharCard, String educationDetails) {
        if(userInfo.getName().equals(name)&&userInfo.getAdharCard().equals(adharCard)
                &&userInfo.getEducation().equals(educationDetails)){
            this.tspscId="12345";
            System.out.println("GeneratedId:"+tspscId);
            System.out.println("registration successful");
        }else{
            System.out.println("registration failed try again ");
        }
        return "";
    }
}
