package com.heltonbustos.ejemplosnackbar01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button btnMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMensaje = findViewById(R.id.btnMensaje);

        btnMensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar
                        .make(view, "Hola soy un SnackBar", Snackbar.LENGTH_SHORT)
                        .setAction("Lanzar Toast", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(MainActivity.this, "Hola soy un TOAST", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });
    }
}