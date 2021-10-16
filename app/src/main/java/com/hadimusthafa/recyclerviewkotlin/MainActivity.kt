package com.hadimusthafa.recyclerviewkotlin

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {
    private var myAdapter: MyAdapter? = null
    private var recyclerView: RecyclerView? = null
    var a = arrayOf("1", "2", "3", "4", "5")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler)
        val arrayList: ArrayList<MyModel> = ArrayList<MyModel>()
        val myModel = MyModel()
        myModel.result = a[0]
        arrayList.add(myModel)
        val myModel1 = MyModel()
        myModel1.result = a[1]
        arrayList.add(myModel1)
        if (arrayList.size > 0) {
            myAdapter = MyAdapter(this, arrayList)
            recyclerView?.adapter = myAdapter
            recyclerView?.layoutManager = LinearLayoutManager(this)
        } else {
            recyclerView?.visibility = View.GONE
        }
    }
}