package com.prank.helpmate

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(var cCtx:Context, var resources:Int, var items:List<Model>):
    ArrayAdapter<Model>(cCtx, resources, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater = LayoutInflater.from(cCtx)
        val view:View = layoutInflater.inflate(resources, null)

        val imageView:ImageView = view.findViewById(R.id.image)
        val titleTextView:TextView = view.findViewById(R.id.textView1)
        val descriptionTextView:TextView = view.findViewById(R.id.textView2)

        var cItem:Model = items[position]
        imageView.setImageDrawable(cCtx.resources.getDrawable(cItem.img, cCtx.getTheme()))
        titleTextView.text = cItem.title
        descriptionTextView.text = cItem.description

        return view
    }
}