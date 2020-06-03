package com.example.cakeshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

clickid.setOnClickListener {
    val Msg:String=n1.text.toString()
    showToast(Msg)

    val intent=Intent(this,fisrtactivity::class.java)
    intent.putExtra("User_name",Msg)
    startActivity(intent)
}

        shareid.setOnClickListener {
            val Msg :String = n1.text.toString()

            val intent = Intent()
            intent.action =Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,Msg)
            intent.type = "text/Plain"
showToast(Msg)
            startActivity(Intent.createChooser(intent,"share to"))

        }


    }
}
