package com.example.agendacontactos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ConfirmarDatos extends AppCompatActivity {
    TextView textonombre;
    TextView textoemail;
    TextView textotelefono;
    TextView textodescripcion;
    TextView textofecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        Bundle parametros=getIntent().getExtras();
        String nombre = parametros.getString(getResources().getString(R.string.intentnombre));
        String email = parametros.getString(getResources().getString(R.string.intentemail));
        String telefono = parametros.getString(getResources().getString(R.string.intenttelefono));
        String descripcion = parametros.getString(getResources().getString(R.string.intentdescripcion));
        int dia = parametros.getInt(getResources().getString(R.string.intentdia));
        int mes = parametros.getInt(getResources().getString(R.string.intentmes));
        int year = parametros.getInt(getResources().getString(R.string.intentyear));
        String fecha= dia+"/"+(mes+1)+"/"+year;


        textonombre= (TextView) findViewById(R.id.nombreBundle);
        textoemail=(TextView) findViewById(R.id.emailBundle);
        textotelefono=(TextView) findViewById(R.id.telefonoBundle);
        textodescripcion=(TextView) findViewById(R.id.descripcionBundle);
        textofecha=(TextView) findViewById(R.id.fechaBundle);

        textonombre.setText(nombre);
        textoemail.setText(email);
        textotelefono.setText(telefono);
        textodescripcion.setText(descripcion);
        textofecha.setText(fecha);

    }

    public void EditarDatosActivity(View view){
    finish();
    }
}