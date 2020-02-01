package com.java.io;

import com.java.object.inheritance.emp.Employee4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * 普通文件流读写
 */
public class TextFileTest {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Employee4[] staff = new Employee4[3];
        staff[0] = new Employee4("AAA",45555,1993,10,6);
        staff[1] = new Employee4("bbb",45555,1993,10,6);
        staff[2] = new Employee4("CcC",45555,1993,10,6);
        //写入到文件
        try(PrintWriter out = new PrintWriter("D:\\Java-all\\Part1-Basic\\Java-Basic\\src\\main\\resources\\emp.dat","UTF-8")){
            writeData(staff,out);
        }
        //读取数据到对象 --- 序列化过程
        try(Scanner in = new Scanner(new FileInputStream("D:\\Java-all\\Part1-Basic\\Java-Basic\\src\\main\\resources\\emp.dat"),"UTF-8")){
            Employee4[] newStaff = readData(in);
            for (Employee4 employee : newStaff){
                System.out.println(employee);
            }
        }

    }

    public static Employee4[] readData(Scanner in) {
        int n = in.nextInt();
        in.nextLine();

        Employee4[] employees = new Employee4[n];
        for (int i = 0; i < n ; i++) {
            employees[i] = readEmployee(in);
        }
        return employees;
    }

    private static Employee4 readEmployee(Scanner in) {
        String line = in.nextLine();
        String[] elems = line.split("\\|");
        String name = elems[0];
        double salary = Double.parseDouble(elems[1]);
        LocalDate hireDay = LocalDate.parse(elems[2]);
        int year = hireDay.getYear();
        int month = hireDay.getMonthValue();
        int day = hireDay.getDayOfMonth();
        return new Employee4(name,salary,year,month,day);
    }

    public static void writeData(Employee4[] staff, PrintWriter out) {
        out.println(staff.length);
        for (Employee4 employee : staff){
            writeEmployee(out,employee);
        }
    }

    private static void writeEmployee(PrintWriter out, Employee4 employee) {
        out.println(employee.getName() + "|" + employee.getSalary() + "|" + employee.getHireDay());
    }
}
