package com.mo.tameem.gmail.batabit.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TableLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.tabs.TabLayout;
import com.mo.tameem.gmail.batabit.R;
import com.mo.tameem.gmail.batabit.adapters.SlidePagerAdapter;
import com.mo.tameem.gmail.batabit.pojo.Slide;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private List<Slide> mList;

    private SlidePagerAdapter adapter;

    private BottomNavigationView bottomNavigationView;


  TabLayout indicator;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.slider_pager);
        bottomNavigationView = findViewById(R.id.bottom_nav);
        indicator = findViewById(R.id.tab_indicator);

        mList = new ArrayList<>();

        mList.add(new Slide("مرحبا بكم", R.drawable.bikes));
        mList.add(new Slide("مرحبا بكم", R.drawable.bike2));


        mList.add(new Slide("مرحبا بكم", R.drawable.bike3));
        mList.add(new Slide("مرحبا بكم", R.drawable.bikes));

        adapter = new SlidePagerAdapter(this, mList);
        viewPager.setAdapter(adapter);
        //setUpWithViewPager
        indicator.setupWithViewPager(viewPager , true);


        /*
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.home:

                        break;
                }
                return true;
            }
        });

        */

    }


}