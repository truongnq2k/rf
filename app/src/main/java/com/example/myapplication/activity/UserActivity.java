package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.myapplication.R;
import com.example.myapplication.adapter.ListUserAdapter;
import com.example.myapplication.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        LinearLayoutManager vertical = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerView rv = findViewById(R.id.userRecyclerView);
        rv.setLayoutManager(vertical);

        List<User> lu = new ArrayList<User>();
        lu.add(new User("usernamedemo1", "Hoang Van Nam"));
        lu.add(new User("usernamedemo2", "Nguyen Viet Anh"));
        lu.add(new User("usernamedemo3", "Tran Quang Huy"));
        lu.add(new User("usernamedemo4", "Nguyen Duy Nam"));
        lu.add(new User("usernamedemo5", "Phan Boi Chau"));

        ListUserAdapter adapter = new ListUserAdapter((Context) this, (ArrayList<User>) lu);
        rv.setAdapter(adapter);
    }
}