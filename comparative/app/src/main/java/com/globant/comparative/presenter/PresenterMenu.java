package com.globant.comparative.presenter;

import com.globant.comparative.R;
import com.globant.comparative.view.FragmentMenuView;

/**
 * Created by zadtankus on 8/06/16.
 */
public class PresenterMenu {

    private FragmentMenuView menuView;

    public void setView(FragmentMenuView view) {
        this.menuView = view;
    }

    public void manageClick(int id){
        switch(id){
            case R.id.buttonOrm:
                menuView.goToORM();
                break;
            case R.id.buttonRealm:
                menuView.goToRealm();
                break;
            default:
                break;
        }
    }
}
