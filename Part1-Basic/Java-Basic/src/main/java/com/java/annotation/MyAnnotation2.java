package com.java.annotation;


public @interface MyAnnotation2 {
    enum Status {NEW,FINSHED};
    boolean showDetial() default false;
    String printStr() default "[none]";
    Class<?> testCase() default Void.class;
    Status status() default Status.NEW;
    SubAnno ref() default @SubAnno;
    String[] strArray();

}

