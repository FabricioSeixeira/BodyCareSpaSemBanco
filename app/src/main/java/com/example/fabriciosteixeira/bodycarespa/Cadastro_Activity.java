package com.example.fabriciosteixeira.bodycarespa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Cadastro_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_layout);
    }

    public void ClickVoltar(View view) {
        Intent intent = new Intent(Cadastro_Activity.this,Login_Activity.class);
        startActivity(intent);
    }

    public void ClickConcluirCadastro(View view) {
        Toast.makeText(Cadastro_Activity.this,"In construction",Toast.LENGTH_SHORT).show();
    }
}
