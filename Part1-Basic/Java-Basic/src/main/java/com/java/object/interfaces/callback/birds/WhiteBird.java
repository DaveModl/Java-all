package com.java.object.interfaces.callback.birds;

import com.java.object.interfaces.callback.Bird;

public class WhiteBird implements Bird {
    @Override
    public void voice() {
        System.out.println("wawa..");
    }

    @Override
    public void fly() {
        System.out.println("no fly");
    }

    @Override
    public void model() {
        System.out.println("white");
    }
}
