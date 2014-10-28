package com.example.effervescencemmxiv;

import android.app.ActionBar;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
//import android.support.v4.app.ListFragment;
//import android.view.LayoutInflater;
import android.view.View;
//import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Informal extends ListActivity {

	
	String list[] = new String[]{
			 "\nGame of Thrones Quiz\n",
	            "\nStreet Soccer\n",
	            "\nBasket Ball\n",
	            "\nTreasure Hunt\n",
	            "\nBindaas Bol\n",
	            "\nArm Wrestling\n",
	            "\nChinaTown\n",
	            "\nAnime Quiz\n",
	            "\nCollage\n",
	            "\nGully Cricket\n",
	            "\nBlind Date\n",
	            "\nGamer's Asylum\n",
	            "\nBollywood Tambola\n",
	            "\nRoadies\n",
	            "\nTattoo Painting\n",
	            "\nTug of War\n",
	            "\nTongues on Fire\n",
	            "\nFriends Quiz\n",
	            "\nCompleting The Poster\n",
	            "\nPillow Attack\n",
	            "\nBasketBall\n",
	            "\nGraffiti\n",
	            "\nBook Cricket\n",
	            "\nCricket Quiz\n",
	            "\nBalloon Fight\n",
	            "\nSilver Screen\n"
    
            
    };
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_favourite_events);
				//tv = (TextView) findViewById(R.id.tvinfo);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(Informal.this, R.layout.custom_layout, list);
        setListAdapter(adapter);
		//setListAdapter(new ArrayAdapter <String>(FavouriteEvents.this, android.R.layout.simple_list_item_1, s));		
				
		}
	
	public boolean onOptionsItemSelected(MenuItem item){
	    Intent myIntent = new Intent(getApplicationContext(), EventsByCategories.class);
	    startActivityForResult(myIntent, 0);
		finish();
	    return true;
	}
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		if (position == 0) {
			startActivity(new Intent("com.example.effervescencemmxiv.GOT"));
		}
		else if(position == 1) {
			startActivity(new Intent("com.example.effervescencemmxiv.STR"));
		}
		else if(position == 2) {
			startActivity(new Intent("com.example.effervescencemmxiv.BAS"));
		}
		else if(position == 3) {
			startActivity(new Intent("com.example.effervescencemmxiv.TRE"));
		}
		else if(position == 4) {
			startActivity(new Intent("com.example.effervescencemmxiv.BIN"));
		}
		else if(position == 5) {
			startActivity(new Intent("com.example.effervescencemmxiv.BIN"));
		}
		else if(position == 6) {
			startActivity(new Intent("com.example.effervescencemmxiv.CHI"));
		}
		else if(position == 7) {
			startActivity(new Intent("com.example.effervescencemmxiv.ANI"));
		}
		else if(position == 8) {
			startActivity(new Intent("com.example.effervescencemmxiv.COL"));
		}
		else if(position == 9) {
			startActivity(new Intent("com.example.effervescencemmxiv.GUL"));
		}
		else if(position == 10) {
			startActivity(new Intent("com.example.effervescencemmxiv.BLI"));
		}
		else if(position == 11) {
			startActivity(new Intent("com.example.effervescencemmxiv.GAM"));
		}
		else if(position == 12) {
			startActivity(new Intent("com.example.effervescencemmxiv.BOL"));
		}
		else if(position == 13) {
			startActivity(new Intent("com.example.effervescencemmxiv.ROA"));
		}
		else if(position == 14) {
			startActivity(new Intent("com.example.effervescencemmxiv.TAT"));
		}
		else if(position == 15) {
			startActivity(new Intent("com.example.effervescencemmxiv.TUG"));
		}
		else if(position == 16) {
			startActivity(new Intent("com.example.effervescencemmxiv.TON"));
		}
		else if(position == 17) {
			startActivity(new Intent("com.example.effervescencemmxiv.THR"));
		}
		else if(position == 18) {
			startActivity(new Intent("com.example.effervescencemmxiv.COM"));
		}
		else if(position == 19) {
			startActivity(new Intent("com.example.effervescencemmxiv.PIL"));
		}
		else if(position == 20) {
			startActivity(new Intent("com.example.effervescencemmxiv.BAS"));
		}
		else if(position == 21) {
			startActivity(new Intent("com.example.effervescencemmxiv.GRA"));
		}
		else if(position == 22) {
			startActivity(new Intent("com.example.effervescencemmxiv.BOO"));
		}
		else if(position == 23) {
			startActivity(new Intent("com.example.effervescencemmxiv.CRI"));
		}
		else if(position == 24) {
			startActivity(new Intent("com.example.effervescencemmxiv.BAL"));
		}
		else if(position == 25) {
			startActivity(new Intent("com.example.effervescencemmxiv.SIL"));
		}
	
	}
	//ListView List;
	
	@Override
	    public void onStart() {     
	     super.onStart();
	        getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
	 
	    } 

}
