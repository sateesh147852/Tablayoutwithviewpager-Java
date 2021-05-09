package com.tablayoutwithviewpager;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.tablayoutwithviewpager.adapter.ViewPagerAdapter;
import com.tablayoutwithviewpager.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initialize();
    }

    private void initialize() {
        viewPager = binding.viewPager2;
        tabLayout = binding.tabLayout;
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(FragmentA.newInstance(), "Home");
        viewPagerAdapter.addFragment(FragmentB.newInstance(), "Details");
        viewPagerAdapter.addFragment(FragmentA.newInstance(), "Profile");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}