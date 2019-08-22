package com.example.operacionesmatematicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numero1, numero2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = (EditText)(findViewById(R.id.txtNumero1));
        numero2 = (EditText)(findViewById(R.id.txtNumero2));
        resultado = (TextView)(findViewById(R.id.lblResultado));
    }


    public void sumar(View view)
    {
        double num1 = Double.parseDouble(numero1.getText().toString());
        double num2 = Double.parseDouble(numero2.getText().toString());
        resultado.setVisibility(View.VISIBLE);
        resultado.setText(String.valueOf(num1 + num2 ));
    }

    public void restar(View view)
    {
        double num1 = Double.parseDouble(numero1.getText().toString());
        double num2 = Double.parseDouble(numero2.getText().toString());
        resultado.setVisibility(View.VISIBLE);
        resultado.setText(String.valueOf(num1 - num2 ));
    }

    public void Multiplica(View view)
    {
        double num1 = Double.parseDouble(numero1.getText().toString());
        double num2 = Double.parseDouble(numero2.getText().toString());
        resultado.setVisibility(View.VISIBLE);
        resultado.setText(String.valueOf(num1 * num2 ));
    }

    public void Divide(View view)
    {
        double num1 = Double.parseDouble(numero1.getText().toString());
        double num2 = Double.parseDouble(numero2.getText().toString());
        resultado.setVisibility(View.VISIBLE);
        resultado.setText(String.valueOf(num1 / num2 ));
    }

}
