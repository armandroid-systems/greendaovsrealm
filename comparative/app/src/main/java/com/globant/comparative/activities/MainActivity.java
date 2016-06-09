package com.globant.comparative.activities;

import android.os.Bundle;

import com.globant.comparative.R;
import com.globant.comparative.fragments.BaseFragment;
import com.globant.comparative.fragments.FragmentMenu;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setMainFragment(FragmentMenu.getFragmentInstance());
    }
}
