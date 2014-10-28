package com.example.effervescencemmxiv;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutUs extends Activity {

	TextView tv2, tv1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about_us);
		
		ImageView iv1 = (ImageView)findViewById(R.id.imageView1);
		ImageView iv4 = (ImageView)findViewById(R.id.imageView4);
		Typeface tf1 = Typeface.createFromAsset(getAssets(),
                "MyriadPro-Light.ttf");
        tv2 = (TextView) findViewById(R.id.textView1);
        tv2.setTypeface(tf1);
        Typeface tf2 = Typeface.createFromAsset(getAssets(),
                "MYRIADPROREGULAR.ttf");
        tv1 = (TextView) findViewById(R.id.textView5);
        tv1.setTypeface(tf2);
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.about_us, menu);
		return true;
	}
	public void facebook(View v){
		Uri uri = Uri.parse("http://www.facebook.com/effervescence.iiita");
		Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		startActivity(intent);
	}
	public void website(View v){
		Uri uri = Uri.parse("http://www.http://effervescence.iiita.ac.in/effe/index.php");
		Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		startActivity(intent);
	}
}
