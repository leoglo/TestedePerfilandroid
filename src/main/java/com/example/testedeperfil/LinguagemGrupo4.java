package com.example.testedeperfil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LinguagemGrupo4 extends AppCompatActivity {

    int A , B, C, D, E;
    EditText respostaA;
    EditText respostaB;
    EditText respostaC;
    EditText respostaD;
    EditText respostaE;
    private Button proximo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linguagem_grupo4);
        respostaA =(EditText) findViewById(R.id.respA);
        respostaB =(EditText) findViewById(R.id.respB);
        respostaC =(EditText) findViewById(R.id.respC);
        respostaD =(EditText) findViewById(R.id.respD);
        respostaE =(EditText) findViewById(R.id.respE);
        proximo = (Button) findViewById(R.id.btnProximo);

// *************************************************************

        proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A = Integer.valueOf(naonulo(respostaA.getText().toString()));
                B = Integer.valueOf(naonulo(respostaB.getText().toString()));
                C = Integer.valueOf(naonulo(respostaC.getText().toString()));
                D = Integer.valueOf(naonulo(respostaD.getText().toString()));
                E = Integer.valueOf(naonulo(respostaE.getText().toString()));


                if ((A < 6 && A > 0) && (B < 6 && B > 0) && (C < 6 && C > 0) && (D < 6 && D > 0) && (E < 6 && E > 0)) {
                    if ((A != B) && (A != C) && (A != D) && (A != E)) {
                        if ((B != C) && (B != D) && (B != E)) {
                            if ((C != D) && (C != E)) {
                                if (D != E) {
                                    testelinguagem teste = new testelinguagem();
                                    teste.setRespostaA(teste.getRespostaA() + A);
                                    teste.setRespostaB(teste.getRespostaB() + B);
                                    teste.setRespostaC(teste.getRespostaC() + C);
                                    teste.setRespostaD(teste.getRespostaD() + D);
                                    teste.setRespostaE(teste.getRespostaE() + E);

                                    chamaNovoQuestionario();
                                } else {
                                    mensangemdeerro();
                                }
                            } else {
                                mensangemdeerro();
                            }
                        } else {
                            mensangemdeerro();
                        }
                    } else {
                        mensangemdeerro();
                    }
                }
                else {
                    mensangemdeerro();
                }
            }
        });
    }
    private String naonulo(String entrada) {
        if(entrada.isEmpty()){
            return "0";
        }
        else{
            return entrada;
        }
    }

    private void mensangemdeerro() {
        Toast.makeText(LinguagemGrupo4.this,"Valor da entrada incorreta",Toast.LENGTH_SHORT).show();
    }

    private void chamaNovoQuestionario() {
        startActivity(new Intent(LinguagemGrupo4.this, LinguagemGrupo5.class));
        finish();
    }

}