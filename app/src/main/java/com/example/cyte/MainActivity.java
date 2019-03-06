package com.example.cyte;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Temp code that shows employee form
        Intent intent = new Intent(getApplicationContext(), Employee_Profile_Activity.class);
        startActivity(intent);

    }
}
