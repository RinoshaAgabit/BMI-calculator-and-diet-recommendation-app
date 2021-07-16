package com.example.bmi;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class SMainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_smain);
		Button B1 = (Button)findViewById(R.id.button1);
		Button B2 = (Button)findViewById(R.id.button2);
		Button B3 = (Button)findViewById(R.id.button3);
		Button B4 = (Button)findViewById(R.id.button4);
		Button B5 = (Button)findViewById(R.id.button5);
		B1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent o=new Intent(getApplicationContext(),UMainActivity.class);
				startActivity(o);
			}
		});
B2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent o=new Intent(getApplicationContext(),TMainActivity.class);
				startActivity(o);
			}
		});
B3.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent o=new Intent(getApplicationContext(),OMainActivity.class);
		startActivity(o);
	}
});
B4.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent o=new Intent(getApplicationContext(),O2MainActivity.class);
		startActivity(o);
	}
});
B5.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent o=new Intent(getApplicationContext(),VMainActivity.class);
		startActivity(o);
	}
});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.smain, menu);
		return true;
	}

}
