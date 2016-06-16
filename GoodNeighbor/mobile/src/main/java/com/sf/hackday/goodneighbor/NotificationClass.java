package com.sf.hackday.goodneighbor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.sf.hackday.goodneighbor.activities.DiscountsActivity;

/**
 * Created by Michael on 6/15/2016.
 */
public class NotificationClass extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_class_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    public void gotoDiscountsActivity(View v) {
        Intent intent = new Intent(this, DiscountsActivity.class);
        startActivity(intent);
    }

}
