package com.franssihombing.myrecyclerview.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.franssihombing.myrecyclerview.DetailActivity;
import com.franssihombing.myrecyclerview.R;
import com.franssihombing.myrecyclerview.model.Hero;

import java.util.ArrayList;

public class ListHeroAdapter extends RecyclerView.Adapter<ListHeroAdapter.ListViewHolder> {
    private ArrayList<Hero> listHero;
    private Context context;


    public ListHeroAdapter(ArrayList<Hero> listHero, Context context) {
        this.listHero = listHero;
        this.context = context;
    }

    private Onkliklistener onkliklistener;
    public void setOnkliklistener(Onkliklistener onkliklistener) {
        this.onkliklistener = onkliklistener;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_hero, viewGroup, false);
        return new ListViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        Hero hero = listHero.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hero.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgHero);
        holder.tvName.setText(hero.getName());
        holder.tvFrom.setText(hero.getFrom());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onkliklistener.OnItemKlik(listHero.get(holder.getAdapterPosition()));
                Intent details = new Intent(context, DetailActivity.class);
                details.putExtra(DetailActivity.TAG, position);
            }
        });
    }

    public interface Onkliklistener {
        void OnItemKlik(Hero data);
    }


    @Override
    public int getItemCount() {
        return listHero.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgHero;
        TextView tvName, tvFrom;
        ListViewHolder(View itemView) {
            super(itemView);
            imgHero = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvFrom = itemView.findViewById(R.id.tv_item_from);

        }
    }


}