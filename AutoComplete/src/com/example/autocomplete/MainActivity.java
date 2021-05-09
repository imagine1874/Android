package com.example.autocomplete;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] COUNTRIES = new String[]{
        	"doulin","douwang","douhuang","douzong","douzun","dousheng","doudi"
        };
        final AutoCompleteTextView textView = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,
        		android.R.layout.simple_dropdown_item_1line,COUNTRIES);
        textView.setAdapter(adapter);
        Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, textView.getText().toString(), Toast.LENGTH_LONG).show();
				
			}
        	
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
