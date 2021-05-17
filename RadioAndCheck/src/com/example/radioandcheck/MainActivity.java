package com.example.radioandcheck;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	TextView c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioGroup sex = (RadioGroup)findViewById(R.id.rediogroup);
        Button button = (Button)findViewById(R.id.button01);
        button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				for(int i=0;i<sex.getChildCount();i++){
					RadioButton r = (RadioButton)sex.getChildAt(i);
					if(r.isChecked()){
						r.getText();
						Toast.makeText(MainActivity.this, r.getText(), Toast.LENGTH_LONG).show();
						break;
					}
				}
			}
        	
        });
        final CheckBox like1 = (CheckBox)findViewById(R.id.CheckBox01);
        final CheckBox like2 = (CheckBox)findViewById(R.id.CheckBox02);
        final CheckBox like3 = (CheckBox)findViewById(R.id.CheckBox03);
        OnCheckedChangeListener checkBox_listener = null;
		like1.setOnCheckedChangeListener(checkBox_listener);
        like2.setOnCheckedChangeListener(checkBox_listener);
        like3.setOnCheckedChangeListener(checkBox_listener);
        Button button02 = (Button)findViewById(R.id.button02);
        button02.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String like="";
				if(like1.isChecked()){
					like+=like1.getText().toString()+"";
				}
				if(like2.isChecked()){
					like+=like2.getText().toString()+"";
				}
				if(like3.isChecked()){
					like+=like3.getText().toString()+"";
				}
				c = (TextView)findViewById(R.id.textview02);
				c.setText("喜欢的爱好是："+like);
			}	
        });
    }
    private OnCheckedChangeListener checkBox_listener = new OnCheckedChangeListener(){
    	@Override
    	public void onCheckedChanged(CompoundButton buttonView,boolean isChecked){
    		if(isChecked){
    			Log.i("复选框","选中了["+buttonView.getText().toString()+"]");
    		}
    	}
    };
}
