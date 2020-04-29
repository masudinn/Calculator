package com.masudinn.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtHasil;
    Button  btnX,btnBagi,btnKurang,btnTambah;
    EditText edt1,edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    txtHasil = findViewById(R.id.hasil);
    btnBagi = findViewById(R.id.bagi);
    btnKurang = findViewById(R.id.kurang);
    btnTambah = findViewById(R.id.tambah);
    btnX = findViewById(R.id.kali);
    edt1 = findViewById(R.id.satu);
    edt2 = findViewById(R.id.dua);


    btnX.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            txtHasil.setText(String.valueOf(Float.valueOf(edt1.getText().toString())*
                    (Float.valueOf(edt2.getText().toString()))));
        }
    });
    btnBagi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            txtHasil.setText(String.valueOf(Float.valueOf(edt1.getText().toString())/
                    (Float.valueOf(edt2.getText().toString()))));
        }
    });
    btnTambah.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            txtHasil.setText(String.valueOf(Float.valueOf(edt1.getText().toString())+
                    (Float.valueOf(edt2.getText().toString()))));
        }
    });
    btnKurang.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            txtHasil.setText(String.valueOf(Float.valueOf(edt1.getText().toString())-
                    (Float.valueOf(edt2.getText().toString()))));
        }
    });

    }
}
