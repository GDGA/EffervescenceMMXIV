package com.example.effervescencemmxiv;

import com.example.effervescencemmxiv.R;

import android.content.Intent;
import android.os.Bundle;

import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Day1 extends ListFragment{

	String list[] = new String[]{
			"\nTreasure Hunt\n",
            "\nMUN\n",
            "\nGully Cricket\n",
            "\nRoadies\n",
            "\nGamer's Asylum\n",
            "\nAntakshari\n",
            "\nCompleting The Poster\n",
            "\nRanneeti\n",
            "\nBlind Date\n",
            "\nAnime Quiz\n",
            "\nStreet Soccer\n",
            "\nCarpe Diem\n",
            "\nLa Frenze\n",
            "\nInnovation\n",
            "\nPsychadelia\n",
            "\nPerplexus\n",
            "\nKonqueror\n",
            "\nSilverScreen\n",
            "\nPillow Attack\n",
           
    };
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		if (position == 14) {
			startActivity(new Intent("com.example.effervescencemmxiv.PSY"));
		}
		else if(position == 1) {
			startActivity(new Intent("com.example.effervescencemmxiv.MUN"));
		}
		else if(position == 3) {
			startActivity(new Intent("com.example.effervescencemmxiv.ROA"));
		}
		else if(position == 2) {
			startActivity(new Intent("com.example.effervescencemmxiv.GUL"));
		}
		else if(position == 10) {
			startActivity(new Intent("com.example.effervescencemmxiv.STR"));
		}
		else if(position == 4) {
			startActivity(new Intent("com.example.effervescencemmxiv.GAM"));
		}
		else if(position == 11) {
			startActivity(new Intent("com.example.effervescencemmxiv.CAR"));
		}
		else if(position == 12) {
			startActivity(new Intent("com.example.effervescencemmxiv.LAF"));
		}
		else if(position == 13) {
			startActivity(new Intent("com.example.effervescencemmxiv.DRAM"));
		}
		else if(position == 8) {
			startActivity(new Intent("com.example.effervescencemmxiv.BLI"));
		}
		else if(position == 5) {
			startActivity(new Intent("com.example.effervescencemmxiv.ANT"));
		}
		else if(position == 15) {
			startActivity(new Intent("com.example.effervescencemmxiv.PER"));
		}
		else if(position == 16) {
			startActivity(new Intent("com.example.effervescencemmxiv.KON"));
		}
		else if(position == 7) {
			startActivity(new Intent("com.example.effervescencemmxiv.RAN"));
		}
		else if(position == 9) {
			startActivity(new Intent("com.example.effervescencemmxiv.ANI"));
		}
		else if(position == 18) {
			startActivity(new Intent("com.example.effervescencemmxiv.PIL"));
		}
		else if(position == 6) {
			startActivity(new Intent("com.example.effervescencemmxiv.COM"));
		}
		else if(position == 0) {
			startActivity(new Intent("com.example.effervescencemmxiv.TRE"));
		}
		else if(position == 17) {
			startActivity(new Intent("com.example.effervescencemmxiv.SIL"));
		}
	}
	//ListView List;
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		//List = (ListView) findViewById(android.R.id.list);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getBaseContext(), R.layout.custom_layout, list);
        setListAdapter(adapter);
 
       // View rootView = inflater.inflate(R.layout.activity_day1, container, false);
         
        //return rootView;
        return super.onCreateView(inflater, container, savedInstanceState);
    }
	@Override
	    public void onStart() {     
	     super.onStart();
	        getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
	 
	    } 
}
