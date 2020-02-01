package com.java.object.reflects;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class RunningReflectionTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        AReflect aReflect = new AReflect("AA",1999,1,1);
        Class cla = aReflect.getClass();
        Field field = cla.getDeclaredField("name");
        //允许访问私有域 --- naked
        field.setAccessible(true);
        field.set(aReflect,"New--AA");
        Object value = field.get(aReflect);
        System.out.println(value);
        System.out.println(aReflect);
    }

}
class AReflect{
    private String name;
    private LocalDate date;

    public AReflect(String name, int year,int month,int day) {
        this.name = name;
        this.date = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "AReflect{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
