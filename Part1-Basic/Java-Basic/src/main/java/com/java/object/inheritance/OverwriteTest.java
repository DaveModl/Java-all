package com.java.object.inheritance;

public class OverwriteTest {
    public static void main(String[] args) {
        Bar bar = new Bar(1,"Bar");
        bar.method();
        System.out.println(bar.getId() + " " + bar);
    }
}
class Foo{
    private int id;

    public Foo(int id) {
        this.id = id;
    }

    public void method(){
        System.out.println("Foo method");
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "id=" + id +
                '}';
    }
}

class Bar extends Foo{
    //private int id;
    private String name;

    public Bar(int id, String name) {
        //调用父类构造器
        super(id);
        this.name = name;
    }

    /**
     * 方法覆盖：子类重写父类的方法，要保证返回值的兼容性
     * 子类方法的可见性不能低于父类
     * 子类的方法声明的受检查异常不能比父类中的声明的异常更通用（子类可抛出特定异常，或者不跑出任何异常）
     * 父类没有抛出任何受检查异常，子类也不能抛出任何受检查异常
     */
    @Override
    public void method() {
        //调用父类的方法
        super.method();
        System.out.println("Bar method");
    }

    @Override
    public String toString() {
        return "Bar{" +
                "name='" + name + '\'' +
                '}';
    }
}
