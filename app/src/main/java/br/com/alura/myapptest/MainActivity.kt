package br.com.alura.myapptest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_principal)
        val button = findViewById<Button>(R.id.B1)
        button.setOnClickListener()
        {
            Toast.makeText(this, R.string.message, Toast.LENGTH_LONG).show()
        }
        proximaTela()
    }

    fun proximaTela() {
        val button: Button = findViewById(R.id.B2)
        button.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }
}



