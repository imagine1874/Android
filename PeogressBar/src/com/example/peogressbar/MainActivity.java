package com.example.peogressbar;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends Activity {
	private ProgressBar horizonP;
	private ProgressBar circleP;
	private int mProgressStatus = 0;
	private Handler mHandler;
	protected int mPropressStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        horizonP = (ProgressBar)findViewById(R.id.progressBar1);
        circleP = (ProgressBar)findViewById(R.id.progressBar2);
        mHandler = new Handler(){
        	@Override
        	public void handleMessage(Message msg){
        		if(msg.what==0x111){
        			horizonP.setProgress(mProgressStatus);
        		}else{
        			Toast.makeText(MainActivity.this, "耗时操作已经完成", Toast.LENGTH_LONG).show();
        			horizonP.setVisibility(View.GONE);
        			circleP.setVisibility(View.GONE);
        			
        		}
        	}
        };
        new Thread(new Runnable(){
        	public void run(){
        		while(true){
        			mPropressStatus = doWork();
        			Message m = new Message();
        			if(mProgressStatus<100){
        				m.what = 0x111;
        				mHandler.sendMessage(m);
        			}else{
        				m.what = 0x110;
        				mHandler.sendMessage(m);
        				break;
        			}
        		}
        	}
        	private int doWork(){
        		mProgressStatus+=Math.random()*10;
        		try{
        			Thread.sleep(200);
        		}catch(InterruptedException e){
        			e.printStackTrace();
        		}
        		return mProgressStatus;
        	}
        }).start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
