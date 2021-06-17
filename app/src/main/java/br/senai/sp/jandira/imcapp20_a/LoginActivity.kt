package br.senai.sp.jandira.imcapp20_a

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    lateinit var editUser: EditText
    lateinit var editPassword: EditText
    lateinit var btnlogin: Button
    lateinit var tvMensagemErro: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        editUser = findViewById(R.id.ed_user)
        editPassword = findViewById(R.id.ed_senha)
        btnlogin = findViewById(R.id.btn_login)
        tvMensagemErro = findViewById(R.id.tv_mensagem_erro)

        btnlogin.setOnClickListener {
            login()
        }

    }

    private fun login() {
        // email: user@email.com
        // senha: 123

        val user = editUser.text.toString()
        val pass = editPassword.text.toString()

        if (user == "user@email.com" && pass == "123"){
            // Armazenar os dados do usuario no sharedPreferences
            val preferences = getSharedPreferences("biometria", Context.MODE_PRIVATE)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        } else {
            tvMensagemErro.text = "Usuário ou senha incorretos!"
        }
    }
}