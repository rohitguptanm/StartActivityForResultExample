package com.ourstudyplan.startactivityforresultexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AnotherActivity extends AppCompatActivity {

    EditText et_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        et_name = findViewById(R.id.et_name);
    }


    public void submitName(View view) {
        String name = et_name.getText().toString().trim();
        Intent intent = new Intent();
        intent.putExtra("name", name);
        setResult(RESULT_OK, intent);
        finish();
    }
}
