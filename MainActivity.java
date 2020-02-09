package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.add);
        Button button2 = findViewById(R.id.sub);
        Button button3 = findViewById(R.id.mul);
        Button button4 = findViewById(R.id.div);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);

        int n1 = Integer.parseInt(num1.getText().toString()) ;
        int n2 = Integer.parseInt(num2.getText().toString()) ;
        switch (v.getId()) {
            case R.id.add:
                Toast.makeText(this, "Button 1 clicked", Toast.LENGTH_SHORT).show();
                openResultActivity(n1+n2);
                break;
            case R.id.sub:
                Toast.makeText(this, "Button 2 clicked", Toast.LENGTH_SHORT).show();
                openResultActivity(n1-n2);
                break;
            case R.id.mul:
                Toast.makeText(this, "Button 3 clicked", Toast.LENGTH_SHORT).show();
                openResultActivity(n1*n2);
                break;
            case R.id.div:
                Toast.makeText(this, "Button 4 clicked", Toast.LENGTH_SHORT).show();
                openResultActivity(n1/n2);
                break;
        }
    }

    public void openResultActivity(int result){
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("Result",Integer.toString(result));
        startActivity(intent);
    }
}
