package com.example.testedeperfil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class questao25 extends AppCompatActivity {

    private Button btn_I, btn_A, btn_C, btn_O;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao25);

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
                decisao();
            }
        });

        btn_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Animais animais = new Animais();
                animais.setA(animais.getA()+1);
                decisao();
            }
        });

        btn_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Animais animais = new Animais();
                animais.setC(animais.getC()+1);
                decisao();
            }
        });

        btn_O.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Animais animais = new Animais();
                animais.setO((animais.getO()+1));
                decisao();
            }
        });
    }
    private void decisao() {
       Animais animais = new Animais();
       if((animais.getI()>animais.getA())&&(animais.getI()>animais.getO())&&(animais.getI()>animais.getC()))
       {
           startActivity(new Intent(questao25.this, telaAguia.class));
       }
       else if((animais.getA()>animais.getO())&&(animais.getA()>animais.getC())){
           startActivity(new Intent(questao25.this, telaTubarao.class));
       }
       else if((animais.getO()>animais.getC())){
           startActivity(new Intent(questao25.this, telaLobo.class));
       }
       else{
            startActivity(new Intent(questao25.this, telaGato.class));
       }
        finish();
    }
}