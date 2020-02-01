package com.java.object.objectclass;

/**
 * Object所有类的父类
 */
public class ObjectClass {
    public static void main(String[] args) {
        A a = new A("a");
        A a2 = new A("a");
        System.out.println(a.equals(a2));
        System.out.println();
        /**
         * 2.hashCode()
         * 如果是不同对象哈希值一般不会相同
         * 如果equals()返回true哈希值一定相等，反之则不一定
         * 其他
         * int hashCode()返回对象哈希值
         * static int hash(Object... objects)所有对象组合成的哈希值
         * ---------------------
         * static int hashCode(value) .lang/ 返回指定值的哈希值
         * --------------------
         * static int hashCode(type[] a) 计算数组的哈希值
         */
        String s ="Ok";
        StringBuilder builder = new StringBuilder(s);
        //String是内容导出的hashCode(),StringBuilder是Object hashCode导出的对象存储地址
        System.out.println(s.hashCode() + " " + builder.hashCode());
        String t = new String("Ok");
        StringBuilder builder2 = new StringBuilder(t);
        System.out.println(t.hashCode() + " " + builder2.hashCode());
    }
}

/**
 * 1.equals()，基本类型时，比较值是否相等
 * 引用类型，比较两个对象是否是同一个引用
 */
class A{
    private String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if (obj == null){
            return false;
        }
        /**在子类特定时需要判断*/
        if (getClass() != obj.getClass()){
            return false;
        }

        A other = (A) obj;

        return name.equals(other.name);
    }

    /**
     *
     * 3.toString()
     * getClass().getName()
     * super.toString()
     * Arrays.toString()
     * Arrays.deepToString
     *
     * Class getSuperclass()
     */
    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                '}';
    }
}
