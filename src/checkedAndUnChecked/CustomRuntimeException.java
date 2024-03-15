package checkedAndUnChecked;

public class CustomRuntimeException extends RuntimeException{
    private String code;
    public CustomRuntimeException(String errorCode,String message){
        super(message);
        this.code=errorCode;
    }

    public String getCode() {
        return code;
    }
}
