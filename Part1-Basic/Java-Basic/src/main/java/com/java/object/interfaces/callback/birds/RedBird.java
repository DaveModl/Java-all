package com.java.object.interfaces.callback.birds;

import com.java.object.interfaces.callback.Bird;

public class RedBird implements Bird {
    @Override
    public void voice() {
        System.out.println("jiajia");
    }

    @Override
    public void fly() {
        System.out.println("fly high");
    }

    @Override
    public void model() {
        System.out.println("Red");
    }
}
