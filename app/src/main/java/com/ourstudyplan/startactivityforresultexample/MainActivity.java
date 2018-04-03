package com.ourstudyplan.startactivityforresultexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_name;
    private static final int REQ_ANOTHER = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_name=findViewById(R.id.tv_name);
    }

    public void setName(View view) {
        Intent intent = new Intent(this,AnotherActivity.class);
        startActivityForResult(intent,REQ_ANOTHER);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQ_ANOTHER && resultCode == RESULT_OK){
            tv_name.setText(data.getStringExtra("name"));
        }
    }
}
