package com.sf.hackday.goodneighbor.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sf.hackday.goodneighbor.R;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by stephenyoung on 6/15/16.
 */
public class DiscountArrayAdapter extends ArrayAdapter<String> {


    private static final String TAG = "DiscountArrayAdapter";
    ArrayList<String> title;
    Map<Integer, Drawable> images;

    public DiscountArrayAdapter(Context context, int layoutId, ArrayList<String> titles) {
        super(context, layoutId, titles);
        this.title = titles;
    }
    public DiscountArrayAdapter(Context context, int layoutId, ArrayList<String> discounts, Map<Integer, Drawable> images) {
        super(context, layoutId, discounts);
        this.title = discounts;
        this.images = images;
    }

    @Override
    public String getItem(int position) {
        return title.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //return super.getView(position, convertView, parent);

        View v = convertView;

        // Check if an existing view is being reused, otherwise inflate the view
        if (v == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.list_item_card, null);
        }
        // Lookup view for data population
        TextView discountText = (TextView) v.findViewById(R.id.card_text);
        ImageView imageText = (ImageView) v.findViewById(R.id.card_image);

        // Populate the data into the template view using the data object
        discountText.setText(title.get(position));
        imageText.setBackground(images.get(position));
        //Log.d(TAG, "getView: some tag: " + discountText.getText().toString());


        // Return the completed view to render on screen
        return v;
    }

}
