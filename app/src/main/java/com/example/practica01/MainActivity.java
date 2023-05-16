package com.example.practica01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnPulsar;
    private EditText txtNombre;
    private TextView lblSaludar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Relacionar los objetos
        btnPulsar= (Button) findViewById(R.id.btnSaludar);
        txtNombre= (EditText) findViewById(R.id.txtNombre);
        lblSaludar=(TextView) findViewById(R.id.lblSaludo);
        //Codificar el evento clic del Boton
        btnPulsar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Validar
                if(txtNombre.getText().toString().matches(""))
                {
                    Toast.makeText(MainActivity.this,"Falto Capturar Información",Toast.LENGTH_SHORT).show();
                }
                else {
                    String str= "Hola "+txtNombre.getText().toString()+" ¿Como estas?";

                }
            }
        });
    }

}