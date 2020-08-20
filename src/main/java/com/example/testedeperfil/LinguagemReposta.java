package com.example.testedeperfil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LinguagemReposta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linguagem_reposta);

        testelinguagem linguagem = new testelinguagem();

        final TextView lblpalavraAfirmacao = (TextView) findViewById(R.id.txtpalavrasdeafirmacao);
        String respostaA = String.valueOf(linguagem.getRespostaA());
        lblpalavraAfirmacao.setText("Palavras de Afirmação "+respostaA);

        final TextView lblAtosServico = (TextView) findViewById(R.id.txtatosdeservico);
        String respostaB = String.valueOf(linguagem.getRespostaB());
        lblAtosServico.setText("Atos de Serviço "+respostaB);

        final TextView lblTempoQualidade = (TextView) findViewById(R.id.txttempodequalidade);
        String respostaC = String.valueOf(linguagem.getRespostaC());
        lblTempoQualidade.setText("Tempo de qualidade "+respostaC);

        final TextView lblToqueFisico = (TextView) findViewById(R.id.txttoquefisico);
        String respostaD = String.valueOf(linguagem.getRespostaD());
        lblToqueFisico.setText("Toque físico "+respostaD);

        final TextView lblReceberPresentes = (TextView) findViewById(R.id.txtreceberpresentes);
        String respostaE = String.valueOf(linguagem.getRespostaE());
        lblReceberPresentes.setText("Receber Presentes "+respostaE);


    }
}