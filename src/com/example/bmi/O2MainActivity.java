package com.example.bmi;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class O2MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_o2_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.o2_main, menu);
		return true;
	}

}
