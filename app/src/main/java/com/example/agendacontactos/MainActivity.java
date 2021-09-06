package com.example.agendacontactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    public Button botonCancel;
    public Button botonOk;
    public DatePicker calendario;
    public LinearLayout Layoutcalendario;
    public TextInputEditText names;
    public TextInputEditText phones;
    public TextInputEditText emails;
    public TextInputEditText details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonCancel =(Button) findViewById(R.id.cancelButton);
        botonOk = (Button) findViewById(R.id.affimationButton);
        calendario=(DatePicker) findViewById(R.id.datePicker);
        Layoutcalendario=(LinearLayout) findViewById(R.id.LayoutSetView);
        names=(TextInputEditText) findViewById(R.id.nombreInput);
        phones=(TextInputEditText) findViewById(R.id.telefonoInput);
        emails=(TextInputEditText) findViewById(R.id.emailInput);
        details=(TextInputEditText) findViewById(R.id.descriptionInput);
        botonCancel.setEnabled(true);
        botonOk.setEnabled(true);
    }
    public void ActivateCancelButton(View view){
        botonCancel.setEnabled(false);
        botonOk.setEnabled(true);
        calendario.setEnabled(true);
        Layoutcalendario.setBackgroundResource(R.drawable.newrect);
    }
    public void ActivateOkButton(View view){
        botonCancel.setEnabled(true);
        botonOk.setEnabled(false);
        calendario.setEnabled(false);
        Layoutcalendario.setBackgroundResource(R.drawable.myrect);
    }
    public void ActivateSiguienteButton(View view){
        int dia= calendario.getDayOfMonth();
        int mes=calendario.getMonth();
        int year=calendario.getYear();
        Editable nombres = names.getText();
        Editable telefonos = phones.getText();
        Editable email=emails.getText();
        Editable detalles= details.getText();

        Intent intento=new Intent(MainActivity.this,ConfirmarDatos.class);

        intento.putExtra(getResources().getString(R.string.intentnombre),nombres.toString());
        intento.putExtra(getResources().getString(R.string.intenttelefono),telefonos.toString());
        intento.putExtra(getResources().getString(R.string.intentemail),email.toString());
        intento.putExtra(getResources().getString(R.string.intentdescripcion),detalles.toString());
        intento.putExtra(getResources().getString(R.string.intentdia),dia);
        intento.putExtra(getResources().getString(R.string.intentmes),mes);
        intento.putExtra(getResources().getString(R.string.intentyear),year);
        startActivity(intento);
    }


}