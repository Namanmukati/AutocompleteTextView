package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    String[] language ={"C","C++","Java",".NET","oPhone","Android","ASP","PHP"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //creating the instance of ArrayAda[ter containing list of language names
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
        (this,android.R.layout.select_dialog_item,language);
        //Getting the instance of AutoComplete TextView
        AutoCompleteTextView actv= (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        actv.setThreshold(1);//will start working from first character
        actv.setAdapter(adapter);//setting the adapter data into AutoCompleteTextView
        actv.setTextColor(Color.RED);
    }
}