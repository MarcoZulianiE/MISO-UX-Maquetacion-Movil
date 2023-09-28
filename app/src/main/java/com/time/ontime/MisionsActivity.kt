package com.time.ontime

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MisionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_misions)

        // Obtener una referencia al botón desde tu diseño XML
        val goBackBtn = findViewById<Button>(R.id.Regresar)

        // Configurar un OnClickListener para el botón
        goBackBtn.setOnClickListener(View.OnClickListener {
            // Crear un Intent para ir a la otra Actividad
            val intent = Intent(this, MyAlarmsActivity::class.java)

            // Iniciar la otra Actividad
            startActivity(intent)
        })
    }
}
