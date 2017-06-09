package com.example.android.counterapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int count=0;
    public void increment(View view){
        ++count;
        TextView t =(TextView) findViewById(R.id.count);
        t.setText("" + count);
    }
}
