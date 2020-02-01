package com.java.annotation;

public class AnnotationTest {
    @MyAnnotation(showStr = "test01",counter = 1)
    public void testMethod(){

    }
}
/**
 * 注解的适用范围
 * 包
 * 类,enum
 * 方法
 * 构造器
 * 实例域,enum常量
 * 局部变量
 * 参数变量
 * 类型参数 public class A<@Anno T>{}
 */