package com.example.effervescencemmxiv;


import java.util.ArrayList;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FavouriteEvents extends Activity {

	ArrayList<String> s, s1;
	ListView lv;
	int c;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_favourite_events);
				//tv = (TextView) findViewById(R.id.tvinfo);
		Favourites info = new Favourites(this);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		info.openandwrite();
		s = info.getData(0);
		s1 = info.getData(1);
		//String s1 = info.getData(1);
		info.close();
		c = s.size();
		lv = (ListView)findViewById(R.id.listView1);
		//String ex[] = {"1", "2", "3", s};
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(FavouriteEvents.this, R.layout.custom_layout, R.id.tv, s);
		//ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, s);
        lv.setAdapter(adapter);
		//setListAdapter(new ArrayAdapter <String>(FavouriteEvents.this, android.R.layout.simple_list_item_1, s));
        lv.setOnItemClickListener(new OnItemClickListener() {
        	 
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
               int position, long id) {
            	String s2 = s1.get(position); 
        		startActivity(new Intent(s2));
                        
            }

       }); 
       }

	/*@Override
    public void onStart() {     
     super.onStart();
        getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
 
    }*/
	

	@Override
	public boolean onOptionsItemSelected(MenuItem item){
	    Intent myIntent = new Intent(getApplicationContext(), Effervescence.class);
	    startActivityForResult(myIntent, 0);
		finish();
	    return true;
	}
	
	/*@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
	}*/




	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.favourite_events, menu);
		return true;
	}

}
