package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.myapplication.R;
import com.example.myapplication.adapter.ListStoreAdapter;
import com.example.myapplication.models.Store;

import java.util.ArrayList;
import java.util.List;

public class StoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        LinearLayoutManager storeVertical = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerView srv = findViewById(R.id.storeRecyclerView);
        srv.setLayoutManager(storeVertical);

        List<Store> lo = new ArrayList<>();
        lo.add(new Store("Store Food", "Cau Giay, Ha Noi"));
        lo.add(new Store("Store Food", "Cau Giay, Ha Noi"));
        lo.add(new Store("Store Food", "Cau Giay, Ha Noi"));
        lo.add(new Store("Store Food", "Cau Giay, Ha Noi"));
        lo.add(new Store("Store Food", "Cau Giay, Ha Noi"));

        System.out.println(lo);

        ListStoreAdapter adapter = new ListStoreAdapter((Context) this, (ArrayList<Store>) lo);
        srv.setAdapter(adapter);
    }
}