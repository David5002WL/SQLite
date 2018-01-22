package com.example.david.sqlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EliminarE extends AppCompatActivity {

    private MyDBAdapter dbAdapter;
    private EditText editId;
    private Button botonDeletee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminar_e);

        editId = (EditText) findViewById(R.id.editId);
        botonDeletee = (Button) findViewById(R.id.botonDeletee);

        dbAdapter = new MyDBAdapter(this);
        dbAdapter.open();

        botonDeletee.setOnClickListener(new View.OnClickListener(){

            public void onClick (View v){

                dbAdapter.eliminarEstudiante(editId.getText().toString());

                Toast.makeText(getApplicationContext(),"Registro Eliminado", Toast.LENGTH_SHORT).show();

                Intent intent =  new Intent(EliminarE.this, Principal.class);
                startActivity(intent);
            }
        });

    }
}
