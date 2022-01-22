package com.example.debugowanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "tutaj aplikacja wcześniej ulegała awarii")
        val helloTextView: TextView = findViewById(R.id.division_textview)
        Log.d(TAG, "to powinno trafić do logu jeśli błąd jest naprawiony")
        helloTextView.text = "Witaj, debugowaniu!"
        logging()
        division()
    }

    fun division() {
        val numerator = 60
        var denominator = 4
        repeat(4) {
            Thread.sleep(1)
            Log.v(TAG, "${numerator / denominator}")
            findViewById<TextView>(R.id.division_textview).setText("${numerator / denominator}")
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