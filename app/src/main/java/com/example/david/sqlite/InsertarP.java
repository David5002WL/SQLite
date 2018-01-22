package com.example.david.sqlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsertarP extends AppCompatActivity {

    private MyDBAdapter dbAdapter;
    private EditText nombrep, edadp, ciclop, cursop, despachop;
    private Button botonAgregarp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertar_p);

        nombrep = (EditText) findViewById(R.id.editNombrep);
        edadp = (EditText) findViewById(R.id.editEdadp);
        ciclop = (EditText) findViewById(R.id.editCiclop);
        cursop = (EditText) findViewById(R.id.editCursop);
        despachop = (EditText) findViewById(R.id.editDespachop);

        dbAdapter = new MyDBAdapter(this);
        dbAdapter.open();

        botonAgregarp = (Button) findViewById(R.id.botonAgregarp) ;

        botonAgregarp.setOnClickListener(new View.OnClickListener(){

            public void onClick (View v){

                dbAdapter.insertarProfesor(nombrep.getText().toString() , edadp.getText().toString(), ciclop.getText().toString(),
                        cursop.getText().toString(), despachop.getText().toString());

                Toast.makeText(getApplicationContext(),"Profesor Añadido", Toast.LENGTH_SHORT).show();

                Intent intent =  new Intent(InsertarP.this, Principal.class);
                startActivity(intent);

            }
        });
    }
}
