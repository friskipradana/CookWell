package com.dicodingindosatsoft.cookwell;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;

import java.util.ArrayList;

public class CookListAdapter extends RecyclerView.Adapter<CookListAdapter.ListViewHolder> {


    Context context;
    private ArrayList<CookModel> listCookModel;

    public CookListAdapter(ArrayList<CookModel> listCookModel) {
        this.listCookModel = listCookModel;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_cook, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {

        final CookModel cook = listCookModel.get(position);
        Picasso.get().load(cook.getPhoto_recipe()).resize(55, 55).centerCrop().into(holder.imgPhoto);
        holder.tvName.setText(cook.getNama_recipe());
        holder.tvDetail.setText(cook.getDetail_recipe());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, CookDetail.class);
                i.putExtra("image_recipe", cook.getPhoto_recipe());
                i.putExtra("nama_recipe", cook.getNama_recipe());
                i.putExtra("detail_recipe", cook.getDetail_recipe());
                i.putExtra("photo_account", cook.getPhoto_account());
                i.putExtra("nama_account", cook.getNama_account());
                i.putExtra("lokasi_account", cook.getLokasi_account());
                i.putExtra("bahan_bahan", cook.getBahan_bahan());
                i.putExtra("langkah_langkah", cook.getLangkah_langkah());
                context.startActivity(i);

            }
        });
    }

    @Override
    public int getItemCount() {
        return listCookModel.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.item_img_photo);
            tvName = itemView.findViewById(R.id.item_name);
            tvDetail = itemView.findViewById(R.id.item_detail);
        }
    }
}
