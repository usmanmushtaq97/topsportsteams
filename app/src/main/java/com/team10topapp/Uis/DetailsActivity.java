package com.team10topapp.Uis;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.team10topapp.Controller.PlayerAdapter;
import com.team10topapp.Models.PlayerItems;
import com.team10topapp.R;

import java.util.ArrayList;
import java.util.List;

public class DetailsActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List< PlayerItems > list;
    PlayerAdapter adapter;
    int team_id;
    String team_title,descreptions,coach, captan, pdate,country;
    ImageView imageButton_backbuttons;
    TextView titletextview;
    Toolbar toolbar;
    TextView textView_descriptions,textView_coach, textView_captan,textView_country;
    TextView present_date;
    ImageView countryimage, teamlogo;
    String countryimageurl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        init();
        getIntentValue();
        Load();
        //titletextview.setText(team_title);
        textView_descriptions.setText(descreptions);
        textView_coach.setText(coach);
        textView_captan.setText(captan);
        present_date.setText(pdate);
        textView_country.setText(country);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int resId = bundle.getInt("teamimage");
            teamlogo.setImageResource(resId);
        }
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(team_title);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_more_horiz);
        Glide.with(this)
                .load(countryimageurl) // image url
                .placeholder(R.drawable.spain) // any placeholder to load at start
                .error(R.drawable.spain)
                .into(countryimage);

    }
    private void  init(){
        recyclerView = findViewById(R.id.player_id);
        toolbar = findViewById(R.id.toolbar_details_activity);
       // titletextview = toolbar.findViewById(R.id.toolbar_title_details);
        textView_descriptions= findViewById(R.id.description_teams);
        textView_coach= findViewById(R.id.textView_coach);
        textView_captan= findViewById(R.id.textView_captan);
        teamlogo= findViewById(R.id.imageView_teams);
        countryimage= findViewById(R.id.imageView_country_d);
        present_date = findViewById(R.id.datepresent);
        textView_country = findViewById(R.id.textView_country);
       // imageButton_backbuttons = toolbar.findViewById(R.id.backbtndetails);
        }
    private  void getIntentValue(){
        Intent intent = getIntent();
        team_id= intent.getIntExtra("id",0);
        team_title= intent.getStringExtra("name");
        descreptions = intent.getStringExtra("description");
        captan =  intent.getStringExtra("captan");
       coach = intent.getStringExtra("coach");
        pdate= intent.getStringExtra("pdate");
        country= intent.getStringExtra("tcountry");
        countryimageurl= intent.getStringExtra("countryimg");


    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    private void  Load(){
        list = new ArrayList<>();
        List<PlayerItems> addlist= new ArrayList<>();
        //football teams 1
        list.add(new PlayerItems(1,1,"01","Manuel Neuer","Goalkeeper"));
        list.add(new PlayerItems(2,1,"19","Alphonso Davies","DEFENDERS"));
        list.add(new PlayerItems(3,1,"04","Niklas Süle","DEFENDERS"));
        list.add(new PlayerItems(4,1,"23","Tanguy Nianzou","DEFENDERS"));
        list.add(new PlayerItems(5,1,"18","Marcel Sabitzer","MIDFIELDERS"));
        list.add(new PlayerItems(6,1,"24","Corentin Tolisso","MIDFIELDERS"));
        list.add(new PlayerItems(7,1,"22","Marc Roca","MIDFIELDERS"));
        list.add(new PlayerItems(8,1,"08","Leon Goretzka","MIDFIELDERS"));
        list.add(new PlayerItems(9,1, "07","Serge Gnabry","FORWARDS"));
        list.add(new PlayerItems(10,1,"13","Eric Maxim Choupo-Moting","FORWARDS"));
        list.add(new PlayerItems(11,1,"08","Leon Goretzka","MIDFIELDERS"));
        list.add(new PlayerItems(12,1,"11","Kingsley Coman","FORWARDS"));
        list.add(new PlayerItems(13,1,"09","Robert Lewandowski","FORWARDS"));
        for(PlayerItems items : list){
            if(1==items.getTeams_id()){
                addlist.add(items);
            }
        }
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new PlayerAdapter(this, addlist);
        recyclerView.setAdapter(adapter);
    }
}