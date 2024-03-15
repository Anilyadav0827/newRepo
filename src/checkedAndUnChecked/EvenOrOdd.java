package checkedAndUnChecked;

public class EvenOrOdd {
    public int getEvenOrOdd(int num) throws CustomCheckedException{
//        if(num%2==0){
//            //System.out.println("Even number");
//            throw new CustomCheckedException(ErrorCode.NEOTERIC_IGNORE.getCode()
//                        ,ErrorCode.NEOTERIC_IGNORE.getMessage());
//
//        }
//       return num;
//    }
//    public int getOdd(int num1){
//        if(num1%2!=0){
//            System.out.println("Odd Number");
//            throw new CustomRuntimeException(ErrorCode.NEOTERIC_TIME_OUT.getCode(),
//                    ErrorCode.NEOTERIC_TIME_OUT.getMessage());
//
//        }
//        return num1;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                throw new CustomCheckedException(ErrorCode.NEOTERIC_IGNORE.getCode()
                        ,ErrorCode.NEOTERIC_IGNORE.getMessage());

            }
            else{
                throw new CustomRuntimeException(ErrorCode.NEOTERIC_TIME_OUT.getCode(),
                   ErrorCode.NEOTERIC_TIME_OUT.getMessage());

            }

        }
        return num;
    }
}
