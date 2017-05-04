package com.example.counter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class PhanNgocVy extends Activity {
	 	TextView    tvC;
	 	RadioButton rU, rD;
	 	Button      bC;
	 	int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phan_ngoc_vy);
        tvC = (TextView)    findViewById(R.id.qqwer);
        rU = (RadioButton) findViewById(R.id.werdsaf);
        rD = (RadioButton) findViewById(R.id.sadaddvdv);
        bC = (Button) findViewById(R.id.sdfgsdgfsdgf);
        tvC.setText(String.valueOf(count));
        bC.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				if (rU.isChecked()) { // Counting up
		               count++;
		            } else if (rD.isChecked()) { // Counting down
		               count--;
		            }
		            tvC.setText(String.valueOf(count));
		     }
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.phan_ngoc_vy, menu);
        return true;
    }
    
}
