package com.example.testedeperfil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class telaAguia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_aguia);

        Animais animais = new Animais();
        final TextView lblLobo = (TextView) findViewById(R.id.txtLobo);
        String lobo = String.valueOf((animais.getO()*4));
        lblLobo.setText("Sua porcentagem de Lobo é "+lobo+"%");

        final TextView lblAguia = (TextView) findViewById(R.id.txtAguia);
        String aguia = String.valueOf((animais.getI()*4));
        lblAguia.setText("Sua porcentagem de Águia é "+aguia+"%");

        final TextView lblGato = (TextView) findViewById(R.id.txtGato);
        String gato = String.valueOf((animais.getC()*4));
        lblGato.setText("Sua porcentagem de gato é "+gato+"%");

        final TextView lblTubarao = (TextView) findViewById(R.id.txtTubarao);
        String tubarao = String.valueOf((animais.getA()*4));
        lblTubarao.setText("Sua porcentagem de tubarão é "+tubarao+"%");
    }
}