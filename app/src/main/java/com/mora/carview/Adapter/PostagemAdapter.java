package com.mora.carview.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mora.carview.R;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.postagem_detalhe,parent,false);

        return  new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    holder.textNome.setText("Adrianno");
    //holder.textPostage.setText("Lugar top");
    holder.imagemPostagem.setImageResource(R.drawable.imagem2);
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public  class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView textNome;
        //private TextView textPostage;
        private ImageView imagemPostagem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textNome = itemView.findViewById(R.id.textPo);
          //  textPostage = itemView.findViewById(R.id.textPo);
            imagemPostagem = itemView.findViewById(R.id.imagePostagem);
        }
    }
    }

