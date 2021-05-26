package com.example.menu01;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = new MenuInflater(this);
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		if(item.getGroupId()==R.id.setting){
			if(item.isChecked()){
				item.setChecked(false);
			}else{
				item.setChecked(true);
			}
		}
		if(item.getItemId()!=R.id.item2){
			Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
		}
		return true;
	}
    
    
}
