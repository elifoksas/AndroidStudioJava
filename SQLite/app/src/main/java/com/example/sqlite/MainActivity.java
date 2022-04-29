package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //veri tabanıyla çalışırken try catch ile çalışırız.
        //çünkü sql kodlarıyla yazacağız ve hata alırsak söylenmeme ihtimali var.
        try{

            //SQLiteDatabase sınıfından yeni bir database türetiyoruz.
            //openorcrate->oluştur ya da oluşturulmuşsa aç.
            SQLiteDatabase database = this.openOrCreateDatabase("Musicians",MODE_PRIVATE,null);

            //table oluşturuyoruz.(eğer oluşturulmamışsa)
            database.execSQL("CREATE TABLE IF NOT EXISTS musicians (id INTEGER PRIMARY KEY, name VARCHAR,age INTEGER)");

            //tabloya değer kaydediyoruz.
            //database.execSQL("INSERT INTO musicians (name, age) VALUES ('Elif',21)");
            //database.execSQL("INSERT INTO musicians (name, age) VALUES ('Hamza',24)");
            //database.execSQL("INSERT INTO musicians (name, age) VALUES ('Lana',44)");
            //tekrar tekrar eklenmesin diye yorum satırına aldım.

            //güncellemek.
            //database.execSQL("UPDATE musicians SET age=22 WHERE name='Elif'");

            //silmek.
            //database.execSQL("DELETE FROM musicians WHERE id=3");

            //değeri okumak.
            Cursor cursor = database.rawQuery("SELECT * FROM musicians",null);

            //id , age ve name'in kaçıncı sütunda olduğunu verir.
            int nameIx = cursor.getColumnIndex("name");
            int ageIx = cursor.getColumnIndex("age");
            int idIx = cursor.getColumnIndex("id");

            while(cursor.moveToNext()){
                //cursor ilerlerken yaptırmak istediklerimiz
                System.out.println("Id: "+cursor.getInt(idIx));
                System.out.println("Name: "+cursor.getString(nameIx));
                System.out.println("Age: "+cursor.getInt(ageIx));

            }
            cursor.close();


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}