package com.ai.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {
        val clickableListViews : List<View> = listOf(box_one_text, box_two_text,
        box_three_text, box_four_text, box_five_text, constraintBoxLayout)

        for (clickableView in clickableListViews) {
            clickableView.setOnClickListener {
                makeColored(it)
            }
        }
    }

    private fun makeColored(view: View?) {
        when(view?.id){
            R.id.box_one_text -> view.setBackgroundColor(Color.BLACK)
            R.id.box_two_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_three_text -> view.setBackgroundColor(Color.YELLOW)
            R.id.box_four_text -> view.setBackgroundColor(Color.GREEN)
            R.id.box_five_text -> view.setBackgroundColor(Color.GRAY)
            else -> view?.setBackgroundColor(Color.CYAN)

        }
    }
}