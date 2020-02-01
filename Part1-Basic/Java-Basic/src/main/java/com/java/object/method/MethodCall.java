package com.java.object.method;

public class MethodCall {
    /**
     * Java中方法参数的传递：call by value
     */
    public static void main(String[] args) {
    int x= 10;
    addValue(x);
    System.out.println(x);
        System.out.println();
        Var var = new Var(20);
        addValue(var);
        System.out.println(var.getX());
        System.out.println();
        Var sv1 = new Var(30);
        Var sv2 = new Var(40);
        System.out.println("After swap"+sv1.getX() +" "+ sv2.getX());
        swap(sv1,sv2);
        System.out.println("After swap"+sv1.getX() +" "+ sv2.getX());
    }

    /**
     *形参类型:基本数据类型（数字，布尔）
     * 引用类型
     * xc初始化为 x copy的值
     * xc + 100 = 110
     * x = 10
     */
    public static void addValue(int xc) {
        xc = xc + 100;
        System.out.println(xc);
    }

    /**
     * v被初始化为var的拷贝
     * v/var同时引用addX
     * 方法结束v销毁
     * var引用增加后的对象
     * @param v
     */
    public static void addValue(Var v){
        v.addX(200);
    }

    /**
     * x/y只是获得sv1,sv2的拷贝，交换的是拷贝的值
     * 原对象并没有改变
     * java always call by value
     * @param x
     * @param y
     */
    public static void swap(Var x,Var y){
        System.out.println("In method before swap"+x.getX() +" "+ y.getX());
        Var temp = x;
        x = y;
        y = temp;
        System.out.println("In method after swap"+x.getX() +" "+ y.getX());
    }

}

class Var{
    private int x;

    public Var(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void addX(int adder){
        x= x+adder;
        System.out.println(x);
    }
}
