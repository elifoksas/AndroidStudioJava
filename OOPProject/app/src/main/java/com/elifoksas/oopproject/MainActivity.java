package com.elifoksas.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        User myUser=new User();
        myUser.name="Elif";
        myUser.job="Software Engineer";

        User newUser=new User();
        newUser.name="Alice";
        newUser.job="Teacher";
        */

        User myUser = new User("Elif", "Software Engineer");
        System.out.println(myUser.information());

        //encapsulation
        Musician james=new Musician("james","guitar",50);
        System.out.println(james.getName());
        james.setAge(60,"Elif");
        System.out.println(james.getAge());

        //inheritance
        SuperMusician lars=new SuperMusician("lars","piano",25);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());

        //polymorphism

        //static polymorphism
        mathematics mathematics= new mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(5,3));
        System.out.println(mathematics.sum(3,4,5));

        //dinamic polymorphism
        Animal myAnimal =new Animal();
        myAnimal.sing();
        dog golden= new dog();
        golden.test();
        golden.sing();

        //abstract&interface
        piano myPiano=new piano();
        myPiano.brand="yamaha";
        myPiano.digital=true;
        myPiano.info();



    }
}