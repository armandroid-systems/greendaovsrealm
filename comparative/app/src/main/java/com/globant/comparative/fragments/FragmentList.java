package com.globant.comparative.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.globant.comparative.R;
import com.globant.comparative.presenter.PresenterList;

/**
 * Created by zadtankus on 8/06/16.
 */
public class FragmentList extends BaseFragment{
    private final static String TAG = FragmentList.class.getSimpleName();

    private PresenterList presenter;

    public static FragmentList getFragmentInstance(){
        return new FragmentList();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new PresenterList();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View listView = inflater.inflate(R.layout.fragment_list,container, false);

        return listView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter.executeRead();
    }
}

