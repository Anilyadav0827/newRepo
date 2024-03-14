package tspscApplicationProcess;

public class SbiPaymentProcess extends TspscProcess{
    String sbiTx="2222";
    int balance=1000;


    @Override
    public int payment(String tspscTxId, String sbiTxId) {
        if(getTspscTxId().equals(tspscTxId)&&this.sbiTx.equals(sbiTxId)){
            if(getTotalPrice()<=balance){
                System.out.println("transaction is successful");
                int availableBalance=balance-getTotalPrice();
                System.out.println("available balance :"+availableBalance);
            }
        }
        else{
            System.out.println("transaction failed");
        }
        return balance;
    }
}
