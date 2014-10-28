package com.example.effervescencemmxiv;


import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;


public class EventsByCategories extends Activity implements OnClickListener {

	ImageView music, dance, drama, lit, online, informal,management,pronight;
	TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8;
	
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_events_by_category);
      music = (ImageView)findViewById(R.id.imageView1);
      dance = (ImageView)findViewById(R.id.imageView2);
      drama = (ImageView)findViewById(R.id.imageView3);
      lit = (ImageView)findViewById(R.id.imageView4);
      informal = (ImageView)findViewById(R.id.imageView5);
      online = (ImageView)findViewById(R.id.imageView6);
      management = (ImageView)findViewById(R.id.imageView7);
      pronight = (ImageView)findViewById(R.id.imageView8);
      //ActionBar actionBar = getActionBar();
      //actionBar.setDisplayHomeAsUpEnabled(true);
      music.setOnClickListener(this);
      dance.setOnClickListener(this);
      drama.setOnClickListener(this);
      lit.setOnClickListener(this);
      informal.setOnClickListener(this);
      online.setOnClickListener(this);
      management.setOnClickListener(this);
      pronight.setOnClickListener(this);
      Typeface tf = Typeface.createFromAsset(getAssets(),
              "MYRIADPROREGULAR.ttf");
      tv1 = (TextView) findViewById(R.id.textView1);
      tv2 = (TextView) findViewById(R.id.textView2);
      tv3 = (TextView) findViewById(R.id.textView3);
      tv4 = (TextView) findViewById(R.id.textView4);
      tv5 = (TextView) findViewById(R.id.textView5);
      tv6 = (TextView) findViewById(R.id.textView6);
      tv7 = (TextView) findViewById(R.id.textView7);
      tv8 = (TextView) findViewById(R.id.textView8);
      tv1.setTypeface(tf);
      tv2.setTypeface(tf);
      tv3.setTypeface(tf);
      tv4.setTypeface(tf);
      tv5.setTypeface(tf);
      tv6.setTypeface(tf);
      tv7.setTypeface(tf);
      tv8.setTypeface(tf);
   }
   
   public boolean onOptionsItemSelected(MenuItem item){
	    Intent myIntent = new Intent(getApplicationContext(), Effervescence.class);
	    startActivityForResult(myIntent, 0);
		finish();
	    return true;
	}
   
   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.events_by_category, menu);
      return true;
   }

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){
		case R.id.imageView1:
			Intent it = new Intent("com.example.effervescencemmxiv.MUS");
			startActivity(it);
			finish();
			break;
		case R.id.imageView2:
			Intent it1 = new Intent("com.example.effervescencemmxiv.DAN");
			startActivity(it1);
			finish();
			break;
		case R.id.imageView3:
			Intent it2 = new Intent("com.example.effervescencemmxiv.DRA");
			startActivity(it2);
			finish();
			break;
		case R.id.imageView4:
			Intent it3 = new Intent("com.example.effervescencemmxiv.LIT");
			startActivity(it3);
			finish();
			break;
		case R.id.imageView5:
			Intent it4 = new Intent("com.example.effervescencemmxiv.INF");
			startActivity(it4);
			finish();
			break;
		case R.id.imageView6:
			Intent it5 = new Intent("com.example.effervescencemmxiv.ONL");
			startActivity(it5);
			finish();
			break;	
		case R.id.imageView7:
			Intent it6 = new Intent("com.example.effervescencemmxiv.MAN");
			startActivity(it6);
			finish();
			break;	
		case R.id.imageView8:
			Intent it7 = new Intent("com.example.effervescencemmxiv.PRO");
			startActivity(it7);
			finish();
			break;	
		
		}
	}
}
