package com.redbakas.timesplitter.ui.home.business;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.redbakas.timesplitter.R;
import com.redbakas.timesplitter.ui.home.statics.StaticsFragment;
import com.redbakas.timesplitter.ui.home.unused.UnusedFragment;

public class BusinessFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_business, container, false);
    }
}
