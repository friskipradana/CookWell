package com.dicodingindosatsoft.cookwell;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCook;
    private ArrayList<CookModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCenter.start(getApplication(), "d6ec3e57-d63d-4752-839a-689d12c0b22c",
                Analytics.class, Crashes.class);

        getSupportActionBar().setLogo(R.drawable.ic_chef);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setTitle(" CookWell");

        rvCook = findViewById(R.id.rvCook);
        rvCook.setHasFixedSize(true);


        list.addAll(CookData.getListData());
        showRecyclerList();

    }

    private void showRecyclerList() {
        rvCook.setLayoutManager(new LinearLayoutManager(this));
        CookListAdapter listHeroAdapter = new CookListAdapter(list);
        rvCook.setAdapter(listHeroAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_item:   //this item has your app icon
                Intent i = new Intent(MainActivity.this, About.class);
                startActivity(i);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

