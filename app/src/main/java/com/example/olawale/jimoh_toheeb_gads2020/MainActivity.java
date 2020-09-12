package com.example.olawale.jimoh_toheeb_gads2020;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.olawale.jimoh_toheeb_gads2020.TabFragments.SkillFragment;
import com.example.olawale.jimoh_toheeb_gads2020.TabFragments.TopLearnerFragment;
import com.google.android.material.tabs.TabLayout;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // we will create array data and store to listview
    // title
    String[] ListviewTitle = new String[] {
            "Listview Title 1", "Listview Title 2", "Listview Title 3", "Listview Title 4", "Listview Title 5", "Listview Title 6", "Listview Title 7"
    };
    //description
    String[] ListviewDescription = new String[] {
            "Listview Description 1", "Listview Description 2", "Listview Description 3", "Listview Description 4", "Listview Description 5", "Listview Description 6", "Listview Description 7"
    };
    ViewPager viewPager;
    TabLayout tabLayout;
    TextView submit ;

    SkillFragment skillFragment;
    TopLearnerFragment topLearnerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);

                viewPager = findViewById(R.id.viewPager);
                tabLayout = findViewById(R.id.tabLayout);

                skillFragment = new SkillFragment();
                topLearnerFragment = new TopLearnerFragment();
            submit = findViewById(R.id.tvsubmit);
            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                startActivity(new Intent(MainActivity.this , SubmitProject.class));
                }
            });
                MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());

                tabLayout.setupWithViewPager(viewPager);
                viewPager.setAdapter(myPagerAdapter);

                viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });


    }





    class MyPagerAdapter extends FragmentPagerAdapter {

        String[] fragmentNames = {" Learning Leader ", "Skill IQ Leader"};

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return topLearnerFragment;
                case 1:
                    return skillFragment;

            }
            return null;
        }

        @Override
        public int getCount() {
            return fragmentNames.length;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentNames[position];
        }
    }

}
