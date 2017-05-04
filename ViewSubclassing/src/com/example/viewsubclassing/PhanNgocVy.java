package com.example.viewsubclassing;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.LinearLayout;

public class PhanNgocVy extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phan_ngoc_vy);
        Button nut = new Button(this){
        	public boolean performClick(){
        		return false;
        	}
        };
        nut.setText("Button9");
        LinearLayout layout = (LinearLayout) findViewById(R.id.lll);
        layout.addView(nut);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.phan_ngoc_vy, menu);
        return true;
    }
    
}
