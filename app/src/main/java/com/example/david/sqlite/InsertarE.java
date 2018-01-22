package com.example.david.sqlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsertarE extends AppCompatActivity {

    private MyDBAdapter dbAdapter;
    private EditText nombree, edade, cicloe, cursoe, notamediae;
    private Button botonAgregare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertar_e);

        nombree = (EditText) findViewById(R.id.editNombree);
        edade = (EditText) findViewById(R.id.editEdade);
        cicloe = (EditText) findViewById(R.id.editCicloe);
        cursoe = (EditText) findViewById(R.id.editCursoe);
        notamediae = (EditText) findViewById(R.id.editNotaMediae);
        
        dbAdapter = new MyDBAdapter(this);
        dbAdapter.open();

        botonAgregare = (Button) findViewById(R.id.botonAgregare) ;

        botonAgregare.setOnClickListener(new View.OnClickListener(){

            public void onClick (View v){

                dbAdapter.insertarEstudiante(nombree.getText().toString() , edade.getText().toString(), cicloe.getText().toString(),
                        cursoe.getText().toString(), notamediae.getText().toString());

                Toast.makeText(getApplicationContext(),"Estudiante Añadido", Toast.LENGTH_SHORT).show();

                Intent intent =  new Intent(InsertarE.this, Principal.class);
                startActivity(intent);

            }
        });
    }

}

