package com.example.effervescencemmxiv;


import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter{
    
    private Activity activity;
    private ArrayList<?> data;
    private static LayoutInflater inflater=null;
    public Resources res;
    Context context;
    ListModel tempValues=null;
    int i=0;
    
 
    public CustomAdapter(ContactUs customListView,
			ArrayList<ListModel> customListViewValuesArr, Resources res2,
			Context applicationContext) {
		// TODO Auto-generated constructor stub
        activity = customListView;
        data=customListViewValuesArr;
        res = res2;
       this.context = applicationContext;
        inflater = ( LayoutInflater )activity.
                                     getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    
	}

	public int getCount() {
         
        if(data.size()<=0)
            return 1;
        return data.size();
    }
 
    public Object getItem(int position) {
        return position;
    }
 
    public long getItemId(int position) {
        return position;
    }
     
    public static class ViewHolder{
         
        public TextView name;
        public TextView phone;
        public TextView post;
        public TextView email;
 
    }
 
   
    public View getView(int position, View convertView, ViewGroup parent) {
         
        View vi = convertView;
        ViewHolder holder;
         
        if(convertView==null){     
            /****** Inflate tabitem.xml file for each row ( Defined below ) *******/
            vi = inflater.inflate(R.layout.listconfig, null);
             
            /****** View Holder Object to contain tabitem.xml file elements ******/
            Typeface tf1 = Typeface.createFromAsset(context.getAssets(),
                    "MYRIADPROREGULAR.ttf");
        	Typeface tf = Typeface.createFromAsset(context.getAssets(),
                    "MyriadPro-Light.ttf");       
        	
            holder = new ViewHolder();
            holder.name = (TextView) vi.findViewById(R.id.Name);
            holder.post=(TextView)vi.findViewById(R.id.Post);
            holder.phone = (TextView) vi.findViewById(R.id.Phone);
            holder.email=(TextView)vi.findViewById(R.id.Email);
            
            //holder.image=(ImageView)vi.findViewById(R.id.image);
          
             
           /************  Set holder with LayoutInflater ************/
            vi.setTag( holder );
            holder.name.setTypeface(tf1);
            holder.post.setTypeface(tf);
            holder.phone.setTypeface(tf);
            holder.email.setTypeface(tf);
            
        }
        else 
            holder=(ViewHolder)vi.getTag();
         
        if(data.size()<=0)
        {
            holder.name.setText("No Data");
             
        }
        else
        {
            tempValues=null;
            tempValues = ( ListModel ) data.get( position );
             

             holder.name.setText( tempValues.getName());
             holder.post.setText( tempValues.getPost());
             holder.phone.setText( tempValues.getPhone());
             holder.email.setText( tempValues.getEmail());
             
             

             
             /*holder.image.setImageResource(
                          res.getIdentifier(
                          "com.androidexample.customlistview:drawable/"+tempValues.getImage()
                          ,null,null));*/
              
            // vi.setOnClickListener(new OnItemClickListener(position));
             //vi.setOnClickListener(new OnItemClickListener( position ));
        }
        return vi;
    }

	/*private class OnItemClickListener implements android.view.View.OnClickListener{
		private int mposition;
		OnItemClickListener(int position){
			mposition = position;
		}
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			public  MainBody CustomListView = null;
			public  ArrayList<ListModel> CustomListViewValuesArr = new ArrayList<ListModel>();
			MainBody obj = new MainBody();
			obj.onItemClick(mposition);
		}
	}
     */
               
    
   
}
