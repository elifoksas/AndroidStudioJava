package com.elifoksas.oopproject;

public class piano implements instrument,houseDecor{
    String brand;
    boolean digital;

    @Override
    public void info() {
        System.out.println("override method");
    }
}
