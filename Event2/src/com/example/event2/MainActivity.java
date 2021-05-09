package com.example.event2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
	TextView txtView;
	Button btn1,btn2,btn3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		txtView = (TextView)findViewById(R.id.txt);
		btn1 = (Button)findViewById(R.id.num1);
		btn2 = (Button)findViewById(R.id.num2);
		btn3 = (Button)findViewById(R.id.num3);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
