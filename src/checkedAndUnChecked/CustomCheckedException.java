package checkedAndUnChecked;

public class CustomCheckedException extends Exception{
    private String code;
    public CustomCheckedException(String errorCode,String message){
        super(message);
        this.code=errorCode;
    }

    public String getCode() {
        return code;
    }
}
