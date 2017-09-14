package com.example.suryadwipayana.harvesta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;


public class FaqActivity extends AppCompatActivity {

    TextView tvjawaban1,tvjawaban2 ,tvjawaban3,tvjawaban4,tvjawaban5,tvjawaban6;
    ToggleButton tbpertanyaan1,tbpertanyaan2,tbpertanyaan3,tbpertanyaan4,tbpertanyaan5,tbpertanyaan6;
    Button btnkekp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        tbpertanyaan1 = (ToggleButton) findViewById(R.id.tb_pertanyaan1);
        tbpertanyaan2 = (ToggleButton) findViewById(R.id.tb_pertanyaan2);
        tbpertanyaan3 = (ToggleButton) findViewById(R.id.tb_pertanyaan3);
        tbpertanyaan4 = (ToggleButton) findViewById(R.id.tb_pertanyaan4);
        tbpertanyaan5 = (ToggleButton) findViewById(R.id.tb_pertanyaan5);
        tbpertanyaan6 = (ToggleButton) findViewById(R.id.tb_pertanyaan6);

        tvjawaban1 = (TextView) findViewById(R.id.tv_jawaban1);
        tvjawaban2 = (TextView) findViewById(R.id.tv_jawaban2);
        tvjawaban3 = (TextView) findViewById(R.id.tv_jawaban3);
        tvjawaban4 = (TextView) findViewById(R.id.tv_jawaban4);
        tvjawaban5 = (TextView) findViewById(R.id.tv_jawaban5);
        tvjawaban6 = (TextView) findViewById(R.id.tv_jawaban6);

        btnkekp = (Button) findViewById(R.id.btn_kekp);

        tvjawaban1.setVisibility(View.GONE);
        tvjawaban2.setVisibility(View.GONE);
        tvjawaban3.setVisibility(View.GONE);
        tvjawaban4.setVisibility(View.GONE);
        tvjawaban5.setVisibility(View.GONE);
        tvjawaban6.setVisibility(View.GONE);

        btnkekp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentkekp = new Intent(getApplicationContext(), KebijakanPrivasiActivity.class);

                startActivity(intentkekp);
            }
        });

        tbpertanyaan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean checked = tbpertanyaan1.isChecked();

                if (checked) {
                    tvjawaban1.setVisibility(View.VISIBLE);
                    //Digunakan untuk menyembunyikan TextView dan ImageView

                } else {
                    tvjawaban1.setVisibility(View.GONE);
                    //Digunakan untuk menampilkan lagi  TextView dan ImageView
                }


            }
        });

        tbpertanyaan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean checked = tbpertanyaan2.isChecked();

                if (checked) {
                    tvjawaban2.setVisibility(View.VISIBLE);
                    //Digunakan untuk menyembunyikan TextView dan ImageView

                } else {
                    tvjawaban2.setVisibility(View.GONE);
                    //Digunakan untuk menampilkan lagi  TextView dan ImageView
                }


            }
        });

        tbpertanyaan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean checked = tbpertanyaan3.isChecked();

                if (checked) {
                    tvjawaban3.setVisibility(View.VISIBLE);
                    //Digunakan untuk menyembunyikan TextView dan ImageView

                } else {
                    tvjawaban3.setVisibility(View.GONE);
                    //Digunakan untuk menampilkan lagi  TextView dan ImageView
                }


            }
        });

        tbpertanyaan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean checked = tbpertanyaan4.isChecked();

                if (checked) {
                    tvjawaban4.setVisibility(View.VISIBLE);
                    //Digunakan untuk menyembunyikan TextView dan ImageView

                } else {
                    tvjawaban4.setVisibility(View.GONE);
                    //Digunakan untuk menampilkan lagi  TextView dan ImageView
                }


            }
        });

        tbpertanyaan5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean checked = tbpertanyaan5.isChecked();

                if (checked) {
                    tvjawaban5.setVisibility(View.VISIBLE);
                    //Digunakan untuk menyembunyikan TextView dan ImageView

                } else {
                    tvjawaban5.setVisibility(View.GONE);
                    //Digunakan untuk menampilkan lagi  TextView dan ImageView
                }


            }
        });

        tbpertanyaan6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean checked = tbpertanyaan6.isChecked();

                if (checked) {
                    tvjawaban6.setVisibility(View.VISIBLE);
                    //Digunakan untuk menyembunyikan TextView dan ImageView

                } else {
                    tvjawaban6.setVisibility(View.GONE);
                    //Digunakan untuk menampilkan lagi  TextView dan ImageView
                }


            }
        });
    }
}
