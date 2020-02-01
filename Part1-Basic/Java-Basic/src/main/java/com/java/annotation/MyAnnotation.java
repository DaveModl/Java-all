package com.java.annotation;

public @interface MyAnnotation {
    String showStr() default "[none]";
    int counter();
}
/**
 * 注解元素类型:
 * 基本数据类型
 * String
 * Class
 * enum
 * 注解类型
 */
