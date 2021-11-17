package com.neppplus.lottosimullater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mWinLottoNumArr = ArrayList<Int>()

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

//        기존에 번호가 있다면 전부 삭제
        mWinLottoNumArr.clear()

//        6개의 당첨번호 => 반복 횟수 명확 =>for

        for ( i in 0 until 6) {

//            f랜덤숫자 추출 => 제대로 된 숫자라면 목록에 추가



        while (true) {
            val randomNum = (Math.random() * (45 +1)).toInt()
            Log.d("랜덤", randomNum.toString())


            var isDuplOk = !mWinLottoNumArr.contains(randomNum)



            if(isDuplOk) {
//                숫자를 당첨 목록에 추가
                mWinLottoNumArr.add(randomNum)

                break;
            }
        }

        }
        
//        ArrayLottoNumArr의 sort 기능 활용
        mWinLottoNumArr.sort()
        
//        당첨 번호 6개 확인
        for( num in mWinLottoNumArr) {

            Log.d("당첨번호",num.toString())
        }

    }


    fun setValues() {

    }
}