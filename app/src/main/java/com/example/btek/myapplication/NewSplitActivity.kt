package com.example.btek.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View
import kotlinx.android.synthetic.main.activity_new_split.*

class NewSplitActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_split)

        start_split_btn.setOnClickListener(::startSplitActivity)
    }

    fun startSplitActivity(view: View) {
        val splitName = split_label_txt.text

        Snackbar.make(view, "Will start split [$splitName]", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
    }
}
