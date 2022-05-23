package com.example.multiplicator

import android.os.Bundle

import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.multiplicator.R

class MainActivity() : AppCompatActivity(), View.OnClickListener {
    // define the global variable
    // variable number1, number2 for input input number
    // Add_button, result textView
    var editText: EditText? = null
    var button: Button? = null
    var result: TextView? = null
    var ans = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // by ID we can use each component
        // whose id is assigned in the XML file
        editText = findViewById<View>(R.id.editText) as EditText
        button = findViewById<View>(R.id.button) as Button
        result = findViewById<View>(R.id.textView) as TextView

        // set clickListener on button
        button!!.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.button -> {
                val buffer = StringBuffer()
                var res: Int

                // get the input number from editText
                val fs = editText!!.text.toString()

                // convert it to integer
                val n = fs.toInt()

                // build the logic for table
                var i = 1
                while (i <= 10) {
                    ans = i * n
                    buffer.append(
                        n.toString() + " X " + i
                                + " = " + ans + "\n\n"
                    )
                    i++
                }

                // set the buffer textview
                result!!.text = buffer
            }
        }
    }
}