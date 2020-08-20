package com.example.testedeperfil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TelaApresentacaoTesteLiguagem extends AppCompatActivity {

    private Button buttonconfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_apresentacao_teste_linguagem);

        buttonconfirmar = (Button) findViewById(R.id.button);

        buttonconfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                botaaoAtivarQuest();
            }
        });

    }

    private void botaaoAtivarQuest() {
        startActivity(new Intent(TelaApresentacaoTesteLiguagem.this, LinguagemGrupo1.class));
        finish();
    }
}