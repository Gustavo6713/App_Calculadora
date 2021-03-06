package br.senai.sp.jandira.imcapp20_a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardImc: CardView = findViewById(R.id.card_imc)
        val cardNcd: CardView = findViewById(R.id.card_ncd)

        cardImc.setOnClickListener {
            val abrirImc = Intent(this, ImcActivity::class.java)
            startActivity(abrirImc)
        }

        cardNcd.setOnClickListener {
            val abrirNcd = Intent(this, NcdActivity::class.java)
            startActivity(abrirNcd)
        }

    }
}