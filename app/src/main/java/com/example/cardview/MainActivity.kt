package com.example.cardview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

 val places = listOf(
            Place("Vịnh Hạ Long", "Di sản thiên nhiên thế giới nổi tiếng với hàng ngàn đảo đá vôi.", R.drawable.halongbay),
            Place("Phú Quốc", "Hòn đảo ngọc với bãi biển xanh trong và hải sản tươi ngon.", R.drawable.phuquoc),
            Place("Sapa", "Thành phố mờ sương với những thửa ruộng bậc thang tuyệt đẹp.", R.drawable.sapa)
        )

        recyclerView.adapter = PlaceAdapter(places)
    }
}
