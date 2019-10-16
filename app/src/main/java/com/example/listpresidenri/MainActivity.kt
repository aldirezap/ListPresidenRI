package com.example.listpresidenri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val namapresiden = arrayOf(
        "Ir. Soekarno",
        "Soeharto",
        "BJ. Habibie",
        "Gusdur",
        "Megawati",
        "Susilo Bambang Yudhoyono",
        "Joko Widodo")

    val deskripsi = arrayOf(
        "1. Soekarno yang biasa dipanggil Bung Karno, lahir di Blitar, Jawa Timur, 6 Juni 1901 dan meninggal di Jakarta, 21 Juni 1970.",
        "2. Beliau lahir di Kemusuk, Yogyakarta, tanggal 8 Juni 1921",
        "3. Beliau lahir di Pare-Pare, Sulawesi Selatan, pada 25 Juni 1936.",
        "4. Beliau lahir di Denanyar Jombang Jawa Timur pada tanggal 4 Agustus 1940.",
        "5. Beliau lahir di Yogyakarta, 23 Januari 1947. ",
        "6. Beliau lahir di Pacitan, Jawa Timur 9 September 1949.",
        "7. Beliau lahir pada tanggal 21 Juni 1961 di kota Solo")

    val gambar = arrayOf(
        R.drawable.soekarno,
        R.drawable.soeharto,
        R.drawable.habibie,
        R.drawable.gusdur,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val daftarpresiden= PresidenAdapter(this,namapresiden,deskripsi,gambar)
        daftar_presiden.adapter = daftarpresiden

        daftar_presiden.setOnItemClickListener() { adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(this, "${namapresiden[position]} Merupakan Presiden Ke: ${deskripsi[position]}",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}
