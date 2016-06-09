package com.globant.comparative.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by zadtankus on 8/06/16.
 */
public class BaseFragment extends Fragment {

    /**
     * Replace a fragment in actvity container
     * add to backstack depends of flag mainScreen, this is for back navigation
     *
     * @param containerId  id of container
     * @param fragment     the fragment instance
     * @param fragmentName the name of fragment, to add in backstack
     * @param isMainScreen flag to control add to backstack
     */
    protected void replaceFragmentMain(int containerId, Fragment fragment, String fragmentName, int isMainScreen) {
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

        if (isMainScreen == 0) {
            transaction.addToBackStack(fragmentName);
        }
        transaction.replace(containerId, fragment);
        transaction.commit();
    }
}
