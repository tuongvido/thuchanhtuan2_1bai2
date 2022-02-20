package com.example.thuchanhtuan2_1bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtdoF=findViewById(R.id.edtdoF);
        EditText edtdoC=findViewById(R.id.edtdoC);

        Button btnConvToF=findViewById(R.id.buttonConvToF);
        Button btnConvToC=findViewById(R.id.buttonConvToC);
        Button btnClear=findViewById(R.id.buttonClear);

        btnConvToF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double doC=Double.valueOf(edtdoC.getText().toString());

                double doF=((float)9/5)*doC+32;
                edtdoF.setText(String.valueOf(doF));
            }
        });
        btnConvToC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double doF=Double.valueOf(edtdoF.getText().toString());
                double doC=((float)5/9)*(doF-32);
                edtdoC.setText(String.valueOf(doC));
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtdoC.setText("");
                edtdoF.setText("");
            }
        });
    }
}