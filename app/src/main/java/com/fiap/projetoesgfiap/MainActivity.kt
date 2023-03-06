package com.fiap.projetoesgfiap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.util.Log

//-----------------------------------------------------------
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("onCreate", "OnCreate Ativado")
    }
    //-----------------------------------------------------------
    override fun onStart() {
        super.onStart()

        Log.i("onStart", "onStart Ativado")
    }
    //-----------------------------------------------------------
    override fun onResume() {
        super.onResume()

        Log.i("onResume", "onResume Ativado")
    }
    //-----------------------------------------------------------
    override fun onPause() {
        super.onPause()

        Log.i("onPause", "onPause Ativado")
    }
    //-----------------------------------------------------------
    override fun onStop() {
        super.onStop()

        Log.i("onStop", "onStop Ativado")
    }
    //-----------------------------------------------------------
    override fun onDestroy() {
        super.onDestroy()

        Log.i("onDestroy", "onDestroy Ativado")
    }
    //-----------------------------------------------------------
    override fun onRestart() {
        super.onRestart()

        Log.i("onRestart", "onRestart Ativado")
    }
}