package com.example.effervescencemmxiv;


import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint("DefaultLocale")
public class Trash extends Activity implements OnClickListener, OnCheckedChangeListener {

	String[] phone1;
	Button b, b1;
	CheckBox cb;
	ImageView iv1, iv2;
	boolean diditwork = true;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_trash);
		TextView tv1, tv2,tv3,tv4,tv9;
		Typeface tf1 = Typeface.createFromAsset(getAssets(),
                "MYRIADPROREGULAR.ttf");
		Typeface tf = Typeface.createFromAsset(getAssets(),
                "MyriadPro-Light.ttf");
        tv2 = (TextView) findViewById(R.id.textView2);
        tv1 = (TextView) findViewById(R.id.textView1);
        tv3 = (TextView) findViewById(R.id.textView3);
        tv4 = (TextView) findViewById(R.id.textView8);
        tv9 = (TextView) findViewById(R.id.textView9);
        tv1.setTypeface(tf1);
        tv2.setTypeface(tf);
        tv3.setTypeface(tf1);
        tv4.setTypeface(tf1);
        tv9.setTypeface(tf);
        
        String organiser1 = tv9.getText().toString();
 		phone1 = organiser1.split(":");
 		tv9.setOnClickListener(this);
 		
        iv1 = (ImageView)findViewById(R.id.imageView3);
        iv2 = (ImageView)findViewById(R.id.imageView1);
		//ActionBar actionBar = getActionBar();
		//actionBar.setDisplayHomeAsUpEnabled(true);
		cb = (CheckBox) findViewById(R.id.checkBox1);
		iv1.setOnClickListener(this);
		iv2.setOnClickListener(this);
		cb.setOnClickListener(this);
		cb.setChecked(getFromSP("tra"));
		cb.setOnCheckedChangeListener(this);
	}

	private boolean getFromSP(String key){
        SharedPreferences preferences = getApplicationContext().getSharedPreferences("effervescencemmxiv", android.content.Context.MODE_PRIVATE);
        return preferences.getBoolean(key, false);
        }
        private void saveInSp(String key,boolean value){
        SharedPreferences preferences = getApplicationContext().getSharedPreferences("effervescencemmxiv", android.content.Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(key, value);
        editor.commit();
        }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.trash, menu);
		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item){
	    Intent myIntent = new Intent(getApplicationContext(), Eventsbyday.class);
	    startActivityForResult(myIntent, 0);
		finish();
	    return true;
	}
	
	@SuppressLint("DefaultLocale")
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
			case R.id.checkBox1:
				if(cb.isChecked()){
						try{
							Favourites entry = new Favourites(Trash.this);	
							entry.openandwrite();
							entry.createEntry("Trash Talk", "com.example.effervescencemmxiv.TRA");
							entry.close();
						}catch(Exception e){
							diditwork = false;
							String error = e.toString();
							Toast.makeText(getApplicationContext(), error, Toast.LENGTH_SHORT).show();
						}finally{
							if(diditwork) {	
								//Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_SHORT).show();
							}
						}
						break;
				}
				else {
					try{
						Favourites entry = new Favourites(Trash.this);	
						entry.openandwrite();
						entry.deleteTitleGivenName("Trash Talk");
						entry.close();
					}catch(Exception e){
						String error = e.toString();
						Toast.makeText(getApplicationContext(), error, Toast.LENGTH_SHORT).show();
					}
					break;
				}
		case R.id.imageView1:
			String str = "Trash Talk";
			Intent it = new Intent("com.example.effervescencemmxiv.SN");
			it.putExtra("event", str);
			it.putExtra("address", "com.example.effervescencemmxiv.TRA");
			startActivity(it);
			break;
		case R.id.imageView3:
			LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);

	        // Creating a criteria object to retrieve provider
	        Criteria criteria = new Criteria();

	        // Getting the name of the best provider
	        String provider = locationManager.getBestProvider(criteria, true);

	        // Getting Current Location
	        Location location = locationManager.getLastKnownLocation(provider);
	        
	        String s = "25.43123,81.77114,17";
	        if(location!=null){
	        	double lat = location.getLatitude();
	            double lon = location.getLongitude();
	            s = "";
	            s = String.format("%f,%f", lat, lon);
	        }
	        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, 
	        Uri.parse("http://maps.google.com/maps?saddr=" + s + "&daddr=25.429050, 81.771413"));
	        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");	
	        startActivity(intent);
	        break;
		case R.id.textView9:
  			Intent callIntent = new Intent(Intent.ACTION_CALL);
  			callIntent.setData(Uri.parse("tel:+91" + phone1[1].trim()));
  			startActivity(callIntent);
  			break;
		}
	}

	@Override
	public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
		// TODO Auto-generated method stub
		
		saveInSp("tra",arg1);
	}
}
