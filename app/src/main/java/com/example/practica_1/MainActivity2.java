package com.example.practica_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txtDatos= (TextView) findViewById(R.id.txtvDatos);
        Bundle b = this.getIntent().getExtras();
        txtDatos.setText("Cédula: " + b.getString("CEDULA") + "\n" +
                "Nombre: " + b.getString("NOMBRE") + "\n" +
                "Fecha: " + b.getString("FECHA") + "\n" +
                "Genero: " + b.getString("GENERO") + "\n" +
                "Ciudad: " + b.getString("CIUDAD") + "\n" +
                "Correo: " + b.getString("CORREO") + "\n" +
                "Telefono: " + b.getString("TELEFONO") + "\n");
    }
}