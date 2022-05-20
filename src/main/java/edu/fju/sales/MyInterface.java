package edu.fju.sales;

public class MyInterface implements MyClass{
    public void test(){
        System.out.println("Hello");
    }

    @Override
    public int max(int a, int b) {
        return 1;
    }

}
