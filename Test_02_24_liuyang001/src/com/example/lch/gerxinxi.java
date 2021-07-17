package com.example.lch;

import com.example.lch14.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class gerxinxi extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		Intent intent =getIntent();
		Bundle bundle = intent.getExtras();
		TextView user = (TextView)findViewById(R.id.textUser);
		user.setText("用户名："+bundle.getString("user"));
		TextView pwd = (TextView)findViewById(R.id.textPwd);
		pwd.setText("密码："+bundle.getString("pwd"));
		TextView sex = (TextView)findViewById(R.id.textSex);
		sex.setText("性别："+bundle.getString("sex"));
		TextView area = (TextView)findViewById(R.id.textArea);
		area.setText("地区："+bundle.getString("diqu"));
		Button button=(Button)findViewById(R.id.fh);
		
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = getIntent();
				// TODO Auto-generated method stub
				setResult(0x717,intent);
				finish();
			}
		});
	}
}
