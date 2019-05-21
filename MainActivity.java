package com.univalle.conversiones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    public Button c_f;
    public Button f_c;
    public Button c_k;
    public Button k_c;
    public Button m_cm;
    public Button cm_m;
    public Button cm_in;
    public Button in_cm;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c_f=(Button)findViewById(R.id.cel_far);
        f_c=(Button)findViewById(R.id.far_cel);
        c_k=(Button)findViewById(R.id.cel_kel);
        k_c=(Button)findViewById(R.id.kel_cel);
        m_cm=(Button)findViewById(R.id.m_cm);
        cm_m=(Button)findViewById(R.id.cm_m);
        cm_in=(Button)findViewById(R.id.cm_inch);
        in_cm=(Button)findViewById(R.id.inch_cm);


        c_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, conversion.class);
                i.putExtra("dato01","de celsius a farrenheit");
                i.putExtra("dato02","...");
                startActivity(i);
            }
        });
        k_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, conversion.class);
                i.putExtra("dato01","de kel a cel");

                startActivity(i);
            }
        });
        c_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, conversion.class);
                i.putExtra("dato01","de celsius a kel");

                startActivity(i);
            }
        });
        cm_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, conversion.class);
                i.putExtra("dato01","de cm a m");

                startActivity(i);
            }
        });
        m_cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, conversion.class);
                i.putExtra("dato01","de metros a cm");
                i.putExtra("dato02","...");
                startActivity(i);
            }
        });
        cm_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, conversion.class);
                i.putExtra("dato01","de cm a inch");
                i.putExtra("dato02","...");
                startActivity(i);
            }
        });
        in_cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, conversion.class);
                i.putExtra("dato01","de inch a cm");

                startActivity(i);
            }
        });
        f_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, conversion.class);
                i.putExtra("dato01","de far a cel");

                startActivity(i);
            }
        });



    }



}
