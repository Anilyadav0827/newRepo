package tspscApplicationProcess.model;

import tspscApplicationProcess.SbiPaymentProcess;
import tspscApplicationProcess.TspscProcess;

public class TspscTest {
    static {
        System.out.println("Welcome to tspsc portal");
        System.out.println("Generate your One time registration");

    }
    public static void main(String[] args) {
        TspscProcess process= new SbiPaymentProcess();
        process.userReg("Anil","999999","12345","Degree");
        process.userLoginCredentials("12345","999999");
       // process.generateOTP("12345");
        process.validateOTP("5555");
        process.applyJob("Degree");
        process.payment("9999","2222");

    }
}
