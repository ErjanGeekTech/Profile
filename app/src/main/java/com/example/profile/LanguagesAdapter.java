package com.example.profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LanguagesAdapter extends RecyclerView.Adapter <LanguagesAdapter.LanguagesViewHolder> {

    private OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    List<LanguagesModel> list;
    LayoutInflater inflater;
    Context context;
    Fragment manager;

    public  LanguagesAdapter( List<LanguagesModel> list, Context context){
        this.list = list;
        this.context = context;
        this.inflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public LanguagesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_task, parent, false);
        return new LanguagesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LanguagesViewHolder holder, int position) {
        holder.txtTitle.setText(list.get(position).getTitle());
        holder.image.setImageResource(list.get(position).getImage());
       holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class LanguagesViewHolder extends RecyclerView.ViewHolder{
        TextView txtTitle;
        ImageView image;
        public LanguagesViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.txt_title);
            image = itemView.findViewById(R.id.image_jpg);

        }

        public void bind(LanguagesModel languagesModel) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClickListener.onItemClick(getAdapterPosition());
                }
            });
        }
    }
}
