package com.franssihombing.myrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.franssihombing.myrecyclerview.adapter.ListHeroAdapter;
import com.franssihombing.myrecyclerview.model.Hero;
import com.franssihombing.myrecyclerview.model.HeroesData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv_hero;
    private ArrayList<Hero> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_hero = findViewById(R.id.rv_hero);
        rv_hero.setHasFixedSize(true);
        list.addAll(HeroesData.getListData());
        showRecyclerView();
    }

    private void showRecyclerView() {
        rv_hero.setLayoutManager(new LinearLayoutManager(this));
        ListHeroAdapter listHeroAdapter = new ListHeroAdapter(list, this);
        rv_hero.setAdapter(listHeroAdapter);


        listHeroAdapter.setOnkliklistener(new ListHeroAdapter.Onkliklistener() {

            @Override
            public void OnItemKlik(Hero data) {
                Intent sdf = new Intent(MainActivity.this, DetailActivity.class);
                sdf.putExtra(DetailActivity.TAG, data);
                startActivity(sdf);
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.about:
                Intent i = new Intent(MainActivity.this, about.class);
                startActivity(i);
                break;
        }
    }

}