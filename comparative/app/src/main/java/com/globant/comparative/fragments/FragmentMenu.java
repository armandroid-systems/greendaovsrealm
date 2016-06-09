package com.globant.comparative.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.globant.comparative.R;
import com.globant.comparative.presenter.PresenterMenu;
import com.globant.comparative.utils.Constants;
import com.globant.comparative.view.FragmentMenuView;

/**
 * Created by zadtankus on 8/06/16.
 */
public class FragmentMenu extends BaseFragment implements View.OnClickListener, FragmentMenuView{
    private final static String TAG = FragmentMenu.class.getSimpleName();

    private PresenterMenu presenter;

    public static FragmentMenu getFragmentInstance(){
        return new FragmentMenu();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new PresenterMenu();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View menuView = inflater.inflate(R.layout.fragment_menu, container, false);

        Button buttonOrm   = (Button) menuView.findViewById(R.id.buttonOrm);
        Button buttonRealm = (Button) menuView.findViewById(R.id.buttonRealm);

        buttonOrm.setOnClickListener(this);
        buttonRealm.setOnClickListener(this);

        return menuView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter.setView(this);
    }

    @Override
    public void goToORM() {
        replaceFragmentMain(R.id.fragmentWrapper,
                FragmentList.getFragmentInstance(),
                Constants.LIST_VIEW,0);
    }

    @Override
    public void goToRealm() {
        replaceFragmentMain(R.id.fragmentWrapper,
                FragmentList.getFragmentInstance(),
                Constants.LIST_VIEW,0);
    }

    @Override
    public void onClick(View v) {
        presenter.manageClick(v.getId());
    }
}
