package com.team10topapp.Controller;

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
import com.team10topapp.Models.TopsTeamsItems;
import com.team10topapp.R;
import com.team10topapp.Uis.DetailsActivity;

import java.util.List;



public class TopTeamsAdapter extends RecyclerView.Adapter< TopTeamsAdapter.MyViewHolder> {
     Context mContext;
      List< TopsTeamsItems > mList;
    public TopTeamsAdapter(Context mCintex, List<TopsTeamsItems> mList) {
        this.mContext = mCintex;
        this.mList = mList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(mContext).inflate(R.layout.teams_items, parent, false);
        return new MyViewHolder(view);
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle,textview_no;
        ImageView mImageView;
        ImageView imageViewcountry;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.textViewtitle);
            textview_no = itemView.findViewById(R.id.textViewid);
            mImageView = itemView.findViewById(R.id.imageteam);
            imageViewcountry= itemView.findViewById(R.id.imageView_country);
        }
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        TopsTeamsItems rowp = mList.get(position);
        holder.textViewTitle.setText(rowp.getTitle());
        Glide.with(mContext)
                .load(rowp.getCountry_images()) // image url
                .placeholder(R.drawable.spain) // any placeholder to load at start
                .error(R.drawable.spain)
                               .into(holder.imageViewcountry);
        holder.mImageView.setImageResource(rowp.getTeam_image());
        holder.textview_no.setText(rowp.getSerialno() + ".");
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(mContext , DetailsActivity.class);
            intent.putExtra("id",rowp.getId());
            intent.putExtra("name",rowp.getTitle());
            intent.putExtra("captan",rowp.getCaptain());
            intent.putExtra("coach",rowp.getCoach());
            intent.putExtra("description",rowp.getDescriptions());
            intent.putExtra("pdate",rowp.getSincedate());
            intent.putExtra("teamimage",rowp.getTeam_image() );
            intent.putExtra("tcountry",rowp.getCountryname() );
            intent.putExtra("countryimg",rowp.getCountry_images() );
            mContext.startActivity(intent);

       });
    }
    @Override
    public int getItemCount() {
        return mList.size();
    }
}
