package com.neatomosquito.buttonshooter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Main menu for the Button Shooter application. Allows the user to either play the game or 
 * exit. Pretty simple. <br />
 * <br /><b>TODO:</b> Add options menu like an About Us section or a preferences section 
 * @author kevin.sparks
 * @version 0.1
 */
public class MainMenu extends Activity implements OnClickListener {

	// Set up the two buttons needed
	private Button play, exit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
		// For cleanliness
		initializeVars();
		
		// Set up listener
		play.setOnClickListener(this);
		exit.setOnClickListener(this);
	}

	// Links variables to xml 
	private void initializeVars() {
	    play = (Button) findViewById(R.id.btnPlay);
	    exit = (Button) findViewById(R.id.btnExit);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}

	@Override
	public void onClick(View view) {
	    // Switch & case for the buttons
	    switch(view.getId()) {
	    case R.id.btnPlay:
		// Create intent to launch game
		Intent i = new Intent("com.neatomosquito.buttonshooter.SHOOTER");
		// Start activity
		startActivity(i);
		break;
		
	    case R.id.btnExit:
		// Close the application
		finish();
	    }
	    
	}

}
