package com.time.ontime

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class configureAlarmActivity : AppCompatActivity() {

    private val color1 = Color.parseColor("#43519A")
    private val color2 = Color.parseColor("#042338")

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configure_alarm)

        val btnMonday = findViewById<Button>(R.id.monday)
        val btnTuesday = findViewById<Button>(R.id.tuesday)
        val btnWednesday = findViewById<Button>(R.id.wednesday)
        val btnThursday = findViewById<Button>(R.id.thursday)
        val btnFriday = findViewById<Button>(R.id.friday)
        val btnSaturday = findViewById<Button>(R.id.saturday)
        val btnSunday = findViewById<Button>(R.id.sunday)

        val onClickListener = View.OnClickListener { view ->
            if (view is Button) {
                if (isColor1(view)) {
                    view.setBackgroundColor(color2)
                } else {
                    view.setBackgroundColor(color1)
                }
            }
        }

        btnMonday.setOnClickListener(onClickListener)
        btnTuesday.setOnClickListener(onClickListener)
        btnWednesday.setOnClickListener(onClickListener)
        btnThursday.setOnClickListener(onClickListener)
        btnFriday.setOnClickListener(onClickListener)
        btnSaturday.setOnClickListener(onClickListener)
        btnSunday.setOnClickListener(onClickListener)


        // Obtener una referencia al botón desde tu diseño XML
        val terminateBtn = findViewById<Button>(R.id.Cancelar)

        // Configurar un OnClickListener para el botón
        terminateBtn.setOnClickListener(View.OnClickListener {
            // Crear un Intent para ir a la otra Actividad
            val intent = Intent(this, MyAlarmsActivity::class.java)

            // Iniciar la otra Actividad
            startActivity(intent)
        })

        // Obtener una referencia al botón desde tu diseño XML
        val saveBtn = findViewById<Button>(R.id.Guardar)

        // Configurar un OnClickListener para el botón
        saveBtn.setOnClickListener(View.OnClickListener {
            // Crear un Intent para ir a la otra Actividad
            val intent = Intent(this, MyAlarmsActivity::class.java)

            // Iniciar la otra Actividad
            startActivity(intent)
        })
    }

    private fun isColor1(btn: Button): Boolean {
        if (btn.background is ColorDrawable) {
            val backgroundColor = (btn.background as ColorDrawable).color
            return backgroundColor == color1
        }
        return false
    }
}