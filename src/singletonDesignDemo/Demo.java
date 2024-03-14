package singletonDesignDemo;


public class Demo {
    int i=10;
    int j=20;
    private static Demo instance;
   private Demo() {

    }
    public static Demo getInstance() {
       if(instance==null){
           instance= new Demo();
       }
       return instance;

    }

}