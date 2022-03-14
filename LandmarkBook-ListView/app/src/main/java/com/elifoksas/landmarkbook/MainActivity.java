package com.elifoksas.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.elifoksas.landmarkbook.databinding.ActivityDetailsBinding;
import com.elifoksas.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<Landmark> landmarkArrayList;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());//inflate->layout ve kodu bağladığımız yer
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList=new ArrayList<>();

        //data
        Landmark eiffel= new Landmark("Eiffel","France",R.drawable.eiffel);
        Landmark galata=new Landmark("Galata Tower","Turkey",R.drawable.galata);
        Landmark colosseum=new Landmark("Collosseum","Italy",R.drawable.colosseum);
        Landmark liberty=new Landmark("The Statue Of Liberty","America",R.drawable.liberty);
        Landmark london=new Landmark("London Bridge","UK",R.drawable.london);

        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(galata);
        landmarkArrayList.add(colosseum);
        landmarkArrayList.add(london);
        landmarkArrayList.add(liberty);


        //Listview->verimsiz olduğu için recyclerview kullanacağız.
        //adapter->veri kaynağı ile layoutu/listviewi birbirine bağlayan yapı.
        //mapping->uyumlu bir yapıyı başka bir yapıya dönüştürürken kullanılır.
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landmarkArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(arrayAdapter);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this,landmarkArrayList.get(position).name,Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);//tıklandığında diğer sınıfa geçiş yapıyoruz
                intent.putExtra("landmark",landmarkArrayList.get(position));//nereye tıklandığını/objeyi gidilen yere iletiyoruz.
                startActivity(intent);
            }
        });
    }
}