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

public class Day3 extends ListFragment{

	String list[] = new String[]{
           
            "\nDirector's Cut\n",
            "\nTrash Talk\n",
            "\nCricket Quiz\n",
            "\nIntuizione\n",
            "\nBollywood Tambola\n",
            "\nCognoscentia\n",
            "\nTug of War\n",
            "\nDouble Trouble\n",
            "\nBindaas Bol\n",
            "\nUnplugged\n",
            "\nStreet Dance\n",
            "\nArm Wrestling\n",
            "\nCelebrity Night\n",
            "\nDj Night\n",
            "\nBalloon Fight\n",
            "\nKahani\n",
            "\nCollage\n",
            "\nSilver Screen\n"
    };
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		if (position == 0) {
			startActivity(new Intent("com.example.effervescencemmxiv.DIR"));
		}
		else if(position == 8) {
			startActivity(new Intent("com.example.effervescencemmxiv.BIN"));
		}
		else if(position == 4) {
			startActivity(new Intent("com.example.effervescencemmxiv.BOL"));
		}
		else if(position == 3) {
			startActivity(new Intent("com.example.effervescencemmxiv.INT"));
		}
		else if(position == 1) {
			startActivity(new Intent("com.example.effervescencemmxiv.TRA"));
		}
		else if(position == 2) {
			startActivity(new Intent("com.example.effervescencemmxiv.CRI"));
		}
		else if(position == 10) {
			startActivity(new Intent("com.example.effervescencemmxiv.STD"));
		}
		else if(position == 9) {
			startActivity(new Intent("com.example.effervescencemmxiv.UNP"));
		}
		else if(position == 11) {
			startActivity(new Intent("com.example.effervescencemmxiv.ARM"));
		}
		else if(position == 13) {
			startActivity(new Intent("com.example.effervescencemmxiv.DJN"));
		}
		else if(position == 12) {
			startActivity(new Intent("com.example.effervescencemmxiv.CEL"));
		}
		else if(position == 5) {
			startActivity(new Intent("com.example.effervescencemmxiv.COG"));
		}
		else if(position == 6) {
			startActivity(new Intent("com.example.effervescencemmxiv.TUG"));
		}
		else if(position == 7) {
			startActivity(new Intent("com.example.effervescencemmxiv.DOU"));
		}
		else if(position == 14) {
			startActivity(new Intent("com.example.effervescencemmxiv.BAL"));
		}
		else if(position == 15) {
			startActivity(new Intent("com.example.effervescencemmxiv.KAH"));
		}
		else if(position == 16) {
			startActivity(new Intent("com.example.effervescencemmxiv.COL"));
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
