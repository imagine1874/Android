package com.example.lch;


import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;

import android.widget.TabHost;


public class RegisterActivity extends TabActivity{

	private TabHost tabHost;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		tabHost=getTabHost();
		
		tabHost.addTab(tabHost.newTabSpec("left").setIndicator("个人信息")
				.setContent(new Intent(this,Tab1.class)));
		tabHost.addTab(tabHost.newTabSpec("right").setIndicator("工具箱")
				.setContent(new Intent(this,gju.class)));
		tabHost.setCurrentTab(0);
		

	}
}
