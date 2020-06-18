package com.redbakas.timesplitter.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.redbakas.timesplitter.R;
import com.redbakas.timesplitter.ui.home.business.BusinessFragment;
import com.redbakas.timesplitter.ui.home.statics.StaticsFragment;
import com.redbakas.timesplitter.ui.home.unused.UnusedFragment;

public class HomeFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        BottomNavigationView bottomView = root.findViewById(R.id.home_bottom_navigation);
        bottomView.setOnNavigationItemSelectedListener(navListener);
        return root;
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()){
                        case R.id.nav_business:
                            selectedFragment = new BusinessFragment();
                            break;
                        case R.id.nav_statics:
                            selectedFragment = new StaticsFragment();
                            break;
                        case R.id.nav_unused:
                            selectedFragment = new UnusedFragment();
                            break;
                        default: return false;
                    }
                    getFragmentManager().beginTransaction().replace(R.id.home_frame_container, selectedFragment).commit();
                    return true;
                }
            };
}
