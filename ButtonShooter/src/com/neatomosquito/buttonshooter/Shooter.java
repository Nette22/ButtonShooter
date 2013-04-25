package com.neatomosquito.buttonshooter;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

/**
 * When the user presses the shoot button the it fires. Occasionally (as of now %10 of the time) the 
 * user will make a hit. When that happens the user is notified of their hit.
 * 
 * @author kevin.sparks
 * @version 0.1
 */
public class Shooter extends Activity implements OnClickListener {
    
    // Declare variables from the layout
    private TextView hit, fire;
    private Button shoot;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.shooter);
	// Set-up method
	initializeVars();
	
	// Listener
	shoot.setOnClickListener(this);
    }

    // Links variables to the layout
    private void initializeVars() {
	hit = (TextView) findViewById(R.id.tvHit);
	fire = (TextView) findViewById(R.id.tvPew);
	shoot = (Button) findViewById(R.id.btnShoot);
    }

    @Override
    public void onClick(View v) {
	// Switch case for the button press
	switch(v.getId()) {
	case R.id.btnShoot:
	    // Set up random number
	    Random randomNumber = new Random();
	    // Set text of fire to pew
	    fire.setText(R.string.pew);
	    // Set random number to determine if hit or not
	    int hitNumber = randomNumber.nextInt(10);
	    // If hit change the color to something random but visible, if not set it to black like the background
	    if(hitNumber == 5) {
		hit.setTextColor(Color.rgb(randomNumber.nextInt(265), randomNumber.nextInt(265), randomNumber.nextInt(265)));
	    } else {
		hit.setTextColor(Color.BLACK);
	    }
	    break;
	}
    }
    
    
}
