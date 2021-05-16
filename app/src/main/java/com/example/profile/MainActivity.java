package com.example.profile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.profile.fragments.HomeFragment;
import com.example.profile.fragments.ListFragment;
import com.example.profile.fragments.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView btnNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNavigation = findViewById(R.id.bottom_navigation);
        btnNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                FragmentManager manager = getSupportFragmentManager();
                switch (item.getItemId()){
                    case R.id.navigation_home:
                        manager.beginTransaction().replace(R.id.container_main, HomeFragment.newInstance("" , "")).commit();
                        Toast.makeText(MainActivity.this,"Оставайся дома", Toast.LENGTH_LONG).show();
                        item.setChecked(true);
                        break;
                    case R.id.navigation_list:
                        manager.beginTransaction().replace(R.id.container_main, ListFragment.newInstance("" , "")).commit();
                        item.setChecked(true);
                        break;
                    case R.id.navigation_profile:
                        manager.beginTransaction().replace(R.id.container_main, ProfileFragment.newInstance("" , "")).commit();
                        item.setChecked(true);
                        break;
                }
                return false;
            }
        });

    }

    @Override
    public void onBackPressed() {
        android.app.FragmentManager manager = getFragmentManager();
        if (manager.getBackStackEntryCount() > 0){
            manager.popBackStack();
        }else {
            super.onBackPressed();
        }
    }
}