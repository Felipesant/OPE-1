package ferro.fabiano.ope_hairstyle

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.login.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val imagem = imagem_login
        imagem.setImageResource(R.drawable.hairstylist)

        val texto = texto_inicial
        texto_inicial.setText(R.string.mensagem_inicial)

        botao_login.setOnClickListener { onClickLogin() }

    }

    private val context get() = this

    fun onClickLogin() {

        Toast.makeText(this, "Bem vindo: ${campo_usuario.text}", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, TelaInicialActivity::class.java)
        intent.putExtra("nomeUsuario", campo_usuario.text.toString())
        intent.putExtra("número", 10)

        startActivityForResult(intent, 1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if (requestCode == 1) {
            val result = data?.getStringExtra("result")
        }
        Toast.makeText(context, "Saiu da OPE", Toast.LENGTH_SHORT).show()
    }



    }

