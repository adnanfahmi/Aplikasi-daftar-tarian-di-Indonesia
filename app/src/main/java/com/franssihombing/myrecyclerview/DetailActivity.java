package com.franssihombing.myrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.franssihombing.myrecyclerview.model.Hero;

public class DetailActivity extends AppCompatActivity {
    public static final String TAG = "tag";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imghero = findViewById(R.id.detail_img);
        TextView tvName = findViewById(R.id.detail_name);
        TextView tvFrom = findViewById(R.id.detail_detail);

        Intent detailss = getIntent();
        Hero hero = detailss.getParcelableExtra(TAG);

        Glide.with(this)
                .load(hero.getPhoto())
                .apply(new RequestOptions().override(800, 350))
                .into(imghero);
        tvName.setText(hero.getName());
        tvFrom.setText(hero.getFrom());

    }
}