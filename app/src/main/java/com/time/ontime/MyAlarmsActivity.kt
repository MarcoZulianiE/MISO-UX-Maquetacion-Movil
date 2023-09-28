package com.time.ontime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MyAlarmsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_alarms)

        // Obtener una referencia al botón desde tu diseño XML
        val addBtn = findViewById<ImageButton>(R.id.imageButton8)

        // Configurar un OnClickListener para el botón
        addBtn.setOnClickListener(View.OnClickListener {
            // Crear un Intent para ir a la otra Actividad
            val intent = Intent(this, configureAlarmActivity::class.java)

            // Iniciar la otra Actividad
            startActivity(intent)
        })


        // Obtener una referencia al botón desde tu diseño XML
        val missionBtn = findViewById<ImageButton>(R.id.imageButton)

        // Configurar un OnClickListener para el botón
        missionBtn.setOnClickListener(View.OnClickListener {
            // Crear un Intent para ir a la otra Actividad
            val intent = Intent(this, MisionsActivity::class.java)

            // Iniciar la otra Actividad
            startActivity(intent)
        })


        // Obtener una referencia al botón desde tu diseño XML
        val alarm1Btn = findViewById<ImageButton>(R.id.alarmButton1)

        // Configurar un OnClickListener para el botón
        alarm1Btn.setOnClickListener(View.OnClickListener {
            // Crear un Intent para ir a la otra Actividad
            val intent = Intent(this, configureAlarmActivity::class.java)

            // Iniciar la otra Actividad
            startActivity(intent)
        })


        // Obtener una referencia al botón desde tu diseño XML
        val alarm2Btn = findViewById<ImageButton>(R.id.alarmButton2)

        // Configurar un OnClickListener para el botón
        alarm2Btn.setOnClickListener(View.OnClickListener {
            // Crear un Intent para ir a la otra Actividad
            val intent = Intent(this, configureAlarmActivity::class.java)

            // Iniciar la otra Actividad
            startActivity(intent)
        })


        // Obtener una referencia al botón desde tu diseño XML
        val alarm3Btn = findViewById<ImageButton>(R.id.alarmButton3)

        // Configurar un OnClickListener para el botón
        alarm3Btn.setOnClickListener(View.OnClickListener {
            // Crear un Intent para ir a la otra Actividad
            val intent = Intent(this, configureAlarmActivity::class.java)

            // Iniciar la otra Actividad
            startActivity(intent)
        })


        // Obtener una referencia al botón desde tu diseño XML
        val alarm4Btn = findViewById<ImageButton>(R.id.alarmButton4)

        // Configurar un OnClickListener para el botón
        alarm4Btn.setOnClickListener(View.OnClickListener {
            // Crear un Intent para ir a la otra Actividad
            val intent = Intent(this, configureAlarmActivity::class.java)

            // Iniciar la otra Actividad
            startActivity(intent)
        })

        // Obtener una referencia al botón desde tu diseño XML
        val alarm5Btn = findViewById<ImageButton>(R.id.alarmButton5)

        // Configurar un OnClickListener para el botón
        alarm5Btn.setOnClickListener(View.OnClickListener {
            // Crear un Intent para ir a la otra Actividad
            val intent = Intent(this, configureAlarmActivity::class.java)

            // Iniciar la otra Actividad
            startActivity(intent)
        })

        // Obtener una referencia al botón desde tu diseño XML
        val alarm6Btn = findViewById<ImageButton>(R.id.alarmButton6)

        // Configurar un OnClickListener para el botón
        alarm6Btn.setOnClickListener(View.OnClickListener {
            // Crear un Intent para ir a la otra Actividad
            val intent = Intent(this, configureAlarmActivity::class.java)

            // Iniciar la otra Actividad
            startActivity(intent)
        })

        // Obtener una referencia al botón desde tu diseño XML
        val alarm7Btn = findViewById<ImageButton>(R.id.alarmButton7)

        // Configurar un OnClickListener para el botón
        alarm7Btn.setOnClickListener(View.OnClickListener {
            // Crear un Intent para ir a la otra Actividad
            val intent = Intent(this, configureAlarmActivity::class.java)

            // Iniciar la otra Actividad
            startActivity(intent)
        })

        // Obtener una referencia al botón desde tu diseño XML
        val alarm8Btn = findViewById<ImageButton>(R.id.alarmButton8)

        // Configurar un OnClickListener para el botón
        alarm8Btn.setOnClickListener(View.OnClickListener {
            // Crear un Intent para ir a la otra Actividad
            val intent = Intent(this, configureAlarmActivity::class.java)

            // Iniciar la otra Actividad
            startActivity(intent)
        })

        // Obtener una referencia al botón desde tu diseño XML
        val alarm9Btn = findViewById<ImageButton>(R.id.alarmButton9)

        // Configurar un OnClickListener para el botón
        alarm9Btn.setOnClickListener(View.OnClickListener {
            // Crear un Intent para ir a la otra Actividad
            val intent = Intent(this, configureAlarmActivity::class.java)

            // Iniciar la otra Actividad
            startActivity(intent)
        })

        // Obtener una referencia al botón desde tu diseño XML
        val alarm10Btn = findViewById<ImageButton>(R.id.alarmButton10)

        // Configurar un OnClickListener para el botón
        alarm10Btn.setOnClickListener(View.OnClickListener {
            // Crear un Intent para ir a la otra Actividad
            val intent = Intent(this, configureAlarmActivity::class.java)

            // Iniciar la otra Actividad
            startActivity(intent)
        })

        // Obtener una referencia al botón desde tu diseño XML
        val alarm11Btn = findViewById<ImageButton>(R.id.alarmButton11)

        // Configurar un OnClickListener para el botón
        alarm11Btn.setOnClickListener(View.OnClickListener {
            // Crear un Intent para ir a la otra Actividad
            val intent = Intent(this, configureAlarmActivity::class.java)

            // Iniciar la otra Actividad
            startActivity(intent)
        })

        // Obtener una referencia al botón desde tu diseño XML
        val alarm12Btn = findViewById<ImageButton>(R.id.alarmButton12)

        // Configurar un OnClickListener para el botón
        alarm12Btn.setOnClickListener(View.OnClickListener {
            // Crear un Intent para ir a la otra Actividad
            val intent = Intent(this, configureAlarmActivity::class.java)

            // Iniciar la otra Actividad
            startActivity(intent)
        })
    }
}