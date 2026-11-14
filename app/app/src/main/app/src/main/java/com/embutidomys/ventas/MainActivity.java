package com.embutidomys.ventas;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(24, 24, 24, 24);
        layout.setBackgroundColor(Color.WHITE);

        TextView titulo = new TextView(this);
        titulo.setText("App Venta Mys");
        titulo.setTextSize(28);
        titulo.setTextColor(Color.BLUE);
        layout.addView(titulo);

        TextView negocio = new TextView(this);
        negocio.setText("Embutido Mys - RD$");
        negocio.setTextSize(20);
        negocio.setTextColor(Color.BLACK);
        layout.addView(negocio);

        String[] opciones = {
            "Ventas", "Compras", "Inventario",
            "Clientes", "Suplidores", "Abonos",
            "Facturas"
        };

        for (String opcion : opciones) {
            Button boton = new Button(this);
            boton.setText(opcion);
            layout.addView(boton);
            boton.setOnClickListener(v ->
                Toast.makeText(this,
                    opcion + " - Próximamente",
                    Toast.LENGTH_SHORT).show()
            );
        }

        ScrollView pantalla = new ScrollView(this);
        pantalla.addView(layout);
        setContentView(pantalla);
    }
}
