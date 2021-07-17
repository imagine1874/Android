package com.example.lch;

import com.example.lch14.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Spinner;

public class Tab1 extends Activity{
	Spinner spinner;
	final int CODE = 0x717;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gerenxinxi);
		final RadioGroup selectsex = (RadioGroup) findViewById(R.id.sex);
		selectsex.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			 @Override
			 public void onCheckedChanged(RadioGroup rg, int checkedld) {
			 // TODO Auto-generated method stub
			 RadioButton r = (RadioButton) findViewById(checkedld);
			 r.getText();
			 }});
		spinner = (Spinner)findViewById(R.id.diqu);
		spinner.getSelectedItem();
		spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				String area = arg0.getItemAtPosition(arg2).toString();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}		
		});
		Button tijiao = (Button)findViewById(R.id.tijiao);
		tijiao.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String sex = "";
				 RadioButton r =  (RadioButton)findViewById(R.id.radioButton1);
				 sex = r.isChecked()?"ÄÐ":"Å®";
				 String user = ((EditText)findViewById(R.id.dengruUser)).getText().toString();
					String pwd = ((EditText)findViewById(R.id.dengrupwd)).getText().toString();
					String diqu = spinner.getSelectedItem().toString();
					Intent i = new Intent(Tab1.this,gerxinxi.class);
					Bundle b = new Bundle();
					b.putCharSequence("user",user);
					b.putCharSequence("pwd",pwd);
					b.putCharSequence("sex",sex);
					b.putCharSequence("diqu",diqu);
					i.putExtras(b);
					startActivityForResult(i,CODE);
					
			}
		});
	}

}
