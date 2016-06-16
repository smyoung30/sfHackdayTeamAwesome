package com.sf.hackday.goodneighbor.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.sf.hackday.goodneighbor.R;

import java.util.ArrayList;

/**
 * Created by stephenyoung on 6/15/16.
 */
public class DiscountArrayAdapter extends ArrayAdapter<String> {

    private static final String TAG = "DiscountArrayAdapter";
    ArrayList<String> discounts;

    public DiscountArrayAdapter(Context context, int layoutId, ArrayList<String> discounts) {
        super(context, layoutId, discounts);
        this.discounts = discounts;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //return super.getView(position, convertView, parent);

        View v = convertView;

        // Check if an existing view is being reused, otherwise inflate the view
        if (v == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.activity_listview, null);
        }
        // Lookup view for data population
        TextView discountText = (TextView) v.findViewById(R.id.labelDiscount);

        // Populate the data into the template view using the data object
        discountText.setText(discounts.get(position));
        //Log.d(TAG, "getView: some tag: " + discountText.getText().toString());


        // Return the completed view to render on screen
        return v;
    }

}
