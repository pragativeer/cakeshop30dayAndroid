package com.example.cakeshop

import android.app.Activity
import android.widget.Toast
import java.time.Duration

fun Activity.showToast(meassage: String){
    Toast.makeText(this,meassage, Toast.LENGTH_SHORT).show()

}
