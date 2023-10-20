package br.ulbra.apostila3_trocadetela;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    Button btnTelaPrincipal1, btnTela2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CarregarTelaPrincipal();
    }
    public void CarregarTelaPrincipal() {
        setContentView(R.layout.activity_main);
        btnTela2 = (Button) findViewById(R.id.btnTela2);
        btnTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTela2(); } });
    }
    public void CarregarTela2() {
        setContentView(R.layout.tela2);
        btnTelaPrincipal1 = (Button) findViewById (R.id.btnTelaPrincipal1);
        btnTelaPrincipal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaPrincipal();
            }
        });
    } }