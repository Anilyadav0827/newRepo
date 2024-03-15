package singletonDesignDemo;

public class Test {
    public static void main(String[] args) {
        Demo demo= Demo.getInstance();
        System.out.println(demo.i);
        System.out.println(demo.j);


    }
}
