public class StaticDemo {
    StaticDemo(){
        System.out.println("from constructor");

    }
   static  {
       System.out.println("static  block");

    }
    {
        System.out.println("from normal block");
    }
    public static int i=20;
    public int j=30;
    public static String helloWorld(){
        return "helloWorld";
    }
    public String hi(){
        return "hi";

    }
    public static void main(String[] args) {
        System.out.println("from  main block");
//        String message=helloWorld();
//        System.out.println(i);
//        StaticDemo staticDemo= new StaticDemo();
//        String hiMessage=staticDemo.hi();
//        System.out.println(hiMessage);
//
        StaticDemo staticDemo= new StaticDemo();
        System.out.println("Static "+staticDemo.i);
        System.out.println("instance"+staticDemo.j);
        staticDemo.i=100;
        staticDemo.j=100;
        System.out.println("Static "+staticDemo.i);
        System.out.println("instance"+staticDemo.j);
        StaticDemo staticDemo1= new StaticDemo();
        System.out.println("Static "+staticDemo1.i);
        System.out.println("instance"+staticDemo1.j);
        staticDemo1.i=200;
        staticDemo1.j=200;
        System.out.println("Static "+staticDemo1.i);
        System.out.println("instance"+staticDemo1.j);
        StaticDemo staticDemo2= new StaticDemo();
        System.out.println("Static "+staticDemo2.i);
        System.out.println("instance"+staticDemo2.j);
        staticDemo2.i=300;
        staticDemo2.j=300;
        System.out.println("Static "+staticDemo2.i);
        System.out.println("instance"+staticDemo2.j);

    }
}
