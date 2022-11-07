package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Calcular (View view){
        TextView resultado = (TextView)findViewById(R.id.resultado);
        EditText peso = (EditText) findViewById(R.id.peso);
        EditText altura = (EditText) findViewById(R.id.altura);

        int ps = Integer.parseInt(peso.getText().toString());
        float al = Float.parseFloat(altura.getText().toString());

        float resul = ps / (al * al);
        if (resul < 19 ){
            resultado.setText("Abaixo do peso");
        }
        else if (resul > 32 ){
            resultado.setText("Acima do peso");
        }
        else{
            resultado.setText("Peso normal");
        }
    }
}