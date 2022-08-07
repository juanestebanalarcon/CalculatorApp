package com.uao.calculator_alarcon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {

    //Atributos
    private Button   btn_suma,btn_resta,btn_multiplicar,btn_dividir;
    private TextView answer_section;
    private EditText numero_uno,numero_dos;

    @Override
    //Inicializar y enlazar componentes con las variables
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer_section = findViewById(R.id.answer_section);
        numero_uno = findViewById(R.id.numero_uno);
        numero_dos = findViewById(R.id.numero_dos);

        btn_suma = findViewById(R.id.btn_suma);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                answer_section.setText(suma(Integer.parseInt(numero_uno.getText().toString()),Integer.parseInt(numero_dos.getText().toString()))+"");
            }
        });
        btn_resta = findViewById(R.id.btn_resta);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                answer_section.setText(resta(Integer.parseInt(numero_uno.getText().toString()),Integer.parseInt(numero_dos.getText().toString()))+"");
            }
        });

        btn_multiplicar = findViewById(R.id.btn_multiplicar);
        btn_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                answer_section.setText(multiplicacion(Integer.parseInt(numero_uno.getText().toString()),Integer.parseInt(numero_dos.getText().toString()))+"");
            }
        });

        btn_dividir = findViewById(R.id.btn_dividir);
        btn_dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                answer_section.setText(division(Integer.parseInt(numero_uno.getText().toString()),Integer.parseInt(numero_dos.getText().toString()))+"");
            }
        });
    }
    private double suma(int numA,int numB){
        return numA+numB;
    }
    private double resta(int numA,int numB){
        return numA-numB;
    }
    private double multiplicacion(int numA,int numB){
        return numA*numB;
    }
    private double division(int numA,int numB){
        if(numB==0) return 0;
        return numA/numB;
    }
}