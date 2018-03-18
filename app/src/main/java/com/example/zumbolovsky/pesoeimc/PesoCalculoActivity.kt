package com.example.zumbolovsky.pesoeimc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_peso_calculo.*

class PesoCalculoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peso_calculo)

        val buttonCalcular = btnCalcularIdeal
        buttonCalcular.setOnClickListener {
            var textAltura = edtAlturaIdeal.text
            val textResultado = txtResultado
            val intent = intent
            val extra = intent.getStringExtra(MainActivity::BUTTON_KEY.name)

            if (textAltura.trim().isEmpty()) {
                Toast.makeText(this, "Valor Inválido!", Toast.LENGTH_LONG).show()
            } else {
                val valorAltura = textAltura.toString().toFloat()
                if (extra == MainActivity::HOMEM_VALUE.name) {
                    textResultado.text = this.caluloHomem(valorAltura)
                } else if (extra == MainActivity::MULHER_VALUE.name) {
                    textResultado.text = this.calculoMulher(valorAltura)
                }
            }
        }
    }

    fun caluloHomem(valorAltura: Float) : String {
        return ((valorAltura - 100.0) * 0.90).toString()
    }

    fun calculoMulher(valorAltura: Float) : String{
        return ((valorAltura - 100.0) * 0.85).toString()
    }

}
