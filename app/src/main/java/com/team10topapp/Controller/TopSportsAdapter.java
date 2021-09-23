package com.team10topapp.Controller;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.team10topapp.Models.SportsItems;
import com.team10topapp.R;
import com.team10topapp.Uis.TopTeams;

import java.util.List;

public class TopSportsAdapter extends RecyclerView.Adapter<TopSportsAdapter.MyViewHolder> {
     Context mContext;
      List< SportsItems > mList;
    public TopSportsAdapter(Context mCintex, List<SportsItems> mList) {
        this.mContext = mCintex;
        this.mList = mList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(mContext).inflate(R.layout.sportsitems, parent, false);
        return new MyViewHolder(view);
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle;
        ImageView mImageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.textView_title_sports);
            mImageView = itemView.findViewById(R.id.image_sports);
        }
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
       SportsItems rowp = mList.get(position);
        holder.textViewTitle.setText(rowp.getSports_title());
        holder.mImageView.setImageResource(rowp.getSports_images());
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(mContext , TopTeams.class);
            intent.putExtra("id",rowp.getIds());
            intent.putExtra("name",rowp.getSports_title());
            mContext.startActivity(intent);
        });

    }
    @Override
    public int getItemCount() {
        return mList.size();
    }
}
