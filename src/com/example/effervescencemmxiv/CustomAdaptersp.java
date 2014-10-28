package com.example.effervescencemmxiv;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdaptersp extends BaseAdapter {

 Context context;
 List<RowItem> rowItem;
	TextView tv1, tv2;

 CustomAdaptersp(Context context, List<RowItem> rowItem) {
  this.context = context;
  this.rowItem = rowItem;
 }


 @Override
 public View getView(int position, View convertView, ViewGroup parent) {

if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) context
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.drawer_list_item, null);
        }
		

        ImageView imgIcon = (ImageView) convertView.findViewById(R.id.icon);
//    	Typeface tf1 = Typeface.createFromAsset(context.getAssets(),
//                "MYRIADPROREGULAR.ttf");
    	Typeface tf = Typeface.createFromAsset(context.getAssets(),
                "MyriadPro-Light.ttf");
        TextView txtTitle = (TextView) convertView.findViewById(R.id.title);
//        
        txtTitle.setTypeface(tf);
        
        RowItem row_pos = rowItem.get(position);
        // setting the image resource and title
        imgIcon.setImageResource(row_pos.getIcon());
        txtTitle.setText(row_pos.getTitle());

        return convertView;
 }


	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return rowItem.size();
	}
	
	
	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return rowItem.get(position);
	}
	
	
	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return rowItem.indexOf(getItem(position));
	}
}