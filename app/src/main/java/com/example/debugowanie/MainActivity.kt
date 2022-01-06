package com.example.debugowanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logging()
        division()
    }

    fun division() {
        val numerator = 60
        var denominator = 4
        repeat(5) {
            Log.d(TAG, "$denominator")
            Log.v(TAG, "${numerator / denominator}")
            denominator--
        }
    }

    fun logging() {
        Log.e(TAG, "BŁĄD: poważny błąd jak awaria aplikacji")
        Log.w(TAG, "OSTRZEŻENIE: o potencjalnych poważnych błędach")
        Log.i(TAG, "INFORMACJA: raportowanie technicznej informacji, jak operacja zakończona powodzeniem")
        Log.d(TAG, "DEBUGOWANIE: raportowanie informacji przydatnych do debugowania")
        Log.v(TAG, "ROZWLEKŁY: bardziej szczegółowe, niż logi debugowania")
    }
}