package com.example.espinozacampos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class SegundaPantalla : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_pantalla)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.title = "Espinoza Campos"
        supportActionBar?.subtitle = "Universidad Francisco Gavidia"
        supportActionBar?.setIcon(R.drawable.ic_launcher_foreground)


    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.ufg_toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.configuracion -> {
                Toast.makeText(this, "Usted ha seleccionado la opcion de configuracion 🧄", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.perfil-> {
                Toast.makeText(this, "Usted ha ver  🍕", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.mapa -> {
                Toast.makeText(this, "Usted ha seleccionado mapa 🎂", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.nuevaCuenta -> {
                Toast.makeText(this, "Usted ha seleccionado nueva cuenta 🌹", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.salir-> {
                Toast.makeText(this, "Usted ha seleccionado la de salir 🐱‍🏍", Toast.LENGTH_SHORT).show()
                true
            }
            else   -> false
        }
    }
}