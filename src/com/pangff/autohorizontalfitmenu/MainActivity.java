package com.pangff.autohorizontalfitmenu;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				((TextView)findViewById(R.id.textView4)).setText("测试4 0000000");
				((TextView)findViewById(R.id.textView3)).setText("测试4 0000000");
				((AutoHorizontalFitMenuView)findViewById(R.id.fitMenuView)).resetChilder();
			}
		}, 10000);
	}
}
