package com.example.fasionapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerViewAdaptery extends RecyclerView.Adapter<RecyclerViewAdaptery.ImageViewHolder> {

    Context mContext;
    List<row> mData;

    //Constructor
    public RecyclerViewAdaptery(Context mContext, List<row> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recyclerview_item,
                parent, false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int i) {

        // Binding image here
        // USING GLIDE LIBRARY

        Glide.
                with(mContext)
                .load(mData.get(i).getImg())
                .into(holder.img);

        // Binding TextView with data
        holder.title.setText(mData.get(i).getTitle());
//        holder.img.setImageResource(mData.get(i).getImg());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    // Let's Create a class called: ImageViewHolder
    public class ImageViewHolder extends RecyclerView.ViewHolder implements
            View.OnClickListener{

        ImageView img;
        TextView title;


        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.imageView);
            title = itemView.findViewById(R.id.textView2);

            // Click Listeners
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {

            // Adding Here the Click Events on cards
            if (getLayoutPosition() == 0){
                Toast.makeText(mContext, "You Clicked first Item", Toast.LENGTH_SHORT).show();
            }

        }
    }















}
