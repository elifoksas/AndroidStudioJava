package com.elifoksas.runnablehandler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int number;
    Runnable runnable;//runnable-> bir işlemi birden fazla kez belirttiğimiz periyotta yapmamızı sağlar.
    Handler handler;//handler-> runnable'ı çalıştırmamızı sağlar.
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        button= findViewById(R.id.buttonStart);
        number=0;


    }
    public void start(View view){

        handler= new Handler();
        runnable=new Runnable() {
            @Override
            public void run() {
                textView.setText("Time: "+number);
                number++;
                textView.setText("Time: "+number);
                handler.postDelayed(runnable,1000);//runnable'ı saniyede bir çalıştır.
            }
        };
        handler.post(runnable);
        button.setEnabled(false);//buton tıklanamaz hale gelecek.(1 kere tıklanabilecek)
    }
    public void stop(View view){
        button.setEnabled(true);//butonu tıklanabilir hale getirdik.

        handler.removeCallbacks(runnable);//runnable'ı durdurduk.
        number=0;
        textView.setText("Time: "+number);
    }
}