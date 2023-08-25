package com.example.fitplan.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.fragment.app.Fragment
import com.example.fitplan.R
import com.example.fitplan.fragment.FemaleFragment
import com.example.fitplan.fragment.MaleFragment

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        installSplashScreen()
        supportActionBar?.title = resources.getText(R.string.action_bar)
        var flag = 0
        if (savedInstanceState?.isEmpty == true) {
            flag = 1
        }
        val editTextName = findViewById<EditText>(R.id.editTextName)
        val buttonLogin = findViewById<Button>(R.id.loginButton)
        val radioButtonMale = findViewById<RadioButton>(R.id.radioButtonMale)


        buttonLogin.setOnClickListener() {
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

}