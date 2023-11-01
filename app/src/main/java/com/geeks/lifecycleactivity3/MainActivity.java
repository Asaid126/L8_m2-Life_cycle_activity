package com.geeks.lifecycleactivity3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.edit_text);
        TextView textView = findViewById(R.id.text_view);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //обработка клика

                String text = editText.getText().toString()+" "+textView.getText().toString();
               // String text2 = textView.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("key1", text);

                startActivity(intent);
//                finish();
            }
        });

        Log.d("shamal", "onCreate MainActivity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("shamal", "onStart MainActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("shamal", "onResume MainActivity");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("shamal", "onPause MainActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("shamal", "onStop MainActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("shamal", "onDestroy MainActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("shamal", "onRestart MainActivity");
    }
}