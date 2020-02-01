package com.java.object.innerclass;

public class MemberInnerClass {
    private String name;
    public int x = 1;
    private static final int y = 2;

    public MemberInnerClass(String name) {
        this.name = name;
    }
     public Member getMemberInstance(){
        return new Member();
     }

    /**
     * 成员内部类
     */
    class Member{
        //内部类中的静态域必须为final,不能有static方法
        private static final int z = 12;
        public void msg(){
            System.out.println("Inner member class");
            System.out.println(x);//共有域
            System.out.println(y);//私有静态域
            System.out.println(z);
        }
    }

    public static void main(String[] args) {
        MemberInnerClass outer = new MemberInnerClass("Outer");
        MemberInnerClass.Member inner = outer.new Member();
        inner.msg();
        MemberInnerClass outer2 = new MemberInnerClass("Outer2");
        MemberInnerClass.Member inner2 = outer2.getMemberInstance();
        inner2.msg();
    }
}
