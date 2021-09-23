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

import com.team10topapp.Models.PlayerItems;
import com.team10topapp.Models.TopsTeamsItems;
import com.team10topapp.R;
import com.team10topapp.Uis.DetailsActivity;

import java.util.List;

public class PlayerAdapter extends RecyclerView.Adapter< PlayerAdapter.MyViewHolder> {
     Context mContext;
      List< PlayerItems > mList;
    public PlayerAdapter(Context mCintex, List<PlayerItems> mList) {
        this.mContext = mCintex;
        this.mList = mList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(mContext).inflate(R.layout.playersitems, parent, false);
        return new MyViewHolder(view);
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle,textview_no,textviewDesignations;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.playername);
            textview_no = itemView.findViewById(R.id.playerno);
            textviewDesignations= itemView.findViewById(R.id.designations);
        }
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        PlayerItems rowp = mList.get(position);
        holder.textViewTitle.setText(rowp.getPlayername());
        holder.textview_no.setText(rowp.getPlayer_no());
        holder.textviewDesignations.setText(rowp.getDesignation());


        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(mContext , DetailsActivity.class);
           // intent.putExtra("id",rowp.getId());
              //  intent.putExtra("name",rowp.getName());
                mContext.startActivity(intent);

       });
    }
    @Override
    public int getItemCount() {
        return mList.size();
    }
}
