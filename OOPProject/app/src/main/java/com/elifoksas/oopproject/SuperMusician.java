package com.elifoksas.oopproject;

public class SuperMusician extends Musician {

    public SuperMusician(String name, String enstrument, int age) {
        super(name, enstrument, age);
    }

    public String sing(){
        return "nothing else matters";
    }
}
