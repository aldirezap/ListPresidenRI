package com.example.listpresidenri

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class PresidenAdapter (
    private val context: Activity,
    private val nama_presiden: Array<String>,
    private val dekripsi_presiden: Array<String>,
    private val gambar_presiden: Array<Int>) : ArrayAdapter<String>(context, R.layout.layout_presiden, nama_presiden) {

        override fun getView(position: Int, view: View?, parent: ViewGroup): View {
            val inflater = context.layoutInflater
            val rowView = inflater.inflate(R.layout.layout_presiden, null, true)
            val titleText = rowView.findViewById(R.id.namapresiden) as TextView
            val imageView = rowView.findViewById(R.id.gambar) as ImageView

            titleText.text = nama_presiden[position]
            imageView.setImageResource(gambar_presiden[position])

            return rowView
        }
    }


