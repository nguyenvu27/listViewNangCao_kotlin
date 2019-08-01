package com.example.lisviewnangcao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arrayMonAn : ArrayList<monAn> = ArrayList()
        arrayMonAn.add(monAn("Ronaldo", R.drawable.ronaldo1))
        arrayMonAn.add(monAn("Ronaldo Juvetus", R.drawable.ronaldo2))
        arrayMonAn.add(monAn("Ronaldo haha", R.drawable.ronaldo3))
        arrayMonAn.add(monAn("Ronaldo Cristiano", R.drawable.ronaldo4))
        arrayMonAn.add(monAn("Cristiano", R.drawable.ronaldo5))
        arrayMonAn.add(monAn("Ronaldo C", R.drawable.ronaldo6))
        arrayMonAn.add(monAn("C.Ronaldo ", R.drawable.ronaldo7))
        arrayMonAn.add(monAn("Ronaldo Portugal", R.drawable.ronaldo8))
        arrayMonAn.add(monAn("Ronaldo an", R.drawable.ronaldo9))
        arrayMonAn.add(monAn("Ronaldo hehe", R.drawable.ronaldo10))
        listView.adapter = CustomAdapter(this, arrayMonAn)

    }
}
