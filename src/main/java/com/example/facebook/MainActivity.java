package com.example.facebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    ViewPager viewpager;
    MyFragmentAdapter adapter;
    TabLayout tblv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewpager = findViewById(R.id.vp);
        adapter = new MyFragmentAdapter(getSupportFragmentManager());

        viewpager.setAdapter(adapter);

        tblv = findViewById(R.id.tabView);
        tblv.setupWithViewPager(viewpager);
    }

}
