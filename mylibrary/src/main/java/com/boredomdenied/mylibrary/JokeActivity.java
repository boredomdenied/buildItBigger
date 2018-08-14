package com.boredomdenied.mylibrary;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;



public class JokeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        TextView textView = findViewById(R.id.textView);

        String myJoke = getIntent().getStringExtra("joke");
//                Toast.makeText(this, myJoke, Toast.LENGTH_SHORT).show();

        textView.setText(myJoke);
    }
}
