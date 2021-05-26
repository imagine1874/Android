package com.example.menu;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.show);
        registerForContextMenu(tv);
    }
    


    public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		MenuInflater inflator = new MenuInflater(this);
		inflator.inflate(R.menu.main, menu);
		menu.setHeaderIcon(R.drawable.ic_launcher);
		menu.setHeaderTitle("ÇëÑ¡ÔñÎÄ×ÖÑÕÉ«£º");
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()){
		case R.id.color1:
			tv.setTextColor(Color.RED);
			break;
		case R.id.color2:
			tv.setTextColor(Color.rgb(0, 255, 0));
			break;
		case R.id.color3:
			tv.setTextColor(Color.rgb(0, 0, 255));
			break;
		case R.id.color4:
			tv.setTextColor(Color.rgb(255, 180, 0));
			break;
		default:
			tv.setTextColor(Color.rgb(255, 255, 255));
		}
		return true;
		
	}



	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
