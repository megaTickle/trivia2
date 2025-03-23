package com.example.trivia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class SettingActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    private Spinner spinner;
    private Button btnColorSetting;
    private String[] arrColor = { "Red", "Blue", "Pink", "Yellow"};
    private String chooseColor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);


        btnColorSetting = findViewById(R.id.btnColorSetting);
        btnColorSetting.setOnClickListener(this);

        spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);

        ArrayAdapter aa =
                new ArrayAdapter(this, android.R.layout.simple_spinner_item,arrColor);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(aa);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        i.putExtra("color", chooseColor);
        setResult(RESULT_OK,i);
        finish();  // close the activity
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        chooseColor = arrColor[position];
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    }


