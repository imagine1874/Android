package com.example.date_time;

import java.util.Calendar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.DatePicker;
import android.widget.Toast;
import android.widget.DatePicker.OnDateChangedListener;
import android.widget.TimePicker;
import android.widget.TimePicker.OnTimeChangedListener;

public class MainActivity extends Activity {

    protected int year;
	protected int month;
	protected int day;
	protected int hour;
	protected int minute;


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatePicker datepicker = (DatePicker)findViewById(R.id.datePicker1);
        TimePicker timepicker = (TimePicker)findViewById(R.id.timePicker1);
        timepicker.setIs24HourView(true);
        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);
        final int hour = calendar.get(Calendar.HOUR_OF_DAY);
        final int minute = calendar.get(Calendar.MINUTE);
        datepicker.init(year, month, day, new OnDateChangedListener(){

			@Override
			public void onDateChanged(DatePicker arg0, int year, int month,
					int day) {
				// TODO Auto-generated method stub
				MainActivity.this.year = year;
				MainActivity.this.month = month;
				MainActivity.this.day = day;
				show(year,month,day,hour,minute);
				
			}
        	
        });
        timepicker.setOnTimeChangedListener(new OnTimeChangedListener(){

			@Override
			public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
				// TODO Auto-generated method stub
				MainActivity.this.hour = hourOfDay;
				MainActivity.this.minute = minute;
				show(year,month,day,hourOfDay,minute);
				
			}
        	
        });
    }


    protected void show(int year2, int month2, int day2, int hour, int minute) {
		// TODO Auto-generated method stub
    	String str = year+"Äê"+(month+1)+"ÔÂ"+day+"ÈÕ "+hour+":"+minute;
    	Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
		
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
