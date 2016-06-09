package com.globant.comparative.activities;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.globant.comparative.R;

/**
 * Created by zadtankus on 8/06/16.
 */
public class BaseActivity extends AppCompatActivity {

    public void setMainFragment(Fragment fragment){

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentWrapper, fragment)
                .commit();
    }
}
