package com.ishika.pustakmandiquotes;

import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.fragment.app.Fragment;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import android.os.Bundle;
        import android.view.MenuItem;
        import com.google.android.material.bottomnavigation.BottomNavigationView;
        import com.ishika.pustakmandiquotes.ui.add.addFragment;
        import com.ishika.pustakmandiquotes.ui.search.searchFragment;
        import com.ishika.pustakmandiquotes.ui.bookmark.bookmarkFragment;
        import com.ishika.pustakmandiquotes.ui.feed.feedFragment;
        import com.ishika.pustakmandiquotes.ui.home.homeFragment;

        import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        //getting bottom navigation view and attaching the listener
        BottomNavigationView navigation = findViewById(R.id.bnavigation);
        navigation.setOnNavigationItemSelectedListener(this);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new feedFragment()).commit();
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
                fragment = new feedFragment();
                break;

            case R.id.navigation_search:
                fragment = new searchFragment();
                break;

            case R.id.navigation_add:
                fragment = new addFragment();
                break;

            case R.id.navigation_bookmark:
                fragment = new bookmarkFragment();
                break;
            case R.id.navigation_profile:
                fragment=new homeFragment();
        }

        return loadFragment(fragment);
    }


}