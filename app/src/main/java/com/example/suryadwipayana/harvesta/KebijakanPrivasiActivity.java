package com.example.suryadwipayana.harvesta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class KebijakanPrivasiActivity extends AppCompatActivity {

    TextView tvjawaban1kp,tvjawaban2kp ,tvjawaban3kp,tvjawaban4kp;
    ToggleButton tbpertanyaan1kp,tbpertanyaan2kp,tbpertanyaan3kp,tbpertanyaan4kp;
    Button btnkefaq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kebijakan_privasi);

        tbpertanyaan1kp = (ToggleButton) findViewById(R.id.tb_pertanyaan1kp);
        tbpertanyaan2kp = (ToggleButton) findViewById(R.id.tb_pertanyaan2kp);
        tbpertanyaan3kp = (ToggleButton) findViewById(R.id.tb_pertanyaan3kp);
        tbpertanyaan4kp = (ToggleButton) findViewById(R.id.tb_pertanyaan4kp);

        tvjawaban1kp = (TextView) findViewById(R.id.tv_jawaban1kp);
        tvjawaban2kp = (TextView) findViewById(R.id.tv_jawaban2kp);
        tvjawaban3kp = (TextView) findViewById(R.id.tv_jawaban3kp);
        tvjawaban4kp = (TextView) findViewById(R.id.tv_jawaban4kp);


        btnkefaq = (Button) findViewById(R.id.btn_kefaq);

        tvjawaban1kp.setVisibility(View.GONE);
        tvjawaban2kp.setVisibility(View.GONE);
        tvjawaban3kp.setVisibility(View.GONE);
        tvjawaban4kp.setVisibility(View.GONE);


        btnkefaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentkefaq = new Intent(getApplicationContext(), FaqActivity.class);

                startActivity(intentkefaq);
            }
        });

        tbpertanyaan1kp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean checked = tbpertanyaan1kp.isChecked();

                if (checked) {
                    tvjawaban1kp.setVisibility(View.VISIBLE);
                    //Digunakan untuk menyembunyikan TextView dan ImageView

                } else {
                    tvjawaban1kp.setVisibility(View.GONE);
                    //Digunakan untuk menampilkan lagi  TextView dan ImageView
                }


            }
        });

        tbpertanyaan2kp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean checked = tbpertanyaan2kp.isChecked();

                if (checked) {
                    tvjawaban2kp.setVisibility(View.VISIBLE);
                    //Digunakan untuk menyembunyikan TextView dan ImageView

                } else {
                    tvjawaban2kp.setVisibility(View.GONE);
                    //Digunakan untuk menampilkan lagi  TextView dan ImageView
                }


            }
        });

        tbpertanyaan3kp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean checked = tbpertanyaan3kp.isChecked();

                if (checked) {
                    tvjawaban3kp.setVisibility(View.VISIBLE);
                    //Digunakan untuk menyembunyikan TextView dan ImageView

                } else {
                    tvjawaban3kp.setVisibility(View.GONE);
                    //Digunakan untuk menampilkan lagi  TextView dan ImageView
                }


            }
        });

        tbpertanyaan4kp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean checked = tbpertanyaan4kp.isChecked();

                if (checked) {
                    tvjawaban4kp.setVisibility(View.VISIBLE);
                    //Digunakan untuk menyembunyikan TextView dan ImageView

                } else {
                    tvjawaban4kp.setVisibility(View.GONE);
                    //Digunakan untuk menampilkan lagi  TextView dan ImageView
                }


            }
        });
    }
}