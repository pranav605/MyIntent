package com.example.saipranav.myintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView result_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        result_msg=findViewById(R.id.tv);
        Intent intent = getIntent();
        String myvalue=intent.getStringExtra("sent");
        result_msg.setText(myvalue);
        result_msg.setVisibility(View.VISIBLE);
    }
}
