package com.shouzhong.tablayout.demo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.shouzhong.tablayout.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tab1;
    private TabLayout tab2;
    private TabLayout tab3;
    private TabLayout tab4;
    private TabLayout tab5;
    private TabLayout tab6;

    private ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab1 = findViewById(R.id.tab1);
        tab2 = findViewById(R.id.tab2);
        tab3 = findViewById(R.id.tab3);
        tab4 = findViewById(R.id.tab4);
        tab5 = findViewById(R.id.tab5);
        tab6 = findViewById(R.id.tab6);
        vp = findViewById(R.id.vp);
        String[] titles = {"上海", "头条推荐", "生活", "娱乐八卦", "体育"};
        for (int i = 0; i < titles.length; i++) {
            TabLayout.Tab tab = tab1.newTab();
            tab.setTag(i);
            tab.setText(titles[i]);
            tab1.addTab(tab);
        }
        for (int i = 0; i < titles.length; i++) {
            TabLayout.Tab tab = tab2.newTab();
            tab.setTag(i);
            tab.setText(titles[i]);
            tab2.addTab(tab);
        }
        for (int i = 0; i < titles.length; i++) {
            TabLayout.Tab tab = tab3.newTab();
            tab.setTag(i);
            tab.setText(titles[i]);
            tab3.addTab(tab);
        }
        for (int i = 0; i < titles.length * 2; i++) {
            TabLayout.Tab tab = tab4.newTab();
            tab.setTag(i);
            tab.setText(titles[i % 4]);
            tab4.addTab(tab);
        }
        for (int i = 0; i < titles.length * 2; i++) {
            TabLayout.Tab tab = tab5.newTab();
            tab.setTag(i);
            tab.setText(titles[i % 4]);
            tab5.addTab(tab);
        }
        vp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return new TestFragment();
            }

            @Override
            public int getCount() {
                return 5;
            }
        });
        vp.setCurrentItem(2);
        tab6.setAdapter(new TabAdapter());
        tab6.setupWithViewPager(vp);
    }
}
