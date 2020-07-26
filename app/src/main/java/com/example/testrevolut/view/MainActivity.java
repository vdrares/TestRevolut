package com.example.testrevolut.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.testrevolut.R;
import com.example.testrevolut.model.di.RevolutApp;
import com.example.testrevolut.model.RatesContract;

public class MainActivity extends AppCompatActivity implements RatesContract.View {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((RevolutApp)getApplication()).getComponent().inject(this);
    }
}
