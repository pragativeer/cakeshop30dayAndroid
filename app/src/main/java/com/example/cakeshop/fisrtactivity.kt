package com.example.cakeshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_fisrtactivity.*
import kotlinx.android.synthetic.main.activity_main.*

class fisrtactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fisrtactivity)
        val bundle:Bundle? =intent.extras
        val msg2= bundle!!.getString("User_name")
        Toast.makeText(this,msg2,Toast.LENGTH_SHORT).show()
        sc2text.text=msg2

        t1.setOnClickListener {
            Toast.makeText(this,"This is Chocolate cake",Toast.LENGTH_SHORT).show()
        }
        t2.setOnClickListener {
            Toast.makeText(this,"This is strwaberry cake ",Toast.LENGTH_SHORT).show()
        }

    }
}
