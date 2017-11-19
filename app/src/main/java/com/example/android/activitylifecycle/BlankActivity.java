package com.example.android.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class BlankActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank);
        Toast toast = Toast.makeText(this, "OnCreate() of second activity", Toast.LENGTH_SHORT);
        toast.show();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast toastMessage= Toast.makeText(this,"OnStart() of second activity", Toast.LENGTH_SHORT);
        toastMessage.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast toastMessage= Toast.makeText(this,"OnResume() of second activity", Toast.LENGTH_SHORT);
        toastMessage.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast toastMessage= Toast.makeText(this,"OnPause() of second activity", Toast.LENGTH_SHORT);
        toastMessage.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast toastMessage= Toast.makeText(this,"OnStop() of second activity", Toast.LENGTH_SHORT);
        toastMessage.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast toastMessage= Toast.makeText(this,"OnRestart() of second activity", Toast.LENGTH_SHORT);
        toastMessage.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toastMessage= Toast.makeText(this,"OnDestroy() of second activity", Toast.LENGTH_SHORT);
        toastMessage.show();
    }
}
