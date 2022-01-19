package me.chayan.exposeddropdownmenu.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import me.chayan.exposeddropdownmenu.model.Division

class DivisionArrayAdapter(context: Context, objects: List<Division>) :
    ArrayAdapter<Division>(context, android.R.layout.simple_list_item_1, objects) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val itemView = super.getView(position, convertView, parent) as TextView
        itemView.text = getItem(position).toString()
        return itemView
    }
}