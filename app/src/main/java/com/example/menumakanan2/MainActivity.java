package com.example.menumakanan2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recKuliner;
    private ArrayList<kuliner> listKuliner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recKuliner = findViewById(R.id.rec_kuliner);
        initData();

        recKuliner.setAdapter(new KulinerAdapter(listKuliner));
        recKuliner.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData(){
        this.listKuliner = new ArrayList<>();
        listKuliner.add((new kuliner("Capcay", "jl. pamularsih", "Capcay enak harga murah", R.drawable.capcay)));

        listKuliner.add((new kuliner("Gudeg", "jl. Bulustalan", "warung bu mir. Gudeg laris di semarang", R.drawable.gudeg)));

        listKuliner.add((new kuliner("Ketoprak", "jl. Mt.haryono", "Ketoprak mang dadang pedesnya pas", R.drawable.soto)));

        listKuliner.add((new kuliner("Sate Ayam", "Simpang lima", "Sate Ayam dengan bumbu kacang yang melimpah", R.drawable.sate)));

        listKuliner.add((new kuliner("Soto Kudus", "Simpang lima", "Soto khas enak kudus", R.drawable.soto)));
    }
}