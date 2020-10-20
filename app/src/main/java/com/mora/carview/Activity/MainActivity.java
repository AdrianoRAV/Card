package com.mora.carview.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mora.carview.Adapter.PostagemAdapter;
import com.mora.carview.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView  recyclerPostagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Definindo Layout

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        //definindo adapter
        PostagemAdapter adapter = new PostagemAdapter();
        recyclerPostagem.setAdapter(adapter);
    }
}