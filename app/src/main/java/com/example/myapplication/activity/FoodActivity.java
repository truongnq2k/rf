package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.myapplication.R;
import com.example.myapplication.adapter.ListFoodAdapter;
import com.example.myapplication.adapter.ListStoreAdapter;
import com.example.myapplication.models.Food;
import com.example.myapplication.models.Store;

import java.util.ArrayList;
import java.util.List;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        LinearLayoutManager vertical = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerView rv = findViewById(R.id.foodRecyclerView);
        rv.setLayoutManager(vertical);

        List<Food> lo = new ArrayList<>();
        lo.add(new Food("Store Food", "Cau Giay, Ha Noi"));
        lo.add(new Food("Store Food", "Cau Giay, Ha Noi"));
        lo.add(new Food("Store Food", "Cau Giay, Ha Noi"));
        lo.add(new Food("Store Food", "Cau Giay, Ha Noi"));
        lo.add(new Food("Store Food", "Cau Giay, Ha Noi"));

        ListFoodAdapter adapter = new ListFoodAdapter((Context) this, (ArrayList<Food>) lo);
        rv.setAdapter(adapter);
    }
}