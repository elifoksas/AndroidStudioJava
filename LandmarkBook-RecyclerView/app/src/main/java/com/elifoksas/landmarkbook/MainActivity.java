package com.elifoksas.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

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
        binding = ActivityMainBinding.inflate(getLayoutInflater());//inflate->layout ve kodu bağladığımız yer
        View view = binding.getRoot();
        setContentView(view);

        //data
        landmarkArrayList=new ArrayList<>();
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

        //recyclerView
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkRecycleAdapter landmarkRecycleAdapter=new LandmarkRecycleAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkRecycleAdapter);





    }
}