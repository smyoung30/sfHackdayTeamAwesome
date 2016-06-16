package com.sf.hackday.goodneighbor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sf.hackday.goodneighbor.activities.DiscountsActivity;

/**
 * Created by Michael on 6/15/2016.
 */
public class NotificationClass extends Activity {


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_class_layout);
    }

    public void gotoDiscountsActivity(View v) {
        Intent intent = new Intent(this, DiscountsActivity.class);
        startActivity(intent);
    }

}
