package com.example.juan.cuadernillorubio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button corregir = (Button) findViewById(R.id.btnCorregir);
        Button nivel1 = (Button) findViewById(R.id.btnNivel1);
        Button nivel2 = (Button) findViewById(R.id.btnNivel2);
        Button nivel3 = (Button) findViewById(R.id.btnNivel3);
        Button nivel4 = (Button) findViewById(R.id.btnNivel4);

        //Labels
        final TextView nivel = (TextView) findViewById(R.id.tvNivelNumero);
        final TextView Puntos = (TextView) findViewById(R.id.tvPuntuaje);
        final TextView num1 = (TextView) findViewById(R.id.tvNum1);
        final TextView num2 = (TextView) findViewById(R.id.tvNum2);
        final TextView ecuacion = (TextView) findViewById(R.id.tvEcuacion);

        //Textboxs
        final EditText textoNum1 = (EditText) findViewById(R.id.ptNum1);
        final EditText textoNum2 = (EditText) findViewById(R.id.ptNum2);

        //Por defecto Nivel 1 así que random
        num1.setText(nivel1Random());
        num2.setText(nivel1Random());

    }

    private String nivel1Random() {
        int num = (int) (Math.random() * 10);
        return String.valueOf(num);
    }

    private String nivel2Random() {
        int num = (int) (Math.random() * 100);
        return String.valueOf(num);
    }
}
