package com.enggar.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText edtNilaiA, edtNilaiB;
    TextView txtHasil;
    Button btnTambah, btnKurang, btnKali, btnBagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNilaiA = (EditText) findViewById(R.id.edtNilaiA);
        edtNilaiB = (EditText) findViewById(R.id.edtNilaiB);
        txtHasil = (TextView) findViewById(R.id.txHasil);
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int A = Integer.parseInt(String.valueOf(edtNilaiA.getText()));
                int B = Integer.parseInt(String.valueOf(edtNilaiB.getText()));
                int Hasil = A + B;

                txtHasil.setText(String.valueOf(Hasil));
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int A = Integer.parseInt(String.valueOf(edtNilaiA.getText()));
                int B = Integer.parseInt(String.valueOf(edtNilaiB.getText()));
                int Hasil = A - B;

                txtHasil.setText(String.valueOf(Hasil));
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int A = Integer.parseInt(String.valueOf(edtNilaiA.getText()));
                int B = Integer.parseInt(String.valueOf(edtNilaiB.getText()));
                int Hasil = A * B;

                txtHasil.setText(String.valueOf(Hasil));
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int A = Integer.parseInt(String.valueOf(edtNilaiA.getText()));
                int B = Integer.parseInt(String.valueOf(edtNilaiB.getText()));
                int Hasil = A / B;

                txtHasil.setText(String.valueOf(Hasil));
            }
        });

    }
}