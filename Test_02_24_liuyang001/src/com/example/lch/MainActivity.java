package com.example.lch;

import com.example.lch14.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button=(Button)findViewById(R.id.dengru);
		final EditText editText01=(EditText)findViewById(R.id.pwd);
		final EditText editText02=(EditText)findViewById(R.id.repwd);
		final EditText editText03=(EditText)findViewById(R.id.user);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String pwd=editText01.getText().toString();
				String repwd=editText02.getText().toString();
				String user=editText03.getText().toString();
				if (pwd.equals(repwd)) {
					Intent intent=new Intent(MainActivity.this,RegisterActivity.class);
//					Bundle bundle=new Bundle();
//					bundle.putCharSequence("user", user);
//					bundle.putCharSequence("pwd", pwd);
//					bundle.putCharSequence("pwd", repwd);
//					intent.putExtras(bundle);
				    startActivity(intent);
				}else{
				Toast toast=Toast.makeText(MainActivity.this, "两次密码不一致",Toast.LENGTH_SHORT);
					editText01.setText("");
					editText02.setText("");
					editText03.setText("");
					toast.show();
				}
			}
		});
	}
}
