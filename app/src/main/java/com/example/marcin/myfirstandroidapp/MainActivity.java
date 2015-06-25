package com.example.marcin.myfirstandroidapp;

import android.os.Bundle;
import android.view.Menu;
import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends Activity {

    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new MyOnClickListener(this));
        textView = (TextView) findViewById(R.id.textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
