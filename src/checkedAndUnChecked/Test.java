package checkedAndUnChecked;

public class Test {
    public static void main(String[] args) {

        CallingClass callingClass = new CallingClass();
        try{
        callingClass.response();

    }catch (Exception e){
            System.out.println(e);

        }

}}