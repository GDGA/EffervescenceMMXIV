package com.example.effervescencemmxiv;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.example.effervescencemmxiv.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class Effervescence extends Activity {

	String[] menutitles;
	TypedArray menuIcons;
	// private String[] mPlanetTitles;
	private DrawerLayout mDrawerLayout;
	private ListView mDrawerList;
	private CharSequence mTitle;
	private ActionBarDrawerToggle mDrawerToggle;
	Button b;
	private List<RowItem> rowItems;
	private CustomAdaptersp adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_effervescence);

		mTitle = "Effervescence";
		menutitles = getResources().getStringArray(R.array.titles);
		menuIcons = getResources().obtainTypedArray(R.array.icons);

		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		mDrawerList = (ListView) findViewById(R.id.left_drawer);
		rowItems = new ArrayList<RowItem>();

		for (int i = 0; i < menutitles.length; i++) {
			RowItem items = new RowItem(menutitles[i], menuIcons.getResourceId(
					i, -1));
			rowItems.add(items);
		}
		menuIcons.recycle();
		adapter = new CustomAdaptersp(getApplicationContext(), rowItems);
		// Set the adapter for the list view
		mDrawerList.setAdapter(adapter);

		mDrawerLayout.openDrawer(mDrawerList);
		// Set the list's click listener
		mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

		mDrawerToggle = new ActionBarDrawerToggle(this, /* host Activity */
		mDrawerLayout, /* DrawerLayout object */
		R.drawable.ic_drawer, /* nav drawer icon to replace 'Up' caret */
		R.string.drawer_open, /* "open drawer" description */
		R.string.drawer_close) /* "close drawer" description */

		{

			/** Called when a drawer has settled in a completely closed state. */
			public void onDrawerClosed(View view) {
				getActionBar().setTitle(mTitle);
			}

			/** Called when a drawer has settled in a completely open state. */
			public void onDrawerOpened(View drawerView) {
				getActionBar().setTitle("Select");
			}
		};

		// Set the drawer toggle as the DrawerListener
		mDrawerLayout.setDrawerListener(mDrawerToggle);

		getActionBar().setDisplayHomeAsUpEnabled(true);
		getActionBar().setHomeButtonEnabled(true);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.effervescence, menu);
		return true;
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		// Sync the toggle state after onRestoreInstanceState has occurred.
		mDrawerToggle.syncState();

	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		mDrawerToggle.onConfigurationChanged(newConfig);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Pass the event to ActionBarDrawerToggle, if it returns
		// true, then it has handled the app icon touch event
		if (mDrawerToggle.onOptionsItemSelected(item)) {
			return true;
		}
		switch (item.getItemId()) {
		case R.id.developers:
			Intent i = new Intent("com.example.effervescencemmxiv.DEV");
			startActivity(i);
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	/**
	 * Swaps fragments in the main content view
	 */
	/*
	 * private void selectItem(int position) { Toast.makeText(this,
	 * R.string.app_name, Toast.LENGTH_SHORT).show();
	 * 
	 * // Highlight the selected item, update the title, and close the drawer
	 * mDrawerList.setItemChecked(position, true);
	 * //setTitle(mPlanetTitles[position]);
	 * mDrawerLayout.closeDrawer(mDrawerList); }
	 */

	@Override
	public void setTitle(CharSequence title) {
		mTitle = title;
		getActionBar().setTitle(mTitle);
	}

	private class DrawerItemClickListener implements
			ListView.OnItemClickListener {
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			// selectItem(position);

			if (position == 1) {
				Intent it = new Intent("com.example.effervescencemmxiv.EBD");
				startActivity(it);
				// finish();
			} else if (position == 0) {
				Intent it = new Intent("com.example.effervescencemmxiv.ABT");
				startActivity(it);
				// finish();
			}
			/*
			 * else if(position == 1){ Intent it = new
			 * Intent("com.example.effervescencemmxiv.CU"); startActivity(it); }
			 */else if (position == 4) {
				Intent it = new Intent("com.example.effervescencemmxiv.CU");
				startActivity(it);
				// finish();
			} else if (position == 2) {
				startActivity(new Intent("com.example.effervescencemmxiv.EVENT"));
				// finish();
			} else if (position == 3) {
				startActivity(new Intent("com.example.effervescencemmxiv.FAV"));
				// finish();
			} else if (position == 5) {
				Uri uri = Uri
						.parse("http://effervescence.iiita.ac.in/register/");
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);
			}
			mDrawerList.setItemChecked(position, true);
			// setTitle(mPlanetTitles[position]);
			mDrawerLayout.closeDrawer(mDrawerList);

		}
	}

}
