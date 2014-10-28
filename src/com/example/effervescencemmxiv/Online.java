package com.example.effervescencemmxiv;

import android.app.ActionBar;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Online extends ListActivity {

	
	String list[] = new String[]{
			"\nPerplexus\n",
            "\nKonqueror\n",
            "\nPlatzen\n",
            "\nStegolica\n",

    
            
    };
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_favourite_events);
				//tv = (TextView) findViewById(R.id.tvinfo);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(Online.this, R.layout.custom_layout, list);
        setListAdapter(adapter);
		//setListAdapter(new ArrayAdapter <String>(FavouriteEvents.this, android.R.layout.simple_list_item_1, s));		
				
		}
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		if (position == 0) {
			startActivity(new Intent("com.example.effervescencemmxiv.PER"));
		}
		else if(position == 1) {
			startActivity(new Intent("com.example.effervescencemmxiv.KON"));
		}
		else if(position == 2) {
			startActivity(new Intent("com.example.effervescencemmxiv.PLA"));
		}
		else if(position == 3) {
			startActivity(new Intent("com.example.effervescencemmxiv.STE"));
		}
		
		
	
	}
	//ListView List;
	
	public boolean onOptionsItemSelected(MenuItem item){
	    Intent myIntent = new Intent(getApplicationContext(), EventsByCategories.class);
	    startActivityForResult(myIntent, 0);
		finish();
	    return true;
	}
	
	
	@Override
	    public void onStart() {     
	     super.onStart();
	        getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
	 
	    } 

}
