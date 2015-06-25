package com.example.marcin.myfirstandroidapp;

/**
 * Created by Marcin on 06.06.2015.
 */

import android.view.View;
import android.view.View.OnClickListener;

public class MyOnClickListener implements OnClickListener{
    MainActivity caller;

    public MyOnClickListener(MainActivity activity){
        this.caller = activity;
    }

    public void onClick(View view) {
        caller.textView.setText("You clicked the button!");
    }
}
