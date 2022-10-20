package com.example.menumakanan2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KulinerAdapter extends RecyclerView.Adapter<KulinerAdapter.ViewHolder> {
    private final ArrayList<kuliner> listkuliner;

    KulinerAdapter(ArrayList<kuliner> listkuliner) {
        this.listkuliner = listkuliner;
    }
    @NonNull
    @Override
    public KulinerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder holder = new ViewHolder(inflater.inflate(R.layout.item_kuliner,parent,false));

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull KulinerAdapter.ViewHolder holder, int position) {
        kuliner kuliner = listkuliner.get(position);
        holder.txtNama.setText(kuliner.getNama());
        holder.txtalamat.setText(kuliner.getAlamat());
        holder.imgfoto.setImageResource(kuliner.getId_gambar);

        holder.itemview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.itemview.getContext(), kuliner.getDeskripsi(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listkuliner.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtNama, txtalamat;
        public ImageView imgfoto;
        public ConstraintLayout itemview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNama = (TextView) itemView.findViewById(R.id.txtNama);
            txtalamat = (TextView) itemView.findViewById(R.id.txtAlamat);
            imgfoto = (ImageView) itemView.findViewById(R.id.imgfoto);
            this.itemview = (ConstraintLayout)  itemView.findViewById(R.id.mainlayout);
        }
    }
}
