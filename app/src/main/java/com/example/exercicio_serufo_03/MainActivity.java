package com.example.exercicio_serufo_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BotaoCalculoOnClick(View v){

        TextView resultado = (TextView)findViewById(R.id.resultado);
        EditText peso = (EditText) findViewById(R.id.peso);
        EditText altura = (EditText) findViewById(R.id.altura);

        int calculoPeso = Integer.parseInt(peso.getText().toString());
        float calculoAltura = Float.parseFloat(altura.getText().toString());

        float soma = calculoPeso / (calculoAltura * calculoAltura);
        if(soma < 17) {

            resultado.setText("Muito abaixo do peso!");
        }
        else if(soma > 17 && soma < 18.50) {

            resultado.setText("Abaixo do peso!");
        }
        else if(soma > 18.50 && soma < 25) {

            resultado.setText("Peso normal!");
        }
        else if(soma > 25 && soma < 29.99) {

            resultado.setText("Acima do peso!");
        }
        else if(soma > 29.99 && soma < 34.99) {

            resultado.setText("Obesidade I");
        }
        else if(soma > 34.99 && soma < 40) {

            resultado.setText("Obesidade II");
        }
        else {

            resultado.setText("Obesidade III");
        }
    }
}
