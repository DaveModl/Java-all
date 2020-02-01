package com.java.object.interfaces.callback;

import com.java.object.interfaces.callback.birds.RedBird;



public class Monitor {
    Bird bird;
    //回调方法
    public void setBird(Bird bird) {
        this.bird = bird;
    }
    public void action(){
        bird.voice();
        bird.fly();
        bird.model();
    }

    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        monitor.setBird(new RedBird());
        monitor.action();
    }
}
