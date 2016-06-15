package com.sf.hackday.goodneighbor.presenters;

import android.view.View;

import com.sf.hackday.goodneighbor.views.ClickListener;
import com.sf.hackday.goodneighbor.views.LoginView;

/**
 * Created by svermeyen1 on 6/15/16.
 */
public class GoodNeighborPresenter implements ClickListener {

    private static GoodNeighborPresenter presenter;

    private LoginView loginView;

    @Override
    public void onRegisterClick() {

    }

    @Override
    public void onLoginClick() {
        String username = loginView.getUsername();
        String password = loginView.getPassword();
        if (username.equals("sf") && password.equals("hackday")) {
            loginView.transition(true);
        } else {
            loginView.setPrompt("Invalid Credentials");
        }
    }

    public void setLoginView(LoginView loginView) {
        this.loginView = loginView;
    }

    public static GoodNeighborPresenter getInstance() {
        if (presenter == null) {
            presenter = new GoodNeighborPresenter();
        }
        return presenter;
    }

}
