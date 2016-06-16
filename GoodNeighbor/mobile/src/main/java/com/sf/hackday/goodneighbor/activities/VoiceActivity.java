package com.sf.hackday.goodneighbor.activities;

import android.app.Activity;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.sf.hackday.goodneighbor.R;
import com.sf.hackday.goodneighbor.presenters.GoodNeighborPresenter;
import com.sf.hackday.goodneighbor.views.ClickListener;

import java.util.ArrayList;
import java.util.List;

public class VoiceActivity extends AppCompatActivity {

    ClickListener listener;
    private int REQUEST_CODE=1;
    private List<String> results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voice);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setRippleColor(16732160);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });

        listener = GoodNeighborPresenter.getInstance();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
            results = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);


            if (results.get(0) != null) { //results.get(0).equals("like a good neighbor statefarm is there") is the actual call, we opted to not use it because interference would skew voice data.
                gotoMainActivity();
            }

        }
        super.onActivityResult(requestCode, resultCode, data);
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

    public void gotoMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
