package com.java.object.inheritance.emp;

public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("D",80000,1988,12,15);
        boss.setBonus(10000);

        Employee4[] staff = new Employee4[3];
        //将子类赋值给父类，多态
        //若将父类赋值给子类需要强制类型转换
        /**
         * 只能在继承层次内进行类型转换
         * 父类转为子类前需要instanceof检查
         */
        staff[0] = boss;
        staff[1] = new Employee4("A",10000,1999,1,1);
        staff[2] = new Employee4("B",30000,1990,2,4);

        for (Employee4 employee : staff){
            System.out.println(employee);
        }
    }
}
