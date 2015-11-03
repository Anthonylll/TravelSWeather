package com.Anthony.travelsweather.activity;

import com.Anthony.travelsweather.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class WelcomeActivity extends Activity{
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.welcome);
		mHandler.sendEmptyMessageDelayed(GOTO_C_Activity, 3000);//3ÃëÌø×ª
	}
    private static final int GOTO_C_Activity = 0;
    private Handler mHandler = new Handler(){
        public void handleMessage(android.os.Message msg) {

            switch (msg.what) {
                case GOTO_C_Activity:
                    Intent intent = new Intent();
                    intent.setClass(WelcomeActivity.this, ChooseAreaActivity.class);
                    startActivity(intent);
                    finish();
                    break;

                default:
                    break;
            }
        };
     };
   }