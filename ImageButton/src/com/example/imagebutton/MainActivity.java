package com.example.imagebutton;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button bt;
	ImageButton img;
	Boolean f=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button bt = (Button)findViewById(R.id.button1);
        ImageButton img = (ImageButton)findViewById(R.id.imageButton1);
        bt.setOnClickListener(
        		new OnClickListener() {
					
					@Override
					public void onClick(View view0) {
						String s = bt.getText().toString();
						Toast t = Toast.makeText(MainActivity.this, s ,Toast.LENGTH_LONG);
						t.show();
						if(f==false){
							f=true;
							bt.setText("我见青山多妩媚");
						}else{
							f=false;
							bt.setText("料青山，见我应如是");
						}
					}
				});
    }
    
    public void myClick1(View view2){
    Toast t2 = Toast.makeText(MainActivity.this,"您点击了普通图片按钮",Toast.LENGTH_LONG);
	t2.show();
    }
}
