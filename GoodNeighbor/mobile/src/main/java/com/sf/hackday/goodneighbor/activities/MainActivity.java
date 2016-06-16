package com.sf.hackday.goodneighbor.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.sf.hackday.goodneighbor.R;
import com.sf.hackday.goodneighbor.presenters.GoodNeighborPresenter;
import com.sf.hackday.goodneighbor.views.ClickListener;

public class MainActivity extends AppCompatActivity {

    ClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        //getSupportActionBar().setIcon(R.drawable.logo);
        //getSupportActionBar().setDisplayUseLogoEnabled(true);

//       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        listener = GoodNeighborPresenter.getInstance();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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

            case R.id.action_details:
                intent = new Intent(this, DiscountDetailsActivity.class);
                startActivity(intent);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * Login button.
     *
     * @param v view
     */
    public void gotoLoginActivity(View v) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    /**
     * Register button.
     *
     * @param v view
     */
    public void gotoRegisterActivity(View v) {
        Intent intent2 = new Intent(this, LoginActivity.class);
        startActivity(intent2);
    }

}
