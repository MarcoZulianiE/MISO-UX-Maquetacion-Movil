package com.time.ontime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Obtener una referencia al botón desde tu diseño XML
        val loginBtn = findViewById<Button>(R.id.button2)

        // Configurar un OnClickListener para el botón
        loginBtn.setOnClickListener(View.OnClickListener {
            // Crear un Intent para ir a la otra Actividad
            val intent = Intent(this, LogInActivity::class.java)

            // Iniciar la otra Actividad
            startActivity(intent)
        })

        // Obtener una referencia al botón desde tu diseño XML
        val registerBtn = findViewById<Button>(R.id.button)

        // Configurar un OnClickListener para el botón
        registerBtn.setOnClickListener(View.OnClickListener {
            // Crear un Intent para ir a la otra Actividad
            val intent = Intent(this, RegisterActivity::class.java)

            // Iniciar la otra Actividad
            startActivity(intent)
        })
    }
}