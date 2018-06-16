package com.example.rahulkumar.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "This is my first toast", Toast.LENGTH_SHORT).show();

        Toast centerToast = Toast.makeText(this,"i am in center",Toast.LENGTH_SHORT);
        centerToast.setGravity(Gravity.CENTER,0,0);
        centerToast.show();

    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(MainActivity.this, "i am in on start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "i am in on resume", Toast.LENGTH_SHORT).show();



    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "i am in on pause", Toast.LENGTH_SHORT).show();



    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "i am in on stop", Toast.LENGTH_SHORT).show();



    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "i am in on destroy", Toast.LENGTH_SHORT).show();



    }



}

