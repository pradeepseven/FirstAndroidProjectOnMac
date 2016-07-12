package com.example.antonypradeep.firstandroidprojectonmac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    TextView txt = (TextView)findViewById(R.id.firsttextView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }
}
