package com.example.spidermanappofc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class brinquedo3 extends AppCompatActivity {
    Button btnext;
    String ex1;
    String ex2;
    TextView txtex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brinquedo1);

        btnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtex.getText().toString();
                txtex.setText(ex1.toString());
            }
        });

        btnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                txtex.getText().toString();
                txtex.setText(ex1.toString());
            }
        });

    }
}