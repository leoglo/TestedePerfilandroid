package com.example.testedeperfil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class questao1 extends AppCompatActivity {

    private Button btn_I, btn_A, btn_C, btn_O;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1);

        btn_I = (Button) findViewById(R.id.btn_I);
        btn_A = (Button) findViewById(R.id.btn_A);
        btn_C = (Button) findViewById(R.id.btn_C);
        btn_O = (Button) findViewById(R.id.btn_O);


        btn_I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Animais animais = new Animais();
                animais.setI(animais.getI()+1);
                chamaNovoQuestionario();

            }
        });

        btn_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Animais animais = new Animais();
                animais.setA(animais.getA()+1);
                chamaNovoQuestionario();
            }
        });

        btn_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Animais animais = new Animais();
                animais.setC(animais.getC()+1);
                chamaNovoQuestionario();
            }
        });

        btn_O.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Animais animais = new Animais();
                animais.setO((animais.getO()+1));
                chamaNovoQuestionario();
            }
        });
    }
    private void chamaNovoQuestionario() {
        startActivity(new Intent(questao1.this, questao2.class));
        finish();
    }
}