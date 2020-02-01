package com.java.object.interfaces;

public class MyInterfaceTest implements f,ff {
    @Override
    public void doSometing() {

    }

    public static void main(String[] args) {
//        f x = new f() 不可实例化
        //声明接口变量
        f x;
        //引用一个实现类
        x = new MyInterfaceTest();

        MyInterfaceTest test = new MyInterfaceTest();
        //检测是否实现某个接口
        System.out.println(test instanceof f);

    }
}
interface f{
    void doSometing();
}
interface ff extends f{
    @Override
    void doSometing();
    //default public static final
    double MY_PI = 3.14;
}
