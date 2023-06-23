package com.example.practica_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void btnEnviar(View view){
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        EditText txtCedula=(EditText) findViewById(R.id.txtCedula);
        EditText txtNombre=(EditText) findViewById(R.id.txtNombre);
        EditText txtFecha=(EditText) findViewById(R.id.txtFecha);
        EditText txtCiudad=(EditText) findViewById(R.id.txtCiudad);
        EditText txtCorreo=(EditText) findViewById(R.id.txtCorreo);
        EditText txtTelefono=(EditText) findViewById(R.id.txtTelefono);
        RadioButton rbGenero= (RadioButton)findViewById(R.id.rbHombre);
        String genero ="";
        if(rbGenero.isChecked())
            genero="Hombre";
        else
            genero="Mujer";
        Bundle b =new Bundle();
        b.putString("CEDULA",txtCedula.getText().toString());
        b.putString("NOMBRE",txtNombre.getText().toString());
        b.putString("FECHA",txtFecha.getText().toString());
        b.putString("CIUDAD",txtCiudad.getText().toString());
        b.putString("CORREO",txtCorreo.getText().toString());
        b.putString("TELEFONO",txtTelefono.getText().toString());
        b.putString("GENERO",genero);
        intent.putExtras(b);
        startActivity(intent);
    }

    public void btnLimpiar(View view){
        EditText txtCedula=(EditText) findViewById(R.id.txtCedula);
        EditText txtNombre=(EditText) findViewById(R.id.txtNombre);
        EditText txtFecha=(EditText) findViewById(R.id.txtFecha);
        EditText txtCiudad=(EditText) findViewById(R.id.txtCiudad);
        EditText txtCorreo=(EditText) findViewById(R.id.txtCorreo);
        EditText txtTelefono=(EditText) findViewById(R.id.txtTelefono);
        txtCedula.setText("");
        txtNombre.setText("");
        txtFecha.setText("");
        txtCiudad.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
    }
}