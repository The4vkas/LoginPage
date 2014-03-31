package com.example.loginpage;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Paint;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
TextView _forgot,_sign;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		_forgot=(TextView)findViewById(R.id.forgotpass);
		_forgot.setPaintFlags(_forgot.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
		_sign=(TextView)findViewById(R.id.signup);
		_sign.setPaintFlags(_sign.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
		
	} 
     public void onclickforgot()
     {
    	 Toast.makeText(getApplicationContext(), "forget",Toast.LENGTH_SHORT).show();
    	 // for forgoten password
    	}
     public void onclicksign()
     {
    	 Toast.makeText(getApplicationContext(), "haha",Toast.LENGTH_SHORT).show();
    	 // for Sign up
    	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
