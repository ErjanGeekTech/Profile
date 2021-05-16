package com.example.profile.fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.profile.LanguagesModel;
import com.example.profile.OnItemClickListener;
import com.example.profile.R;

import java.util.List;

public class ProfileAdapter extends RecyclerView.Adapter <ProfileAdapter.ProfileViewHolder> {

    private OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    List<LanguagesModel> list;
    LayoutInflater inflater;
    Context context;

    public ProfileAdapter(List<LanguagesModel> list, Context context){
        this.list = list;
        this.inflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public ProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_task, parent, false);
        return new ProfileViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileViewHolder holder, int position) {
        holder.txtTitle.setText(list.get(position).getTitle());
        holder.image.setImageResource(list.get(position).getImage());
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ProfileViewHolder extends RecyclerView.ViewHolder{

        TextView txtTitle;
        ImageView image;
        public ProfileViewHolder(@NonNull View itemView) {
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
