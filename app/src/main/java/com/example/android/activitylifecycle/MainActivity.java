package com.example.android.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toastMessage= Toast.makeText(this,"OnCreate() called", Toast.LENGTH_SHORT);
        toastMessage.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast toastMessage= Toast.makeText(this,"OnStart() called", Toast.LENGTH_SHORT);
        toastMessage.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast toastMessage= Toast.makeText(this,"OnResume() called", Toast.LENGTH_SHORT);
        toastMessage.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast toastMessage= Toast.makeText(this,"OnPause() called", Toast.LENGTH_SHORT);
        toastMessage.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast toastMessage= Toast.makeText(this,"OnStop() called", Toast.LENGTH_SHORT);
        toastMessage.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast toastMessage= Toast.makeText(this,"OnRestart() called", Toast.LENGTH_SHORT);
        toastMessage.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toastMessage= Toast.makeText(this,"OnDestroy() called", Toast.LENGTH_SHORT);
        toastMessage.show();
    }


    public void myMethod(View view){
        Intent intent=new Intent(this, BlankActivity.class);
        startActivity(intent);
    }
}


