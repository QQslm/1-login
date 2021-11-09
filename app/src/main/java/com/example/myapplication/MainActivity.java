package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.appsearch.GetByDocumentIdRequest;
import android.os.Bundle;
import android.text.style.TtsSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int count;
    public void runLogin(View view) {

        //EditText editText = findViewById(R.id.editTextTextPersonName);
        TextView  buttontext= findViewById(R.id.button);
        switch (count) {
            case 1:
                buttontext.setText("login");
                count=0;
                break;
            case 0:
                buttontext.setText("logout");
                count=1;
                break;
        }

    }
}



