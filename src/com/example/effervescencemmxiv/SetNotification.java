package com.example.effervescencemmxiv;

import android.app.Activity;
import android.os.Bundle;
import java.util.Calendar;
import java.util.Random;

import android.app.ActionBar;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;
 
public class SetNotification extends Activity {    
    TimePicker timePicker;
    DatePicker datePicker;
    Random random = new Random();
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_notification);
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        Intent i = getIntent();
		Bundle b = i.getExtras();
		final String event = b.getString("event");
		final String address = b.getString("address");
        //---Button view---
        Button btnOpen = (Button) findViewById(R.id.btnSetAlarm);
        btnOpen.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
            	int randomInteger = random.nextInt();
            	//randomInteger = randomInteger%100;
            	//if(randomInteger < 0)randomInteger = randomInteger + 100;
            	
            	//String s = Integer.toString(randomInteger);
            	//Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
                timePicker = (TimePicker) findViewById(R.id.timePicker);
                datePicker = (DatePicker) findViewById(R.id.datePicker);                   
 
                //---use the AlarmManager to trigger an alarm---
                AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);                 
 
                //---get current date and time---
                Calendar calendar = Calendar.getInstance();       
 
                //---sets the time for the alarm to trigger---
                calendar.set(Calendar.YEAR, datePicker.getYear());
                calendar.set(Calendar.MONTH, datePicker.getMonth());
                calendar.set(Calendar.DAY_OF_MONTH, datePicker.getDayOfMonth());                 
                calendar.set(Calendar.HOUR_OF_DAY, timePicker.getCurrentHour());
                calendar.set(Calendar.MINUTE, timePicker.getCurrentMinute());
                calendar.set(Calendar.SECOND, 0);
                
                //---PendingIntent to launch activity when the alarm triggers---                    
                Intent i = new Intent("com.example.effervescencemmxiv.DN");
                i.putExtra("event", event);
                i.putExtra("address", address);
                //---assign an ID of 1---
                i.putExtra("NotifID", randomInteger);                                
 
                PendingIntent displayIntent = PendingIntent.getActivity(
                    getBaseContext(), randomInteger, i, PendingIntent.FLAG_ONE_SHOT);               
 
                //---sets the alarm to trigger---
                alarmManager.set(AlarmManager.RTC_WAKEUP, 
                    calendar.getTimeInMillis(), displayIntent);
            }
        }); 
        
    }
    
    public boolean onOptionsItemSelected(MenuItem item){
	    /*Intent myIntent = new Intent(getApplicationContext(), Eventsbyday.class);
	    startActivityForResult(myIntent, 0);*/
		finish();
	    return true;
	}
}
