package com.example.converterex_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    ///this is connected to button's "on CLick"
    public void makeConversion(View view) {
        //step1: read the input value and convert the text to float
        EditText editTextCelsius = findViewById(R.id.editTextCelsius);
        String celsiusAsString = editTextCelsius.getText().toString();
        float celsius = Float.valueOf(celsiusAsString);



        //step2: calculate fahrenheit based on the value and write it to TextView
        float fahrenheit = celsius * 1.8f +32f;

        TextView textViewFahrenheit = findViewById(R.id.textViewFahrenheit);
        textViewFahrenheit.setText("" + fahrenheit + "F");
    }
}