package com.alisabet.swiperefresh

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v4.widget.SwipeRefreshLayout

class MainActivity : AppCompatActivity() {

    //1.add swipe refresh layout to our main layout and put elements in it
    //2.write code below

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val swipeLayout = findViewById<SwipeRefreshLayout>(R.id.swipe_container)

        swipeLayout.setOnRefreshListener(SwipeRefreshLayout.OnRefreshListener {
            swipeLayout.isRefreshing = true
            val handler = Handler()
            val postDelayed = handler.postDelayed(Runnable {
                run {
                    swipeLayout.isRefreshing = false
                }
            }, 5000)

        })

        swipeLayout.setColorSchemeColors(Color.BLUE, Color.GREEN, Color.RED)

    }
}
