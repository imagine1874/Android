package com.example.lch;

import com.example.lch14.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class tabpage extends Activity{
	private TextView textView,tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page);
		
		textView=(TextView)findViewById(R.id.page02);
		tv=(TextView)findViewById(R.id.page01);
		registerForContextMenu(textView);
		
		Button button=(Button)findViewById(R.id.fanhui);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				finish();
				
			}
		});
		
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		MenuInflater inflater=new MenuInflater(this);
		inflater.inflate(R.menu.contextmenu, menu);
		menu.setHeaderIcon(R.drawable.ic_launcher);
		menu.setHeaderTitle("…Ë÷√¥Û–°");
	}
	
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.size1:
			tv.setTextSize(30);
			break;
		case R.id.size2:
			tv.setTextSize(20);
			break;
		case R.id.size3:
			tv.setTextSize(10);
			break;
		default:
			tv.setTextSize(15);
		}
		return true;
	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		MenuInflater inflator = new MenuInflater(this);
		inflator.inflate(R.menu.contextmenu, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		// TODO Auto-generated method stub
		
		return true;
	}
}
