package com.example.niceday.medicinetracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        final Button button1 = (Button) findViewById(R.id.btnNewUser);




    }



    public void createNewUser(View view){
        //Intent intent1 = new Intent(ProfileActivity.this, NewUserActivity.class);
        Log.d("abc","ad") ;
        Intent intent1 = new Intent(this, NewUserActivity.class);

        startActivity(intent1);
    }

}