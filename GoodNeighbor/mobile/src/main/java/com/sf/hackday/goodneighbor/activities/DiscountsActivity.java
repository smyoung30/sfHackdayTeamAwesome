package com.sf.hackday.goodneighbor.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.sf.hackday.goodneighbor.adapter.DiscountArrayAdapter;
import android.widget.ListView;

import com.sf.hackday.goodneighbor.R;

import java.util.ArrayList;

public class DiscountsActivity extends AppCompatActivity {
    //LIST OF ARRAY STRINGS WHICH WILL SERVE AS LIST ITEMS
    ArrayList<String> listItems;

    //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
    DiscountArrayAdapter adapter;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry","WebOS","Ubuntu","Windows7","Max OS X"};

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discounts);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(false);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        listItems = new ArrayList<String>();
        listItems.add("Sudent Loyality Discount");
        listItems.add("Priority Discount");
        listItems.add("Another Type of Discount");
        listItems.add("Another Type of Discount");
        listItems.add("Another Type of Discount");
        adapter = new DiscountArrayAdapter(this, R.layout.content_discounts, listItems);
        listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
    }

}
