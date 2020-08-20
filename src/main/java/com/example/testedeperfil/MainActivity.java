package com.example.testedeperfil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonComportamento;
    private Button buttonLinguagem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonComportamento = (Button) findViewById(R.id.btncmoportamental);
        buttonComportamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TelaApresentacaoTestePerfil.class));
                finish();
            }
        });

        buttonLinguagem = (Button) findViewById(R.id.btnliguagem);
        buttonLinguagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TelaApresentacaoTesteLiguagem.class));
                finish();
            }
        });

    }
}