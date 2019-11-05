package com.example.week3_019

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.week3_019.MainActivity
import com.example.week3_019.R
import kotlinx.android.synthetic.main.activity_second.*

class SecoundAcitivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        setTitle("TANKUN PIMPA")

        var fname = intent.extras?.getString(MainActivity().TAG_FNAME)
        var lname = intent.extras?.getString(MainActivity().TAG_LNAME)
        var age = intent.extras?.getString(MainActivity().TAG_AGE)
        var phone = intent.extras?.getString(MainActivity().TAG_PHONE)
        var status = intent.extras?.getString(MainActivity().TAG_STATUS)

        tv_res_fname.setText(fname)
        tv_res_lname.setText(lname)
        tv_res_age.setText(age)
        tv_res_phone.setText(phone)
        tv_res_status.setText(status)

        btn_back.setOnClickListener {

            finish()

        }

    }
}