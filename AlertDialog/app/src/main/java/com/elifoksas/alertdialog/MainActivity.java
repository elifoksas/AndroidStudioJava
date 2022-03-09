package com.elifoksas.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void save(View view){

        AlertDialog.Builder alert = new AlertDialog.Builder(this); //alert oluşturduk.

        alert.setTitle("Save");
        alert.setMessage("Are you sure?");
        alert.setPositiveButton("yes", new DialogInterface.OnClickListener() { //yes butonuna tıklandığında ne olacağını yazıyoruz.
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //save
                Toast.makeText(MainActivity.this,"Saved",Toast.LENGTH_LONG).show(); //popup mesajı oluşturduk.


            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() { //no butonuna tıklandığında ne olacağını yazıyoruz.
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Not Saved",Toast.LENGTH_LONG).show(); //popup mesajı oluşturduk.
            }
        });
        alert.show();
    }
}