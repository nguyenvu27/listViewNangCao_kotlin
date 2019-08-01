package com.example.lisviewnangcao

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(var context : Context, var mangMonAn : ArrayList<monAn>) : BaseAdapter() {

    class ViewHolder(row: View){
        var textViewTenMonAn : TextView
        var imageMonAn : ImageView

        init {
            textViewTenMonAn = row.findViewById(R.id.name) as TextView
            imageMonAn = row.findViewById(R.id.image) as ImageView
        }
    }

    override fun getView(position: Int, convertview: View?, p2: ViewGroup?): View {
        var view : View?
        var viewHolder : ViewHolder
        if (convertview == null){
            var layoutInflater : LayoutInflater = LayoutInflater.from(context)
            view = layoutInflater.inflate(R.layout.dong_monan, null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertview
            viewHolder = convertview.tag as ViewHolder
        }
        var monan : monAn = getItem(position) as monAn
        viewHolder.textViewTenMonAn.text = monan.name
        viewHolder.imageMonAn.setImageResource(monan.image)
        return view as View

    }

    override fun getItem(position: Int): Any {
        return mangMonAn.get(position)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return mangMonAn.size
    }
}