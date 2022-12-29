package br.com.alura.myapptest

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)
        basicAlert()
    }

    private val positiveButtonClick = { _: DialogInterface, _: Int ->
        Toast.makeText(applicationContext, android.R.string.yes, Toast.LENGTH_SHORT).show()
    }
    private val negativeButtonClick = { _: DialogInterface, _: Int ->
        Toast.makeText(applicationContext, android.R.string.no, Toast.LENGTH_SHORT).show()
    }
    private val neutralButtonClick = { _: DialogInterface, _: Int ->
        Toast.makeText(applicationContext, "Talvez", Toast.LENGTH_SHORT).show()
    }

    fun basicAlert() {
        val builder = AlertDialog.Builder(this)
        val button = findViewById<Button>(R.id.btnBasicAlert)
        button.setOnClickListener {
            with(builder)
            {
                setTitle("4Bus")
                setMessage("Voce esta certo disso?")
                setPositiveButton(
                    "Sim",
                    DialogInterface.OnClickListener(function = positiveButtonClick)
                )
                setNegativeButton(android.R.string.no, negativeButtonClick)
                setNeutralButton("Talvez", neutralButtonClick)
                show()
            }
        }
    }
}