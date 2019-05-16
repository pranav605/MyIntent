package com.example.saipranav.myintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg=findViewById(R.id.et_name);
    }

    public void openSecondActivity(View view)
    {
        String messageValue=msg.getText().toString();
        Intent intent = new Intent( this,SecondActivity.class);
        intent.putExtra("sent",messageValue);
        startActivity(intent);
    }
}
