package com.neppplus.lottosimullater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mWinLottoNumArr = ArrayList<Int>()
    var mBonusNum = 0


    lateinit var mLottoNumTxtList : ArrayList<TextView>

    val mMyLottoNumArr = arrayListOf( 5, 17, 26, 30, 36, 42)

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

            makeLottoNumbers()
//            보너스 번호생성
            makeBonusNum()

//            등수 판정
            checkLottoRank()

        }

    }

    fun checkLottoRank() {
//        내 숫자 6개가 -> 당첨번호 6개중 몇개나 맞췄는가?
        var correctCount = 0

        for (myNum in mMyLottoNumArr) {

//            맞췄는가? -> myNum이 당첨 번호에 들어 있는가?
            if(mWinLottoNumArr.contains(myNum)){
//                맞춘갯수 증가
                correctCount++
            }

        }
        Log.d("맞춘 갯수","${correctCount}개 맞춤")


    }


    fun makeBonusNum(){

//        써도 되는 숫자가 나올 때까지 무한 반복
        while(true) {

            val randomNum = (1..45).random()

            val isDuplOk = !mWinLottoNumArr.contains(randomNum)

            if(isDuplOk) {
                mBonusNum =randomNum
                break
            }
        }

//        보너스 번호 텍스트뷰에 반영
        txtLottoNumBonus.text = mBonusNum.toString()

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

       for( i in 0 until 6) {
//           텍스트뷰[i] = 당첨번호[i]

           mLottoNumTxtList[i].text =mWinLottoNumArr[i].toString()
       }
    }


    fun setValues() {
       mLottoNumTxtList = arrayListOf( txtLottoNum1,txtLottoNum2,txtLottoNum3,txtLottoNum4,txtLottoNum5,txtLottoNum6)

    }
}