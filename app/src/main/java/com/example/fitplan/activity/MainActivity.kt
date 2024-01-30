package com.example.fitplan.activity

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.fragment.app.Fragment
import com.example.fitplan.R
import com.example.fitplan.fragment.FemaleFragment
import com.example.fitplan.fragment.MaleFragment
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {


    val TAG = "MainActivity"
    private lateinit var editTextName: TextInputEditText
    private lateinit var editTextAge: TextInputEditText
    private lateinit var buttonLogin: Button
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE)
//        val name = sharedPreferences.getString("MySharedPref", "")
//        val age = sharedPreferences.getString("MySharedPref","0")
//        editTextName.setText(name)
//        editTextName.setText(age.toString())

        installSplashScreen()

        supportActionBar?.title = resources.getText(R.string.action_bar)

        var flag = 0
        if (savedInstanceState?.isEmpty == true) {
            flag = 1
        }
        editTextName = findViewById(R.id.editTextName)
        editTextAge = findViewById(R.id.editTextAge)
        buttonLogin = findViewById(R.id.loginButton)
        val radioButtonMale = findViewById<RadioButton>(R.id.radioButtonMale)

        buttonLogin.setOnClickListener {

            sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE)
            val myEdit = sharedPreferences.edit()
            myEdit.putString("name", editTextName.editableText.toString())
            val age = if (editTextAge.editableText.toString().isEmpty()) {
                0
            } else {
                editTextAge.editableText.toString().toInt()
            }
            myEdit.putInt("age", age)
            myEdit.apply()

            val bundle = Bundle()
            if (radioButtonMale.isChecked) {
                bundle.putString("userInput", editTextName.text.toString())
                val targetFragment = MaleFragment().apply {
                    arguments = bundle
                }
                fragmentManager(targetFragment, flag)
            } else {
                bundle.putString("userInput", editTextName.text.toString())
                val targetFrag = FemaleFragment().apply {
                    arguments = bundle
                }
                fragmentManager(targetFrag, flag)
            }
            buttonLogin.hideKeyBoard()

        }
    }

    private fun fragmentManager(fragment: Fragment, flag: Int) {
        val ft = supportFragmentManager.beginTransaction()
        if (flag == 1) {
            ft.add(R.id.frag_container, fragment)
        } else {
            ft.replace(R.id.frag_container, fragment)
        }
        ft.commit()
        ft.addToBackStack(null)
    }

    fun View?.hideKeyBoard() {
        this?.let {
            val hide =
                it.context.getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
            hide?.hideSoftInputFromWindow(it.windowToken, 0)
        }
    }
}