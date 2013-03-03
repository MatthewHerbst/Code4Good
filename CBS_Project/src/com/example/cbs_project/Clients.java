package com.example.cbs_project;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Clients extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clients);
		Button addition = (Button)findViewById(R.id.button1);
		Button search = (Button)findViewById(R.id.imageButton1);
		/*addition.setOnClickListener(new Button.OnClickListener()){
			
		}*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_clients, menu);
		return true;
	}
	
	
}
