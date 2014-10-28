package com.example.effervescencemmxiv;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Developers extends Activity {

	TextView tv2, tv7, tv3, tv4, tv6;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		tv2 = (TextView) findViewById(R.id.t2);
		tv7 = (TextView) findViewById(R.id.t7);
		tv3 = (TextView) findViewById(R.id.t3);
		tv4 = (TextView) findViewById(R.id.t4);
		tv6 = (TextView) findViewById(R.id.t6);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_developers);
		//ActionBar actionBar = getActionBar();
		//actionBar.setDisplayHomeAsUpEnabled(true);
	}

	public void shubham(View v) {
		Uri uri = Uri.parse("http://www.facebook.com/shubham.mehrotra.961");
		Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		startActivity(intent);
	}

	public void dhruv(View v) {
		Uri uri = Uri.parse("http://www.facebook.com/ddhruvkr?fref=ts");
		Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		startActivity(intent);
	}

	public void ronish(View v) {
		Uri uri = Uri.parse("http://www.facebook.com/ronish.kalia?fref=ts");
		Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		startActivity(intent);
	}

	public void anmol(View v) {
		Uri uri = Uri.parse("http://www.facebook.com/anmol.jagetia?fref=ts");
		Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		startActivity(intent);
	}

	public void gotcha(View v) {
		Uri uri = Uri.parse("http://www.facebook.com/kumar.sanyam?fref=ts");
		Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		startActivity(intent);
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		Intent myIntent = new Intent(getApplicationContext(),
				Effervescence.class);
		startActivityForResult(myIntent, 0);
		finish();
		return true;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.developers, menu);
		return true;
	}

}