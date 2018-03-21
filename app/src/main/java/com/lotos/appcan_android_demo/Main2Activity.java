package com.lotos.appcan_android_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.zywx.wbpalmstar.engine.LoadingActivity;

public class Main2Activity extends AppCompatActivity {

    public void onClickOpen(View view) {
        Intent intent = new Intent(this, LoadingActivity.class);
        this.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
