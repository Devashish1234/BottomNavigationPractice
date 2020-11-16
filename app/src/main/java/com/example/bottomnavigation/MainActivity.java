package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    Fragment fragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.homeBottomNav:

                        fragment = new BlankFragment1();
                        break;

                    case R.id.cartBottomNav:
                        fragment = new BlankFragment2();
                        break;



                }

                getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
                return false;
            }
        });
    }
}