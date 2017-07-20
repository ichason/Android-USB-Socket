package com.example.wangyong.usb_sample;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class UsbConnect extends Activity {

	private TextView tvInfo;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		startService(new Intent(this, androidService.class));

		tvInfo=(TextView)findViewById(R.id.tvInfo);
		tvInfo.setText("androidService--->onCreate()");
	}
}
