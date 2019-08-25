package com.example.robad.explorer;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryFragmentAdapter adapter = new CategoryFragmentAdapter(this,getSupportFragmentManager());

        // Set the adapter onto the view pager
        assert viewPager != null;
        viewPager.setAdapter(adapter);

        // Find TabLayout with with id sliding_tabs
        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        assert tabLayout != null;
        // Set the viewpager on the tab layout
        tabLayout.setupWithViewPager(viewPager);
    }
}
