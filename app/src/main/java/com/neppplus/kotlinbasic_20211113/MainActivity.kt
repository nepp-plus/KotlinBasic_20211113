package com.neppplus.kotlinbasic_20211113

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToast.setOnClickListener {
//            이 내부의 코드는, 토스트 띄우기 버튼이 눌릴때 실행됨.

            Toast.makeText(this, "다시 토스트 띄우기", Toast.LENGTH_SHORT).show()


        }

        btnLog.setOnClickListener {

//            이 내부의 코드는, 로그 찍기 버튼을 누를때마다 실행됨.

            Log.d( "메인화면", "로그 찍기 버튼 누름" )
            Log.e("메인화면", "e 로 로그 찍어보기")


        }

        btnOk.setOnClickListener {

//            확인 버튼이 눌리면 실행해줄 일.

//            1. edtContent 에 타이핑 해준 문구 (text) 가 무엇인가? -> 변수에 저장.

//            EditText의  text 속성에 들어있는 값을 String 형태로 변환해서 변수에 저장.
//            String 변환 :  String이 다루기 편함.
            val inputContent =  edtContent.text.toString()

//            2. txtContent 에 변수에 저장해둔 문구를 -> text속성에 대입. (문구 변경)

            txtContent.text  =  inputContent


        }

    }

}