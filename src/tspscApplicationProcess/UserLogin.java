package tspscApplicationProcess;

public interface UserLogin {
    boolean userLoginCredentials(String UserTspscId,String mobileNo);
    String generateOTP(String tspscId);
    boolean validateOTP(String otp);


}
