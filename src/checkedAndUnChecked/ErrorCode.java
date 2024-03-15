package checkedAndUnChecked;

public enum ErrorCode {
    NEOTERIC_TIME_OUT("NEOTERIC_TIME_OUT","time out exception"),
    NEOTERIC_IGNORE("NEOTERIC_IGNORE","if even ignore");
    private String code;
    private String message;

    ErrorCode(String errorCode, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
