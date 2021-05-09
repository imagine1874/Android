package com.example.event;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView txtView;
	Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtView = (TextView)findViewById(R.id.txt);
        btn1 = (Button)findViewById(R.id.num1);
        btn2 = (Button)findViewById(R.id.num2);
        btn3 = (Button)findViewById(R.id.num3);
    }


    public void myClick(View view){
    	if(view.equals(btn1)){
    		txtView.setText("���ոյ��������Ӧ���ǣ�" + 1);
    	}else if(view.equals(btn2)){
    		txtView.setText("���ոյ�������ֺ����ǣ�" + 2);
    	}else if(view.equals(btn3)){
    		txtView.setText("���ոյ�������ִ���ǣ�" + 3);
    	}
    }
    
}
