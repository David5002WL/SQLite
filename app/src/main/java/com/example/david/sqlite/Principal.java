package com.example.david.sqlite;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Principal extends AppCompatActivity {

    private MyDBAdapter dbAdapter;
    private Button InsertarE, InsertarP, EliminarE, EliminarBD, Consultas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        InsertarE = (Button) findViewById(R.id.botonE);
        InsertarP = (Button) findViewById(R.id.botonP);
        EliminarE = (Button) findViewById(R.id.botonEliminare);
        EliminarBD = (Button) findViewById(R.id.botonEliminarBD);
        Consultas = (Button) findViewById(R.id.botonConsultas);

        dbAdapter = new MyDBAdapter(this);
        dbAdapter.open();

        InsertarE.setOnClickListener(new View.OnClickListener(){

            public void onClick (View v){
                Intent intent =  new Intent(Principal.this, InsertarE.class);
                startActivity(intent);
            }
        });

        InsertarP.setOnClickListener(new View.OnClickListener(){

            public void onClick (View v){
                Intent intent =  new Intent(Principal.this, InsertarP.class);
                startActivity(intent);
            }
        });

        EliminarE.setOnClickListener(new View.OnClickListener(){

            public void onClick (View v){
                Intent intent =  new Intent(Principal.this, EliminarE.class);
                startActivity(intent);
            }
        });

        EliminarBD.setOnClickListener(new View.OnClickListener(){

            public void onClick (View v){
                dbAdapter.borrarDB();
                Toast.makeText(getApplicationContext(),"Base de datos eliminada", Toast.LENGTH_SHORT).show();
            }
        });

        Consultas.setOnClickListener(new View.OnClickListener(){

            public void onClick (View v){
                Intent intent =  new Intent(Principal.this, Consultas.class);
                startActivity(intent);
            }
        });
    }
    //dbAdapter.insertarDisco("Redeemer of Souls", 2014);
    //dbAdapter.insertarDisco("Land of the Free", 1995);

}
