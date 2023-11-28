package edu.hanu.hellojapan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.gridlayout.widget.GridLayout;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private GridLayout hiraGridView;
    private GridLayout kataGridView;
    private TextView txtHira;
    private TextView txtKata;
    private MediaPlayer media;
    private Button btnHira;
    private Button btnKata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the GridViews
        hiraGridView = findViewById(R.id.HiraLayout);
        kataGridView = findViewById(R.id.KataLayout);
        txtHira = findViewById(R.id.txtHira);
        txtKata = findViewById(R.id.txtKata);

        // Initialize the buttons and set the click listeners
        Button switchToHiraGridViewButton = findViewById(R.id.btnHira);
        Button switchToKataGridViewButton = findViewById(R.id.btnKata);

        switchToHiraGridViewButton.setOnClickListener(this);
        switchToKataGridViewButton.setOnClickListener(this);

        //ref for imgBtn
        ImageButton imgBtnA = findViewById(R.id.imgBtnA);
        ImageButton imgBtnI = findViewById(R.id.imgBtnI);
        ImageButton imgBtnU = findViewById(R.id.imgBtnU);
        ImageButton imgBtnE = findViewById(R.id.imgBtnE);
        ImageButton imgBtnO = findViewById(R.id.imgBtnO);

        ImageButton imgBtnKa = findViewById(R.id.imgBtnKa);
        ImageButton imgBtnKi = findViewById(R.id.imgBtnKi);
        ImageButton imgBtnKu = findViewById(R.id.imgBtnKu);
        ImageButton imgBtnKe = findViewById(R.id.imgBtnKe);
        ImageButton imgBtnKo = findViewById(R.id.imgBtnKo);

        ImageButton imgBtnSa = findViewById(R.id.imgBtnSa);
        ImageButton imgBtnShi = findViewById(R.id.imgBtnShi);
        ImageButton imgBtnSu = findViewById(R.id.imgBtnSu);
        ImageButton imgBtnSe = findViewById(R.id.imgBtnSe);
        ImageButton imgBtnSo = findViewById(R.id.imgBtnSo);

        ImageButton imgBtnTa = findViewById(R.id.imgBtnTa);
        ImageButton imgBtnChi = findViewById(R.id.imgBtnChi);
        ImageButton imgBtnTsu = findViewById(R.id.imgBtnTsu);
        ImageButton imgBtnTe = findViewById(R.id.imgBtnTe);
        ImageButton imgBtnTo = findViewById(R.id.imgBtnTo);

        ImageButton imgBtnNa = findViewById(R.id.imgBtnNa);
        ImageButton imgBtnNi = findViewById(R.id.imgBtnNi);
        ImageButton imgBtnNu = findViewById(R.id.imgBtnNu);
        ImageButton imgBtnNe = findViewById(R.id.imgBtnNe);
        ImageButton imgBtnNo = findViewById(R.id.imgBtnNo);

        ImageButton imgBtnHa = findViewById(R.id.imgBtnHa);
        ImageButton imgBtnHi = findViewById(R.id.imgBtnHi);
        ImageButton imgBtnFu = findViewById(R.id.imgBtnFu);
        ImageButton imgBtnHe = findViewById(R.id.imgBtnHe);
        ImageButton imgBtnHo = findViewById(R.id.imgBtnHo);

        ImageButton imgBtnMa = findViewById(R.id.imgBtnMa);
        ImageButton imgBtnMi = findViewById(R.id.imgBtnMi);
        ImageButton imgBtnMu = findViewById(R.id.imgBtnMu);
        ImageButton imgBtnMe = findViewById(R.id.imgBtnMe);
        ImageButton imgBtnMo = findViewById(R.id.imgBtnMo);

        ImageButton imgBtnYa = findViewById(R.id.imgBtnYa);
        ImageButton imgBtnYu = findViewById(R.id.imgBtnYu);
        ImageButton imgBtnYo = findViewById(R.id.imgBtnYo);

        ImageButton imgBtnRa = findViewById(R.id.imgBtnRa);
        ImageButton imgBtnRi = findViewById(R.id.imgBtnRi);
        ImageButton imgBtnRu = findViewById(R.id.imgBtnRu);
        ImageButton imgBtnRe = findViewById(R.id.imgBtnRe1);
        ImageButton imgBtnRo = findViewById(R.id.imgBtnRo);

        ImageButton imgBtnWa = findViewById(R.id.imgBtnWa);
        ImageButton imgBtnWo = findViewById(R.id.imgBtnWo);

        ImageButton imgBtnN = findViewById(R.id.imgBtnN);


        //Katakana
        ImageButton imgBtnA1 = findViewById(R.id.imgBtnA1);
        ImageButton imgBtnI1 = findViewById(R.id.imgBtnI1);
        ImageButton imgBtnU1 = findViewById(R.id.imgBtnU1);
        ImageButton imgBtnE1 = findViewById(R.id.imgBtnE1);
        ImageButton imgBtnO1 = findViewById(R.id.imgBtnO1);

        ImageButton imgBtnKa1 = findViewById(R.id.imgBtnKa1);
        ImageButton imgBtnKi1 = findViewById(R.id.imgBtnKi1);
        ImageButton imgBtnKu1 = findViewById(R.id.imgBtnKu1);
        ImageButton imgBtnKe1 = findViewById(R.id.imgBtnKe1);
        ImageButton imgBtnKo1 = findViewById(R.id.imgBtnKo1);

        ImageButton imgBtnSa1 = findViewById(R.id.imgBtnSa1);
        ImageButton imgBtnShi1 = findViewById(R.id.imgBtnShi1);
        ImageButton imgBtnSu1 = findViewById(R.id.imgBtnSu1);
        ImageButton imgBtnSe1 = findViewById(R.id.imgBtnSe1);
        ImageButton imgBtnSo1 = findViewById(R.id.imgBtnSo1);

        ImageButton imgBtnTa1 = findViewById(R.id.imgBtnTa1);
        ImageButton imgBtnChi1 = findViewById(R.id.imgBtnChi1);
        ImageButton imgBtnTsu1 = findViewById(R.id.imgBtnTsu1);
        ImageButton imgBtnTe1 = findViewById(R.id.imgBtnTe1);
        ImageButton imgBtnTo1 = findViewById(R.id.imgBtnTo1);

        ImageButton imgBtnNa1 = findViewById(R.id.imgBtnNa1);
        ImageButton imgBtnNi1 = findViewById(R.id.imgBtnNi1);
        ImageButton imgBtnNu1 = findViewById(R.id.imgBtnNu1);
        ImageButton imgBtnNe1 = findViewById(R.id.imgBtnNe1);
        ImageButton imgBtnNo1 = findViewById(R.id.imgBtnNo1);

        ImageButton imgBtnHa1 = findViewById(R.id.imgBtnHa1);
        ImageButton imgBtnHi1 = findViewById(R.id.imgBtnHi1);
        ImageButton imgBtnFu1 = findViewById(R.id.imgBtnFu1);
        ImageButton imgBtnHe1 = findViewById(R.id.imgBtnHe1);
        ImageButton imgBtnHo1 = findViewById(R.id.imgBtnHo1);

        ImageButton imgBtnMa1 = findViewById(R.id.imgBtnMa1);
        ImageButton imgBtnMi1 = findViewById(R.id.imgBtnMi1);
        ImageButton imgBtnMu1 = findViewById(R.id.imgBtnMu1);
        ImageButton imgBtnMe1 = findViewById(R.id.imgBtnMe1);
        ImageButton imgBtnMo1 = findViewById(R.id.imgBtnMo1);

        ImageButton imgBtnYa1 = findViewById(R.id.imgBtnYa1);
        ImageButton imgBtnYu1 = findViewById(R.id.imgBtnYu1);
        ImageButton imgBtnYo1 = findViewById(R.id.imgBtnYo1);

        ImageButton imgBtnRa1 = findViewById(R.id.imgBtnRa1);
        ImageButton imgBtnRi1 = findViewById(R.id.imgBtnRi1);
        ImageButton imgBtnRu1 = findViewById(R.id.imgBtnRu1);
        ImageButton imgBtnRe1 = findViewById(R.id.imgBtnRe1);
        ImageButton imgBtnRo1 = findViewById(R.id.imgBtnRo1);

        ImageButton imgBtnWa1 = findViewById(R.id.imgBtnWa1);
        ImageButton imgBtnWo1 = findViewById(R.id.imgBtnWo1);

        ImageButton imgBtnN1 = findViewById(R.id.imgBtnN1);


        //handle click - play sound
        imgBtnA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.a);
                media.start();
            }
        });
        imgBtnI1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.i);
                media.start();
            }
        });
        imgBtnU1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.u);
                media.start();
            }
        });
        imgBtnE1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.e);
                media.start();
            }
        });
        imgBtnO1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.o);
                media.start();
            }
        });

        // row 2
        imgBtnKa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ka);
                media.start();
            }
        });
        imgBtnKi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ki);
                media.start();
            }
        });
        imgBtnKu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ku);
                media.start();
            }
        });
        imgBtnKe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ke);
                media.start();
            }
        });
        imgBtnKo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ko);
                media.start();
            }
        });

        //row 3
        imgBtnSa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.sa);
                media.start();
            }
        });
        imgBtnShi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.shi);
                media.start();
            }
        });
        imgBtnSu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.su);
                media.start();
            }
        });
        imgBtnSe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.se);
                media.start();
            }
        });
        imgBtnSo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.so);
                media.start();
            }
        });

        // row 4
        imgBtnTa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ta);
                media.start();
            }
        });
        imgBtnChi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.chi);
                media.start();
            }
        });
        imgBtnTsu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.tsu);
                media.start();
            }
        });
        imgBtnTe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.te);
                media.start();
            }
        });
        imgBtnTo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.to);
                media.start();
            }
        });

        //row 5
        imgBtnNa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.na);
                media.start();
            }
        });
        imgBtnNi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ni);
                media.start();
            }
        });
        imgBtnNu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.nu);
                media.start();
            }
        });
        imgBtnNe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ne);
                media.start();
            }
        });
        imgBtnNo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.no);
                media.start();
            }
        });

        //row 6
        imgBtnHa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ha);
                media.start();
            }
        });
        imgBtnHi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.hi);
                media.start();
            }
        });
        imgBtnFu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.fu);
                media.start();
            }
        });
        imgBtnHe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.he);
                media.start();
            }
        });
        imgBtnHo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ho);
                media.start();
            }
        });

        //row 7
        imgBtnMa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ma);
                media.start();
            }
        });
        imgBtnMi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.mi);
                media.start();
            }
        });
        imgBtnMu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.mu);
                media.start();
            }
        });
        imgBtnMe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.me);
                media.start();
            }
        });
        imgBtnMo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.mo);
                media.start();
            }
        });

        //row 8
        imgBtnYa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ya);
                media.start();
            }
        });
        imgBtnYu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.yu);
                media.start();
            }
        });
        imgBtnYo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.yo);
                media.start();
            }
        });

        // row 9
        imgBtnRa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ra);
                media.start();
            }
        });
        imgBtnRi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ri);
                media.start();
            }
        });
        imgBtnRu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ru);
                media.start();
            }
        });
        imgBtnRe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.re);
                media.start();
            }
        });
        imgBtnRo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ro);
                media.start();
            }
        });

        //row 10
        imgBtnWa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.wa);
                media.start();
            }
        });
        imgBtnWo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.wo);
                media.start();
            }
        });


        // row 11
        imgBtnN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.n);
                media.start();
            }
        });


        imgBtnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.a);
                media.start();
            }
        });
        imgBtnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.i);
                media.start();
            }
        });
        imgBtnU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.u);
                media.start();
            }
        });
        imgBtnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.e);
                media.start();
            }
        });
        imgBtnO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.o);
                media.start();
            }
        });

        // row 2
        imgBtnKa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ka);
                media.start();
            }
        });
        imgBtnKi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ki);
                media.start();
            }
        });
        imgBtnKu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ku);
                media.start();
            }
        });
        imgBtnKe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ke);
                media.start();
            }
        });
        imgBtnKo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ko);
                media.start();
            }
        });

        //row 3
        imgBtnSa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.sa);
                media.start();
            }
        });
        imgBtnShi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.shi);
                media.start();
            }
        });
        imgBtnSu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.su);
                media.start();
            }
        });
        imgBtnSe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.se);
                media.start();
            }
        });
        imgBtnSo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.so);
                media.start();
            }
        });

        // row 4
        imgBtnTa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ta);
                media.start();
            }
        });
        imgBtnChi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.chi);
                media.start();
            }
        });
        imgBtnTsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.tsu);
                media.start();
            }
        });
        imgBtnTe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.te);
                media.start();
            }
        });
        imgBtnTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.to);
                media.start();
            }
        });

        //row 5
        imgBtnNa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.na);
                media.start();
            }
        });
        imgBtnNi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ni);
                media.start();
            }
        });
        imgBtnNu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.nu);
                media.start();
            }
        });
        imgBtnNe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ne);
                media.start();
            }
        });
        imgBtnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.no);
                media.start();
            }
        });

        //row 6
        imgBtnHa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ha);
                media.start();
            }
        });
        imgBtnHi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.hi);
                media.start();
            }
        });
        imgBtnFu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.fu);
                media.start();
            }
        });
        imgBtnHe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.he);
                media.start();
            }
        });
        imgBtnHo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ho);
                media.start();
            }
        });

        //row 7
        imgBtnMa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ma);
                media.start();
            }
        });
        imgBtnMi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.mi);
                media.start();
            }
        });
        imgBtnMu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.mu);
                media.start();
            }
        });
        imgBtnMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.me);
                media.start();
            }
        });
        imgBtnMo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.mo);
                media.start();
            }
        });

        //row 8
        imgBtnYa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ya);
                media.start();
            }
        });
        imgBtnYu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.yu);
                media.start();
            }
        });
        imgBtnYo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.yo);
                media.start();
            }
        });

        // row 9
        imgBtnRa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ra);
                media.start();
            }
        });
        imgBtnRi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ri);
                media.start();
            }
        });
        imgBtnRu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ru);
                media.start();
            }
        });
        imgBtnRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.re);
                media.start();
            }
        });
        imgBtnRo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.ro);
                media.start();
            }
        });

        //row 10
        imgBtnWa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.wa);
                media.start();
            }
        });
        imgBtnWo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.wo);
                media.start();
            }
        });


        // row 11
        imgBtnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(media != null){
                    media.reset();
                }
                media = MediaPlayer.create(MainActivity.this, R.raw.n);
                media.start();
            }
        });

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnHira:
                kataGridView.setVisibility(View.GONE);
                hiraGridView.setVisibility(View.VISIBLE);
                txtHira.setVisibility(View.VISIBLE);
                txtKata.setVisibility(View.GONE);
                break;
            case R.id.btnKata:
                hiraGridView.setVisibility(View.GONE);
                kataGridView.setVisibility(View.VISIBLE);
                txtKata.setVisibility(View.VISIBLE);
                txtHira.setVisibility(View.GONE);
                break;

        }
    }


}