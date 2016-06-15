package com.sf.hackday.goodneighbor.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.sf.hackday.goodneighbor.R;
import com.sf.hackday.goodneighbor.presenters.GoodNeighborPresenter;
import com.sf.hackday.goodneighbor.views.ClickListener;

/**
 * Created by svermeyen1 on 6/15/16.
 */
public class DashboardActivity extends AppCompatActivity {

    /**
     * Presenter.
     */
    ClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        listener = GoodNeighborPresenter.getInstance();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
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
    public void gotoDiscountsActivity(View v) {
        Intent intent = new Intent(this, DiscountsActivity.class);
        startActivity(intent);
    }

    /**
     * Register button.
     *
     * @param v view
     */
    public void gotoMapsActivity(View v) {
        Intent intent2 = new Intent(this, MapsActivity.class);
        startActivity(intent2);
    }

}
