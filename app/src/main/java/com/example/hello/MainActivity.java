package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView greetingTv;
    AppCompatButton button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        greetingTv = findViewById(R.id.textView);
        button = findViewById(R.id.button);

    }

    public void changeGreeting (View v) {
        if (greetingTv.getText().equals(getString(R.string.hello)))//Says Hello
        {
            greetingTv.setText(getString(R.string.goodbye)); //Says Goodbye
        }
        else
        {
            greetingTv.setText(getString(R.string.hello)); //Hello
        }
    }
}