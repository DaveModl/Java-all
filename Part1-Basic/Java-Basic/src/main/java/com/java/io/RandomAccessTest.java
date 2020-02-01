package com.java.io;



import java.io.*;
import java.time.LocalDate;

/**
 * 随机文件读写
 */
public class RandomAccessTest {
    public static void main(String[] args) throws IOException {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("AAA",45555,1993,10,6);
        staff[1] = new Employee("bbb",45555,1993,10,6);
        staff[2] = new Employee("CcC",45555,1993,10,6);
        //写入二进制数据
        try(DataOutputStream out = new DataOutputStream(new FileOutputStream("D:\\Java-all\\Part1-Basic\\Java-Basic\\src\\main\\resources\\randomEmp.dat"))){
            for (Employee e : staff){
                writeData(out,e);
            }
        }
        //mode r/w
        try(RandomAccessFile in = new RandomAccessFile("D:\\Java-all\\Part1-Basic\\Java-Basic\\src\\main\\resources\\randomEmp.dat","r")){
            int n = (int) (in.length() / Employee.RECORD_SIZE);
            Employee[] newStaff = new Employee[n];

            for (int i = n - 1; i >= 0 ; i--) {
                newStaff[i] = new Employee();
                in.seek(i * Employee.RECORD_SIZE);
                newStaff[i] = readData(in);
            }

            for (Employee e : newStaff){
                System.out.println(e);
            }
        }
    }

    public static Employee readData(RandomAccessFile in) throws IOException {
        String name = DataIO.readFixedString(Employee.NAME_SIZE,in);
        double salary = in.readDouble();
        int year = in.readInt();
        int month = in.readInt();
        int day = in.readInt();
        return new Employee(name,salary,year,month,day);
    }

    public static void writeData(DataOutputStream out, Employee e) throws IOException {
        DataIO.writeFixedString(e.getName(),Employee.NAME_SIZE,out);
        out.writeDouble(e.getSalary());

        LocalDate hireDay = e.getHireDay();
        out.writeInt(hireDay.getYear());
        out.writeInt(hireDay.getMonthValue());
        out.writeInt(hireDay.getDayOfMonth());
    }
}

class Employee
{
    public static final int NAME_SIZE = 40;
    public static final int RECORD_SIZE = 2 * NAME_SIZE + 8 + 4 + 4 + 4;

    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee() {}

    public Employee(String name, double salary, int year, int month, int day)
    {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }


    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String toString()
    {
        return getClass().getName()
                + "[name=" + name
                + ",salary=" + salary
                + ",hireDay=" + hireDay
                + "]";
    }
}