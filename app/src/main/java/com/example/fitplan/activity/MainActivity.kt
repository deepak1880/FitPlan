package com.example.fitplan.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import androidx.fragment.app.Fragment
import com.example.fitplan.R
import com.example.fitplan.femalefragment.FemaleFragment
import com.example.fitplan.malefragment.MaleFragment

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = resources.getText(R.string.action_bar)

        var flag=0
        if(savedInstanceState?.isEmpty==true){
            flag=1
        }
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)
        val radioButtonMale = findViewById<RadioButton>(R.id.radioButtonMale)
        val radioButtonFemale = findViewById<RadioButton>(R.id.radioButtonFemale)

        buttonLogin.setOnClickListener() {
            if(radioButtonMale.isChecked){
                fragmentManager(MaleFragment(),flag)
            }else{
                fragmentManager(FemaleFragment(),flag)
            }
        }
    }
    private fun fragmentManager(fragment: Fragment,flag:Int) {
        val ft = supportFragmentManager.beginTransaction()
        if(flag==1){
            ft.add(R.id.frag_container,fragment)
        }else{
            ft.replace(R.id.frag_container, fragment)
        }
        ft.commit()
        ft.addToBackStack(null)
    }

}