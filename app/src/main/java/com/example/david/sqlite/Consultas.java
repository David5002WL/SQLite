package com.example.david.sqlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Consultas extends AppCompatActivity {

    private Button verTodo;
    private ListView listaConsultas;
    private MyDBAdapter dbAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultas);

        verTodo = (Button) findViewById(R.id.botonConsultaTodo);
        listaConsultas = (ListView) findViewById(R.id.ListView);


        verTodo.setOnClickListener(new View.OnClickListener(){

            public void onClick (View v){

                ArrayList<String> estudiantes = dbAdapter.recuperarTodoE();

                ArrayAdapter<String> adaptador = new ArrayAdapter<String>(Consultas.this, android.R.layout.simple_list_item_1, estudiantes);

                listaConsultas.setAdapter(adaptador);
            }
        });
    }
}
