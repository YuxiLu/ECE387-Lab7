package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int counter = 0;
    public void onClick(View view) {
        counter++;
        TextView text = findViewById(R.id.text);
        text.setText("" + counter);
    }
}