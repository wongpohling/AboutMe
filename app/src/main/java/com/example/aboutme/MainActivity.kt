package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun clickHandlerFunction(viewThatIsClicked: View) {

        textViewNickname.text=editTextName.text
        textViewNickname.visibility=View.VISIBLE
    }

    private fun updateNickname(){
        
    }

    private fun addNickname(view: View) {
        val editText = findViewById<EditText>(R.id.editTextName)
        val nicknameTextView = findViewById<TextView>(R.id.textViewNickname)
        textViewNickname.text = editText.text
    }
}
