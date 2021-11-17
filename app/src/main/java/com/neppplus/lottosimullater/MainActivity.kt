package com.neppplus.lottosimullater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setValues()
        setupEvents()
        makeLottoNumbers()

    }


    fun setupEvents() {

        BtnBuyLotto.setOnClickListener {

//            로또번호 6개 생성

//            보너스 번호생성

        }

    }

    fun makeLottoNumbers(){

//        6개의 당첨번호 => 반복 횟수 명확 =>for

        for ( i in 0 until 6) {

            Log.d("숫자확인", i.toString())
        }

    }


    fun setValues() {

    }
}