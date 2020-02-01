package com.java.object.generics;



import com.java.object.inheritance.emp.Employee4;
import com.java.object.inheritance.emp.Manager;

public class PairTest3 {
    public static void main(String[] args) {
        Manager ceo = new Manager("AA",600000,1992,12,15);
        Manager cfo = new Manager("BB",400000,1991,12,13);
        PairT<Manager> buddies = new PairT<>(ceo,cfo);
        
        printBuddies(buddies);
        
        ceo.setBonus(1000000);
        cfo.setBonus(500000);
        
        Manager[] managers = {ceo,cfo};
        
        PairT<Employee4> result = new PairT<>();
        
        minMaxBonus(managers,result);
        System.out.println("First: " + result.getFirst().getName() + "Second: " + result.getSecond().getName());
        maxMinBonus(managers,result);
        System.out.println("First: " + result.getFirst().getName() + "Second: " + result.getSecond().getName());
        
    }

    private static void maxMinBonus(Manager[] managers, PairT<? super Manager> result) {
        minMaxBonus(managers,result);
        PairAlg3.swapHelper(result);
    }

    private static void minMaxBonus(Manager[] managers, PairT<? super Manager> result) {
        if (managers.length == 0){
            return;
        }
        Manager min = managers[0];
        Manager max = managers[0];
        for (int i = 1; i < managers.length ; i++) {
            if (min.getBonus() > managers[i].getBonus()){
                min = managers[i];
            }
            if (max.getBonus() < managers[i].getBonus()){
                max = managers[i];
            }
            result.setFirst(min);
            result.setSecond(max);
        }
    }

    private static void printBuddies(PairT<? extends Employee4> buddies) {
        Employee4 first = buddies.getFirst();
        Employee4 second = buddies.getSecond();
        System.out.println(first.getName() + " and " + second.getName() + " are buddies.");
    }
}

class PairAlg3{
    public static boolean hasNull(PairT<?> p){
        return p.getFirst() == null || p.getSecond() == null;
    }

    public static void swap(PairT<?> p){
        swapHelper(p);
    }

    public static <T> void swapHelper(PairT<T> p) {
        T t = p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(t);
    }
}
