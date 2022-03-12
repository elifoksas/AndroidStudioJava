package com.elifoksas.oopproject;

public class Musician {

    private String name;
    private String enstrument;
    private int age;

    public Musician(String name,String enstrument,int age){
        this.name=name;
        this.enstrument=enstrument;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnstrument(String enstrument) {
        this.enstrument = enstrument;
    }

    public void setAge(int age,String password) {
        if(password=="Elif"){
        this.age = age;}
    }

    public String getName() {
        return name;
    }

    public String getEnstrument() {
        return enstrument;
    }

    public int getAge() {
        return age;
    }
}
