package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btGuardar(View view){
        EditText txtNombre = (EditText)findViewById(R.id.txtNombre);
        EditText txtApellido = (EditText)findViewById(R.id.txtApellido);
        RadioButton rbMascu = (RadioButton) findViewById(R.id.rbMascu);
        Switch swNotificaciones = (Switch)findViewById(R.id.swAlerta);
        CalendarView cvEdad = (CalendarView)findViewById(R.id.cvEdad);

        String genero, nombre, apellido, notificaciones, edad;
        nombre = txtNombre.getText().toString();
        apellido = txtApellido.getText().toString();
        notificaciones = swNotificaciones.isChecked()?"SI":"NO";
        genero = "Estimad" + (rbMascu.isChecked()?"o":"a");
        edad = cvEdad.toString();

        Toast.makeText(this.getApplicationContext(),
                "Hola, "+ genero + " " + nombre + " " + apellido
                + ", Notificaciones" + notificaciones, Toast.LENGTH_LONG).show();

        Intent intent = new Intent(MainActivity.this,MainActivity2.class);

        Bundle b = new Bundle();
        b.putString("NOMBRE", nombre);
        b.putString("APELLIDO", apellido);
        b.putString("NOTIFICACIONES", notificaciones);
        b.putString("GENERO", genero);
        b.putString("EDAD", edad);
        intent.putExtras(b);
        startActivity(intent);

    }
}