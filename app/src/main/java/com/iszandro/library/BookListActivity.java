package com.iszandro.library;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/**
 * Created by Isay Sosa on 1/15/15.
 */
public class BookListActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        initComponents();
    }

    private void initComponents() {
        FragmentManager fragmentManager = getFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragmentContainer);
        checkFragment(fragmentManager, fragment);
    }

    private void checkFragment(FragmentManager fragmentManager, Fragment fragment) {
        if (fragment == null) {
            initFragment(fragmentManager);
        }
    }

    private void initFragment(FragmentManager fragmentManager) {
        Fragment fragment;
        fragment = new BookListFragment();
        fragmentManager.beginTransaction().add(R.id.fragmentContainer, fragment).commit();
    }
}
