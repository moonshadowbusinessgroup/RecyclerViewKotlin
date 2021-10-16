package com.hadimusthafa.recyclerviewkotlin

import android.content.Context
import com.hadimusthafa.recyclerviewkotlin.MyModel
import androidx.recyclerview.widget.RecyclerView
import com.hadimusthafa.recyclerviewkotlin.MyAdapter.MyViewHolder
import android.view.LayoutInflater
import android.view.ViewGroup
import com.hadimusthafa.recyclerviewkotlin.R
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.hadimusthafa.recyclerviewkotlin.MyAdapter
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import java.util.ArrayList

class MyAdapter(ctx: Context, dataModelArrayList: ArrayList<MyModel>) :
    RecyclerView.Adapter<MyViewHolder>() {
    private val inflater: LayoutInflater = LayoutInflater.from(ctx)
    private val dataModelArrayList: ArrayList<MyModel> = dataModelArrayList
    private val mContext: Context = ctx
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = inflater.inflate(R.layout.item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.note.text = dataModelArrayList[position].result
    }

    override fun getItemCount(): Int {
        return dataModelArrayList.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var note: TextView = itemView.findViewById(R.id.note)

    }

}