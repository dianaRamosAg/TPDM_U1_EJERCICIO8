package mx.edu.ittepic.tpdm_u_ejercicio8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    var campo : EditText?=null
    var btnA: Button?=null
    var numeros=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        campo=findViewById(R.id.numcomas)
        btnA=findViewById(R.id.btnAbrir)






        btnA?.setOnClickListener {

            numeros=campo?.text.toString()
            var activity2= Intent(this,Main2Activity::class.java)
            activity2.putExtra("numeros",numeros)
            startActivity(activity2)

        }
    }
}
