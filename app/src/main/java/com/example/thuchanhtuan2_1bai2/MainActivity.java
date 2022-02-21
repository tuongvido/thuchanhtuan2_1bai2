package com.example.thuchanhtuan2_1bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtdoF=findViewById(R.id.edtdoF);
        EditText edtdoC=findViewById(R.id.edtdoC);

        TextView tvThongBaoF=findViewById(R.id.tvThongBaoF);
        TextView tvThongBaoC=findViewById(R.id.tvThongBaoC);
        Button btnConvToF=findViewById(R.id.buttonConvToF);
        Button btnConvToC=findViewById(R.id.buttonConvToC);
        Button btnClear=findViewById(R.id.buttonClear);

        btnConvToF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String doC=edtdoC.getText().toString();
                if(!doC.matches("^[0-9]+$") ||doC.equals("")){
                    tvThongBaoC.setText("Vui lòng nhập số");
                    edtdoC.selectAll();
                    edtdoC.setFocusable(true);

                    return;
                }
                tvThongBaoC.setText("");
                double c=Double.parseDouble(edtdoC.getText().toString());
                double doF=((float)9/5)*c+32;
                edtdoF.setText(String.valueOf(doF));
            }
        });
        btnConvToC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String doF=edtdoF.getText().toString();
                if(!doF.matches("^[0-9]+$") ||doF.equals("")) {
                    tvThongBaoF.setText("Vui lòng nhập số");
                    edtdoF.selectAll();
                    edtdoF.setFocusable(true);

                    return;
                }
                tvThongBaoF.setText("");
                double f=Double.parseDouble(edtdoF.getText().toString());
                double doC=((float)5/9)*(f-32);
                edtdoC.setText(String.valueOf(doC));
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtdoC.setText("");
                edtdoF.setText("");
                tvThongBaoC.setText("");
                tvThongBaoF.setText("");

            }
        });
    }
}