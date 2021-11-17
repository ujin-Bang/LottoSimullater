package com.neppplus.lottosimullater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setValues()
        setupEvents()


    }


    fun setupEvents() {

        BtnBuyLotto.setOnClickListener {

//            로또번호 6개 생성

//            보너스 번호생성

        }

    }


    fun setValues() {

    }
}