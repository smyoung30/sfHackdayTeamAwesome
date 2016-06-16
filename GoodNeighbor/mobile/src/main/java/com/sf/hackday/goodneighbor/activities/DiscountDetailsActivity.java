package com.sf.hackday.goodneighbor.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.sf.hackday.goodneighbor.R;

public class DiscountDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        TextView discountDesc = (TextView) findViewById(R.id.discountDesc);
        discountDesc.setText("There are many variations of passages of Lorem " +
                        "Ipsum available but the majority have suffered " +
                        "alteration in some form by injected humour " +
                "or randomised words which do not look even slightly believable");
    }

}
