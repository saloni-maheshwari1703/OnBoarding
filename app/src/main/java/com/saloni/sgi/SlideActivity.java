package com.saloni.sgi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class SlideActivity extends AppCompatActivity {

    public static ViewPager viewPager;
    SlidViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);


        viewPager = findViewById(R.id.viewpager);
        adapter = new SlidViewPagerAdapter(this);
        viewPager.setAdapter(adapter);
    }


}