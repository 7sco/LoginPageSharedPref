package com.example.franciscoandrade.loginsharedpreferences;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        setContentView(R.layout.activity_profile);
        TextView textView = (TextView) findViewById(R.id.profile_username);
        Intent intent = getIntent();
        String user = intent.getStringExtra("currentUser");
        textView.setText("Welcomd " + user);
    }
}
