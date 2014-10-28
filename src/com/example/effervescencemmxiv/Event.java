package com.example.effervescencemmxiv;

import android.app.ActionBar;
import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.effervescencemmxiv.R;

public class Event extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_event);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		if (Context.NOTIFICATION_SERVICE!=null) {
            String ns = Context.NOTIFICATION_SERVICE;
            NotificationManager nMgr = (NotificationManager) getApplicationContext().getSystemService(ns);
            nMgr.cancel(getIntent().getExtras().getInt("NotifID"));
        }
		/*NotificationManager nm = (NotificationManager) 
	            getSystemService(NOTIFICATION_SERVICE);
	 
	        //---cancel the notification---
	        nm.cancel(getIntent().getExtras().getInt("NotifID"));*/ 
		Intent it = new Intent(getIntent().getExtras().getString("address"));
		startActivity(it);
		finish();
	}

	public boolean onOptionsItemSelected(MenuItem item){
	    Intent myIntent = new Intent(getApplicationContext(), Effervescence.class);
	    startActivityForResult(myIntent, 0);
		//finish();
	    return true;
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.event, menu);
		return true;
	}

}