package com.java.object.myclass;

public class PersonFinal {
    /**常量数据域，必须初始化，且不能再修改*/
    private final String name;

    public PersonFinal(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
/**
 * final在修饰类时表示不可变类如String,final类不能被继承
 */