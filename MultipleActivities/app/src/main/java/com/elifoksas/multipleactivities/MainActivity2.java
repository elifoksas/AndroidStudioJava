package com.elifoksas.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void changeScreen(View view){
        Intent intent = new Intent(MainActivity2.this,MainActivity.class); //olduğumuz sınıfı ve gitmek istediğimiz yeri yazıyoruz.
        startActivity(intent);

    }
}