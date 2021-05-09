package com.example.alllayout;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
	public ImageButton ib1,ib2;
	public TextView tv;
	public static int i=0,y=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ib1 = (ImageButton)findViewById(R.id.imageButton1);
        ib2 = (ImageButton)findViewById(R.id.imageButton2);
        tv = (TextView)findViewById(R.id.textView3);
        ib1.setOnClickListener(this);
        ib2.setOnClickListener(this);
        
    }

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(arg0==ib1){
			tv.setText("µ„‘ﬁ+"+(++i));
		}
		if(arg0==ib2){
			tv.setText("±·µÕ+"+(++i));
		}
	}
    
}
