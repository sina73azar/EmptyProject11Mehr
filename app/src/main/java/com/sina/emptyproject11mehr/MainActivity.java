package com.sina.emptyproject11mehr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="LifeCycleTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: is called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: is called");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: is called");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: is called");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: is called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: is called");

    }
}