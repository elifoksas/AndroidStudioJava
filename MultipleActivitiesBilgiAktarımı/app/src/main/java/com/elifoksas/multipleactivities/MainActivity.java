package com.elifoksas.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String userName;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName="";

        editText= findViewById(R.id.editText);
    }

    public void changeActivity(View view){

        userName = editText.getText().toString(); //kullanıcıdan giriş alıyoruz.

        Intent intent = new Intent(MainActivity.this,MainActivity2.class); //olduğumuz sınıfı ve gitmek istediğimiz yeri yazıyoruz.

        intent.putExtra("userInput",userName); //anahtar kelime ve yollanacak değer.

        startActivity(intent);



    }
}