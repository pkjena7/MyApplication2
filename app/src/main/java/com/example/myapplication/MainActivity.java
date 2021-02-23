package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout=findViewById(R.id.l_layout);
    }

    public void snackbarfun(View view) {

        Snackbar snackbar = Snackbar.make(linearLayout,"hello i am snackbar",Snackbar.LENGTH_SHORT);
        snackbar.show();
    }
}