package com.univalle.conversiones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class conversion extends AppCompatActivity {
    Button calcular;
    String uni;
    TextView num1,num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);
        String op= recibirDatos();
        calcular=(Button)findViewById(R.id.calcular);
        num1=(TextView)findViewById(R.id.dato);
        num2=(TextView)findViewById(R.id.dato2);
        switch (op){

            case"de celsius a farrenheit" :
                this.setTitle(R.string.c_f);
                uni="1";

                break;
            case"de kel a cel":
                this.setTitle(R.string.k_c);
                uni="2";
                break;
            case"de celsius a kel":
                this.setTitle(R.string.c_k);
                uni="3";
                break;
            case "de cm a m":
                this.setTitle(R.string.cm_m);
                uni="4";
                break;
            case"de metros a cm":
                this.setTitle(R.string.m_cm);
                uni="5";
                break;
            case"de cm a inch":
                this.setTitle(R.string.cm_inch);
                uni="6";
                break;
            case"de inch a cm":
                this.setTitle(R.string.inch_cm);
                uni="7";
                break;
            case"de far a cel":
                this.setTitle(R.string.f_c);
                uni="8";
                break;






        }
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (uni){
                    case"1":
                        try{
                            double a=Double.parseDouble( num1.getText().toString());
                            num2.setText(""+a*32+"f");

                        }catch (Exception e){
                            Toast toast1 =
                                    Toast.makeText(getApplicationContext(),
                                            "error", Toast.LENGTH_SHORT);

                            toast1.show();
                        }

                            break;
                    case"2"
                            :
                        try{
                            double a=Double.parseDouble( num1.getText().toString());
                            num2.setText(""+a*273+"k");

                        }catch (Exception e){
                            Toast toast1 =
                                    Toast.makeText(getApplicationContext(),
                                            "error", Toast.LENGTH_SHORT);

                            toast1.show();
                        }break;
                    case"3" :
                        try{
                            double a=Double.parseDouble( num1.getText().toString());
                            num2.setText(""+a/273+"k");

                        }catch (Exception e){
                            Toast toast1 =
                                    Toast.makeText(getApplicationContext(),
                                            "error", Toast.LENGTH_SHORT);

                            toast1.show();
                        }break;
                    case"4" :
                        try{
                            double a=Double.parseDouble( num1.getText().toString());
                            num2.setText(""+a*32);

                        }catch (Exception e){
                            Toast toast1 =
                                    Toast.makeText(getApplicationContext(),
                                            "error", Toast.LENGTH_SHORT);

                            toast1.show();
                        }break;
                    case"5" :
                        try{
                            double a=Double.parseDouble( num1.getText().toString());
                            num2.setText(""+a*32);

                        }catch (Exception e){
                            Toast toast1 =
                                    Toast.makeText(getApplicationContext(),
                                            "error", Toast.LENGTH_SHORT);

                            toast1.show();
                        }break;
                    case"6" :
                        try{
                            double a=Double.parseDouble( num1.getText().toString());
                            num2.setText(""+a*32);

                        }catch (Exception e){
                            Toast toast1 =
                                    Toast.makeText(getApplicationContext(),
                                            "error", Toast.LENGTH_SHORT);

                            toast1.show();
                        }break;
                    case"7" :
                        try{
                            double a=Double.parseDouble( num1.getText().toString());
                            num2.setText(""+a*32);

                        }catch (Exception e){
                            Toast toast1 =
                                    Toast.makeText(getApplicationContext(),
                                            "error", Toast.LENGTH_SHORT);

                            toast1.show();
                        }break;
                    case"8" :
                        try{
                            double a=Double.parseDouble( num1.getText().toString());
                            num2.setText(""+a*32);

                        }catch (Exception e){
                            Toast toast1 =
                                    Toast.makeText(getApplicationContext(),
                                            "error", Toast.LENGTH_SHORT);

                            toast1.show();
                        }break;


                }
            }
        });


    }
    private String recibirDatos(){
        Bundle extras = getIntent().getExtras();
        String d1 = extras.getString("dato01");
        return  d1;




        /*tvDatos = (TextView) findViewById(R.id.tvDatos);
        tvDatos.setText(d1+d2);*/
    }

}
