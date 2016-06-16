package com.sf.hackday.goodneighbor.activities;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.sf.hackday.goodneighbor.adapter.DiscountArrayAdapter;
import android.widget.ListView;

import com.sf.hackday.goodneighbor.R;
import com.sf.hackday.goodneighbor.discount.DiscountDisplay;
import com.sf.hackday.goodneighbor.discount.DiscountListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiscountsActivity extends AppCompatActivity {
    //LIST OF ARRAY STRINGS WHICH WILL SERVE AS LIST ITEMS
    ArrayList<String> listItems;

    //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
    DiscountArrayAdapter adapter;
    ListView listView;

    DiscountListView displayListView  = new DiscountListView();
    List<DiscountDisplay> displayInfoList = displayListView.createDiscountListInfo();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discounts);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });


        listItems = new ArrayList<String>();
        Map<Integer, Drawable> imageStrings = new HashMap<>();

        int i = 0;
        for (DiscountDisplay discountDisplay : displayInfoList){
            listItems.add(discountDisplay.getPrompt());
            if (discountDisplay.getIcon() == 2){
                imageStrings.put(i, getResources().getDrawable(R.drawable.checkmark));
            } else if (discountDisplay.getIcon() == 1){
                imageStrings.put(i, getResources().getDrawable(R.drawable.exclamationpoint));
            }
            i++;
        }


        adapter = new DiscountArrayAdapter(this, R.layout.content_discounts, listItems, imageStrings);
        listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
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


    public void gotoDiscountDetailsActivity(View v) {
        Intent intent2 = new Intent(this, DiscountDetailsActivity.class);
        startActivity(intent2);
    }


}
