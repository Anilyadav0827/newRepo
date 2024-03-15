package checkedAndUnChecked;

public class CallingClass {
    EvenOrOdd evenOrOdd= new EvenOrOdd();
    public String response(){
//        try{
//        evenOrOdd.getEven(10);
//        }
//        catch (CustomCheckedException customCheckedException){
//            customCheckedException.printStackTrace();
//        }
//      try{
//           evenOrOdd.getOdd(5);
//        }catch (CustomRuntimeException customRuntimeException){
//           customRuntimeException.printStackTrace();
//           }

        try{
            evenOrOdd.getEvenOrOdd(10);
        } catch (CustomRuntimeException customRuntimeException){
            customRuntimeException.printStackTrace();
        }catch (CustomCheckedException customCheckedException){
            customCheckedException.printStackTrace();
        }

        return "Custom checked exception";
    }

}
