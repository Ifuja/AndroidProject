package org.esiea.chamoinri_ifuja_firmin_jacques_olivier.androidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void page1 (View view) {
        startActivity(new Intent(this, page_2.class));
    }
    public class page_2 extends AppCompatActivity {
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);

        }

        public void page2 (View view){
            startActivity(new Intent(this, MainActivity.class));
        }
    }
}
