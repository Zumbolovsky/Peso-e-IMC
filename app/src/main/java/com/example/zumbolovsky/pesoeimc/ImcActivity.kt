package com.example.zumbolovsky.pesoeimc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_imc.*

class ImcActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        val buttonCalular = btnCalcularImc
        buttonCalular.setOnClickListener{

            val textAltura = edtAlturaImc.text
            val textPeso = edtPesoImc.text

            if (textAltura.trim().isEmpty() || textPeso.trim().isEmpty()) {
                Toast.makeText(this, "Valor Inválido!", Toast.LENGTH_LONG)
            } else {
                val valorAltura = textAltura.toString().toFloat()
                val valorPeso = textPeso.toString().toFloat()

                val imc = valorPeso/ (valorAltura * valorAltura)

                val alerta = when {
                    imc < 18.5              -> "BAIXO PESO: PESO ABAIXO DE 18.5"
                    imc >= 18.5 && imc < 25 -> "PESO NORMAL: ENTRE 18.5 E 24.9"
                    imc >= 25 && imc < 30   -> "SOBREPESO: ENTRE 25 E 29.9"
                    imc >= 30 && imc < 35   -> "OBESIDADE GRAU I: ENTRE 30 E 34.9"
                    imc >= 35 && imc < 40   -> "OBESIDADE GRAU II: ENTRE 35 E 39.9"
                    else                    -> "OBESIDADE GRAU III: MAIOR QUE 40"
                }

                Toast.makeText(this, alerta, Toast.LENGTH_LONG).show()
            }
        }


    }
}
