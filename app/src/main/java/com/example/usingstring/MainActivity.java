package com.example.usingstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView2;
    private static final String TAG ="Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            textView2 = findViewById(R.id.textView2);
            textView2.setText(R.string.Msg2);

            Log.i( TAG,  "OnCreate() invoked");
        }

        @Override
        protected void onStart() {
            super.onStart();
            Log.i(TAG, "onStart() invoked");
        }

        @Override
        protected void onRestart() {
            super.onRestart();
            Log.i(TAG, "onRestart() invoked");
        }

        @Override
        protected void onResume() {
            super.onResume();
            Log.i(TAG, "onResume() invoked");

        }

        @Override
        protected void onPause() {
            super.onPause();

            Log.i(TAG, "onPause() invoked");

        }


        @Override
        protected void onStop() {
            super.onStop();
            Log.i(TAG, "onStop() invoked");
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.i(TAG, "onDestroy() invoked");
        }
    }

