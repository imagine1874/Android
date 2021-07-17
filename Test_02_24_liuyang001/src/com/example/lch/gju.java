package com.example.lch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.lch14.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.SimpleAdapter;

public class gju extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gongju);
		
		GridView gridView=(GridView)findViewById(R.id.gridView1);
		
		int[] imageId=new int[]{
				R.drawable.tupian01,R.drawable.tupian02,
				R.drawable.tupian03,R.drawable.tupian04,
				R.drawable.tupian04};
		
		String[] title=new String[]{"阅读","个人信息","计算机","英语","数学"};
		
		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
		for (int i = 0; i < title.length; i++) {
			Map<String,Object> map=new HashMap<String, Object>();
			map.put("image", imageId[i]);
			map.put("title", title[i]);
			list.add(map);
		}
		SimpleAdapter adapter=new SimpleAdapter(this,list,R.layout.gjumian,new String[]{"title","image"},new int[]{R.id.title,R.id.imageView1});
		
		gridView.setAdapter(adapter);
		gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				if(arg2==0){
					Intent intent1 = new Intent(gju.this,tabpage.class);
					startActivity(intent1);
				}
			}
		});
	}
}
