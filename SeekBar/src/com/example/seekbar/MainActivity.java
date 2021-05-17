package com.example.seekbar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private SeekBar seekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView result = (TextView)findViewById(R.id.textView1);
        seekbar = (SeekBar)findViewById(R.id.seekBar1);
        seekbar.setOnSeekBarChangeListener(new OnSeekBarChangeListener(){

			@Override
			public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "结束滑动", Toast.LENGTH_SHORT).show();
				
			}

			@Override
			public void onStartTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "开始滑动", Toast.LENGTH_SHORT).show();
				
			}

			@Override
			public void onStopTrackingTouch(SeekBar arg0) {
				String progress = null;
				// TODO Auto-generated method stub
				result.setText("当前值："+progress);
				
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
