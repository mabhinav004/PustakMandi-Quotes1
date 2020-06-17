package com.ishika.pustakmandiquotes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class mainpage extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        //getting bottom navigation view and attaching the listener
        BottomNavigationView navigation = findViewById(R.id.bnavigation);
        navigation.setOnNavigationItemSelectedListener(this);

    }

    private boolean loadFragment (Fragment fragment){
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;

        switch (menuItem.getItemId()) {
            case R.id.navigation_feed:
                fragment = new FeedFragment();
                break;

            case R.id.navigation_search:
                fragment = new SearchFragment();
                break;

            case R.id.navigation_add:
                fragment = new AddFragment();
                break;

            case R.id.navigation_bookmark:
                fragment = new BookmarkFragment();
                break;
            case R.id.navigation_profile:
                fragment=new ProfileFragment();
        }

        return loadFragment(fragment);
    }


}
