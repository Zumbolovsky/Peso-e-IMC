package com.example.zumbolovsky.pesoeimc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val BUTTON_KEY = "BUTTON_KEY"
    val HOMEM_VALUE = "HOMEM_VALUE"
    val MULHER_VALUE = "MULHER_VALUE"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoPesoHomem = btnPesoHomem
        botaoPesoHomem.setOnClickListener{
            val main = Intent(this, PesoCalculoActivity::class.java)
            main.putExtra(BUTTON_KEY, HOMEM_VALUE)
            startActivity(main)
        }

        val botaoPesoMulher = btnPesoMulher
        botaoPesoMulher.setOnClickListener{
            val main = Intent(this, PesoCalculoActivity::class.java)
            main.putExtra(BUTTON_KEY, MULHER_VALUE)
            startActivity(main)
        }

        val botaoImc = btnImc
        botaoImc.setOnClickListener{
            val main = Intent(this, ImcActivity::class.java)
            startActivity(main)
        }

        val botaoSobre = btnSobre
        botaoSobre.setOnClickListener{
            val main = Intent(this, SobreActivity::class.java)
            startActivity(main)
        }
    }
}
