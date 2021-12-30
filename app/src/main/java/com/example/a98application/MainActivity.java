package com.example.a98application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void square_buttonArea_Of_Square (View view){
            Intent intent = new Intent(MainActivity.this, Areaofsquare.class);
            startActivity(intent);
    }
    }
