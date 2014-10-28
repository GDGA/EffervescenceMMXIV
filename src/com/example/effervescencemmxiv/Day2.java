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

public class Day2 extends ListFragment{

	String list[] = new String[]{
            "\nMUN\n",
            "\nRoadies\n",
            "\nTattoo Painting\n",
            "\nPlatzen\n",
            "\nStegolica\n",
            "\nGamer's Asylum\n",
            "\nFriends Quiz\n",
            "\nGame Of Thrones Quiz\n",
            "\nChinaTown\n",
            "\nBasket Ball\n",
            "\nB Quiz\n",
            "\nMelodieux\n",
            "\nTongues On Fire\n",
            "\nFootloose\n",
            "\nAla Mode\n",
            "\nIncendiary\n",
            "\nGraffiti\n",
            "\nKaraoke\n",
            "\nAd Mania\n",
            "\nDumb Charades\n",
            "\nBook Cricket\n",
            "\nFeathers\n",
            "\nSilver Screen\n"
            
    };
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		if (position == 0) {
			startActivity(new Intent("com.example.effervescencemmxiv.MUN"));
		}
		else if(position == 1) {
			startActivity(new Intent("com.example.effervescencemmxiv.ROA"));
		}
		else if(position == 2) {
			startActivity(new Intent("com.example.effervescencemmxiv.TAT"));
		}
		else if(position == 4) {
			startActivity(new Intent("com.example.effervescencemmxiv.STE"));
		}
		else if(position == 7) {
			startActivity(new Intent("com.example.effervescencemmxiv.GOT"));
		}
		else if(position == 8) {
			startActivity(new Intent("com.example.effervescencemmxiv.CHI"));
		}
		else if(position == 12) {
			startActivity(new Intent("com.example.effervescencemmxiv.TON"));
		}
		else if(position == 3) {
			startActivity(new Intent("com.example.effervescencemmxiv.PLA"));
		}
		else if(position == 10) {
			startActivity(new Intent("com.example.effervescencemmxiv.BQU"));
		}
		else if(position == 6) {
			startActivity(new Intent("com.example.effervescencemmxiv.THR"));
		}
		else if(position == 5) {
			startActivity(new Intent("com.example.effervescencemmxiv.GAM"));
		}
		else if(position == 9) {
			startActivity(new Intent("com.example.effervescencemmxiv.BAS"));
		}
		else if(position == 13) {
			startActivity(new Intent("com.example.effervescencemmxiv.FOO"));
		}
		else if(position == 11) {
			startActivity(new Intent("com.example.effervescencemmxiv.MEL"));
		}
		else if(position == 14) {
			startActivity(new Intent("com.example.effervescencemmxiv.ALA"));
		}
		else if(position == 15) {
			startActivity(new Intent("com.example.effervescencemmxiv.INC"));
		}
		else if(position == 16) {
			startActivity(new Intent("com.example.effervescencemmxiv.GRA"));
		}
		else if(position == 17) {
			startActivity(new Intent("com.example.effervescencemmxiv.KAR"));
		}
		else if(position == 18) {
			startActivity(new Intent("com.example.effervescencemmxiv.ADM"));
		}
		else if(position == 19) {
			startActivity(new Intent("com.example.effervescencemmxiv.DUM"));
		}
		else if(position == 20) {
			startActivity(new Intent("com.example.effervescencemmxiv.BOO"));
		}
		else if(position == 21) {
			startActivity(new Intent("com.example.effervescencemmxiv.FEA"));
		}
		else if(position == 22) {
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
