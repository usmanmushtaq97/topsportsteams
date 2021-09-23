package com.team10topapp.Uis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


import com.team10topapp.Controller.TopSportsAdapter;
import com.team10topapp.Models.SportsItems;
import com.team10topapp.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List< SportsItems > list;
    TopSportsAdapter topSportsAdapter;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        SetUpToolBar();
        Load();
    }
    private void  init(){
        recyclerView = findViewById(R.id.sports_category);
        toolbar = findViewById(R.id.toolbar_main_activity);
    }
    private void SetUpToolBar(){
        setSupportActionBar(toolbar);
    }

    private void  Load(){
        list = new ArrayList<>();
        list.add(new SportsItems(1,"Football Teams",R.drawable.ic_football));
        list.add(new SportsItems(2,"Hockey Teams",R.drawable.ic_hock));
        list.add(new SportsItems(3,"Basketball Teams",R.drawable.ic_basketball));
        list.add(new SportsItems(4,"Volleyball Teams",R.drawable.ic_volleyball));
        list.add(new SportsItems(5,"Rugby Teams",R.drawable.ic_rugbyteams));
        list.add(new SportsItems(6,"CyberSports Teams",R.drawable.ic_cybersports));
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        topSportsAdapter = new TopSportsAdapter(MainActivity.this, list);
        recyclerView.setAdapter(topSportsAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainactivitytoolbarmenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.privacypolicy:
                Intent im = new Intent(Intent.ACTION_VIEW);
                im.setData(Uri.parse("https://docs.google.com/document/d/169JCa7jT8NG9_FWIYmfEA4UlPKXeiDGX3iHRZZ1cVS8/edit"));
                startActivity(im);
                return true;
            case R.id.moreteams:
                Intent im2 = new Intent(Intent.ACTION_VIEW);
                im2.setData(Uri.parse("https://footballdatabase.com/ranking/world/1"));
                startActivity(im2);
                return true;
            case R.id.rate_us:
                  rateApp();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
/*
 * Start with rating the app
 * Determine if the Play Store is installed on the device
 *
 * */
    public void rateApp()
    {
        try
        {
            Intent rateIntent = rateIntentForUrl("market://details");
            startActivity(rateIntent);
        }
        catch (ActivityNotFoundException e)
        {
            Intent rateIntent = rateIntentForUrl("https://play.google.com/store/apps/details");
            startActivity(rateIntent);
        }
    }

    private Intent rateIntentForUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(String.format("%s?id=%s", url, getPackageName())));
        int flags = Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_MULTIPLE_TASK;
        if (Build.VERSION.SDK_INT >= 21) {
            flags |= Intent.FLAG_ACTIVITY_NEW_DOCUMENT;
        } else {
            //noinspection deprecation
            flags |= Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET;
        }
        intent.addFlags(flags);
        return intent;
    }  }