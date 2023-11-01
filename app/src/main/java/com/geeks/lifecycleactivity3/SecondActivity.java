package com.geeks.lifecycleactivity3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("shamal", "onCreate SecondActivity");

        String text = getIntent().getStringExtra("key1");

        TextView textView = findViewById(R.id.text_view);
       // textView.setText(text+"Activity");
        textView.setText(text);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("shamal", "onStart SecondActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("shamal", "onResume SecondActivity");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("shamal", "onPause SecondActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("shamal", "onStop SecondActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("shamal", "onDestroy SecondActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("shamal", "onRestart SecondActivity");
    }
}