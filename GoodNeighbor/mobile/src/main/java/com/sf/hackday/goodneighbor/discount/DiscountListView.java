package com.sf.hackday.goodneighbor.discount;

import android.app.ListActivity;
import java.util.ArrayList;
import java.util.List;
import android.widget.ArrayAdapter;
import android.os.Bundle;
import android.widget.ListView;
import android.app.Activity;
import android.view.Menu;
import com.sf.hackday.goodneighbor.R;

/**
 * Created by stephenyoung on 6/15/16.
 */
public class DiscountListView extends ListActivity {
    //LIST OF ARRAY STRINGS WHICH WILL SERVE AS LIST ITEMS
    ArrayList<String> listItems=new ArrayList<String>();

    //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
    ArrayAdapter<String> adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {

//        String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry","WebOS","Ubuntu","Windows7","Max OS X"};

        super.onCreate(savedInstanceState);
//        setContentView(R.layout.content_discounts);
//        ArrayAdapter adapter2 =
        listItems.add("Hello");
        listItems.add("goodbe");
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.content_discounts, R.id.labelDiscount, listItems);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
//        super.onCreate(icicle);
//        setContentView(R.layout.content_discounts);
//        listItems.add("Hello");
//        listItems.add("goodbe");
//        adapter=new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1,
//                listItems);
//        setListAdapter(adapter);
    }

}
