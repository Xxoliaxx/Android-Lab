package com.example.calculatorapp;
import com.example.calculatorapp.R;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        String sessionId = getIntent().getStringExtra("Result");
        TextView result  = findViewById(R.id.res);
        result.setText("Result : " + sessionId);
    }
}
