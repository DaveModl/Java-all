package com.java.basic.datatype;

/**
 * String对象,String是不可变对象
 * 字符串是放在常量池的
 */
public class StringDemo {
    public static void main(String[] args) {
        String greeting = "Hello";
        //获取子串
        String s = greeting.substring(0,3);
        //字符串拼接
        String s1 = "A";
        String s2 = "bcd";
        String s3 = s1 + s2;

        String s4 = String.join(",","A","B","C");
        System.out.println(s4);

        //检测相等性，两个字符串可能不在相同的位置所以不能使用==
        System.out.println("hello".equals(greeting));
        System.out.println("HELLO".equalsIgnoreCase(greeting));

        //null 与空串
        String s5 = "";
        System.out.println(s5.length());
        System.out.println(s5.equals(""));
        if (s5 == null){
            System.out.println("null与空串一致");
        }
    }
}
/**
 * 常用方法
 * char charAt(int index)
 * int CompareTo(String str)字典顺序比较
 * boolean equals(Object other)
 * boolean equalsIgnoreCase(String str)
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * int indexOf(String str)
 * int indexOf(String str,int index) 返回字符串索引从O或者index开始计算
 * int length()
 * String replace(CharSequence oldStr,CharSequence newStr) String / StringBuilder做参数
 * String toLowerCase()
 * String toUpperCase()
 * String trim() 删除头尾空格
 * String join(CharSequence str1,CharSequence... elements)
 *
 */
