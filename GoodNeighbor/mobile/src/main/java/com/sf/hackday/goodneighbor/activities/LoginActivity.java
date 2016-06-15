package com.sf.hackday.goodneighbor.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.sf.hackday.goodneighbor.R;
import com.sf.hackday.goodneighbor.presenters.GoodNeighborPresenter;
import com.sf.hackday.goodneighbor.views.ClickListener;
import com.sf.hackday.goodneighbor.views.LoginView;

/**
 * Login screen.
 */
public class LoginActivity extends AppCompatActivity implements LoginView {

    /**
     *  Presenter.
     */
    private ClickListener listener;
    /**
     * Name of user.
     */
    EditText nameField;
    /**
     * Password of user.
     */
    EditText passwordField;
    /**
     * Screen prompt.
     */
    TextView prompt;
    
    /**
     *  Registering or not.
     */
    private boolean isRegistering = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listener = GoodNeighborPresenter.getInstance();
        listener.setLoginView(this);

        nameField = (EditText) findViewById(R.id.editText1);
        passwordField = (EditText) findViewById(R.id.editText2);
        prompt = (TextView) findViewById(R.id.textView1);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {

            case R.id.action_settings:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.action_home:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * Login button.
     * 
     * @param v view
     */
    public void onLoginClick(View v) {
        listener.setLoginView(this);
        listener.onLoginClick();
    }

    @Override
    public String getUsername() {
        return nameField.getText().toString();
    }

    @Override
    public String getPassword() {
        return passwordField.getText().toString();
    }

    @Override
    public void setPrompt(String msg) {
        prompt.setText(msg);
        return;
    }

    @Override
    public void transition(boolean isUser) {
        if (isUser) {
            Intent intent = new Intent(this, DashboardActivity.class);
            startActivity(intent);
        }
    }

}
