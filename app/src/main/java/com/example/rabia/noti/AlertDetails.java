package com.example.rabia.noti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class AlertDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_details);
        Toast.makeText(this,"My Notification",Toast.LENGTH_SHORT).show();

    }
}
