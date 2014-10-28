package com.example.effervescencemmxiv;

import java.util.ArrayList;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class ContactUs extends Activity implements OnItemClickListener {
	
	ListView list;
    CustomAdapter adapter;
    public  ContactUs CustomListView = null;
    public  ArrayList<ListModel> CustomListViewValuesArr = new ArrayList<ListModel>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contact_us);
		//Intent it = getIntent();
		//Bundle b = it.getExtras();
		CustomListView = this;
        setListData();
        //ActionBar actionBar = getActionBar();
		//actionBar.setDisplayHomeAsUpEnabled(true);
        Resources res = getResources();
        list = ( ListView )findViewById( R.id.list ); 
         
        adapter=new CustomAdapter( CustomListView, CustomListViewValuesArr,res, getApplicationContext());
        list.setAdapter( adapter );
        list.setOnItemClickListener(this);
	}
	
	public boolean onOptionsItemSelected(MenuItem item){
	    Intent myIntent = new Intent(getApplicationContext(), Effervescence.class);
	    startActivityForResult(myIntent, 0);
		//finish();
	    return true;
	}
	
    public void setListData()
    {
             
            final ListModel sched = new ListModel();
                  
            sched.setName("Ashar Ali");
            sched.setPost("Coordinator");
            sched.setPhone("09675211118");
            sched.setEmail("ashar.ali.06@gmail.com");
                
            CustomListViewValuesArr.add( sched );
        
            final ListModel sched1 = new ListModel();
            
            sched1.setName("Shubham Mehrotra");
            sched1.setPost("Coordinator");
            sched1.setPhone("09936013475");
            sched1.setEmail("shubhammehrotra94@gmail.com");
                
            CustomListViewValuesArr.add( sched1 );
     
            final ListModel sched2 = new ListModel();
            
            sched2.setName("Dhruv Kumar");
            sched2.setPost("Head, Events");
            sched2.setPhone("09532991404");
            sched2.setEmail("ddhruvkr@gmail.com");
                
            CustomListViewValuesArr.add( sched2 );
            final ListModel sched3 = new ListModel();
            
            sched3.setName("Ronish Kalia");
            sched3.setPost("Head, Finance");
            sched3.setPhone("09005800306");
            sched3.setEmail("kalia.ronish09@gmail.com");
                
            CustomListViewValuesArr.add( sched3 );
            
            final ListModel sched4 = new ListModel();
            
            sched4.setName("Karnika Singh");
            sched4.setPost("Head, Public Relations");
            sched4.setPhone("08765951361");
            sched4.setEmail("karniksingh10@gmail.com");
                
            CustomListViewValuesArr.add( sched4 );
    }
    

   /* public void onItemClick(int mPosition)
    {
        ListModel tempValues = ( ListModel ) CustomListViewValuesArr.get(mPosition);

        
       // SHOW ALERT                  

        Toast.makeText(CustomListView,
        tempValues.getName()+"\n" + tempValues.getPost()+"\n"
        +tempValues.getPhone()+"\n"+tempValues.getEmail(),
        Toast.LENGTH_LONG).show();
    }*/
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.contact_us, menu);
		return true;
	}


	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
		// TODO Auto-generated method stub
		final ListModel tempValues = ( ListModel ) CustomListViewValuesArr.get(position);
		AlertDialog.Builder builder = null;
		if(Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB) {
		    builder = new AlertDialog.Builder(ContactUs.this);
		} else {
//		    builder = new AlertDialog.Builder(ContactUs.this, AlertDialog.THEME_HOLO_LIGHT);
			builder = new AlertDialog.Builder(ContactUs.this, AlertDialog.THEME_DEVICE_DEFAULT_LIGHT);
			//builder = new AlertDialog.Builder(ContactUs.this, AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		}
		builder.setTitle(tempValues.getName());
        builder.setMessage("Select the way you want to proceed");
        builder.setPositiveButton("Call", new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface arg0, int arg1) {
            // TODO Auto-generated method stub
            //Toast.makeText(getApplicationContext(), "Ok is clicked", Toast.LENGTH_LONG).show();
        	Intent callIntent = new Intent(Intent.ACTION_CALL);
      		callIntent.setData(Uri.parse("tel:"+tempValues.getPhone()));
      		startActivity(callIntent);
          }
        });
        builder.setNegativeButton("Message", new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface arg0, int arg1) {
            // TODO Auto-generated method stub
        	  try {
        		  
				     Intent sendIntent = new Intent(Intent.ACTION_VIEW);
				     sendIntent.putExtra("address", tempValues.getPhone());
				     sendIntent.setType("vnd.android-dir/mms-sms");
				     startActivity(sendIntent);

				} catch (Exception e) {
					Toast.makeText(getApplicationContext(),
						"SMS faild, please try again later!",
						Toast.LENGTH_LONG).show();
					e.printStackTrace();
				}
            //Toast.makeText(getApplicationContext(), "Cancel is clicked", Toast.LENGTH_LONG).show();
          }
        });
        builder.setNeutralButton("E-mail", new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface arg0, int arg1) {
            // TODO Auto-generated method stub
        	String emailaddress[] = {tempValues.getEmail()};
      		Intent emailintent = new Intent(android.content.Intent.ACTION_SEND);
      		emailintent.putExtra(android.content.Intent.EXTRA_EMAIL, emailaddress);
      		emailintent.setType("plain/text");
      		startActivity(emailintent);
            //Toast.makeText(getApplicationContext(), "Close is clicked", Toast.LENGTH_LONG).show();
          }
        });
        builder.show(); //To show the AlertDialog
      }
}
