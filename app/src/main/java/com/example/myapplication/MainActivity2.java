package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txtSaludo = (TextView)findViewById(R.id.txtMensaje);
        Bundle bundle = this.getIntent().getExtras();
        txtSaludo.setText("Hola!, " + bundle.getString("GENERO") +
                "\n " + bundle.getString("NOMBRE") +
                " " + bundle.getString("APELLIDO") +
                "Recibe notificaciones " +
                bundle.getString("NOTIFICACIONES") + bundle.getString("EDAD")
                + "\n. Se ha creado el contacto correctamente!");

    }
}