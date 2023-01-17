package com.example.selffragmentprectice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.selffragmentprectice.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mViewPagerAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 최초로 실행되면 MainViewPagerAdapter클래스를 담아주는데 supportFragmentManager로 담을거야
        mViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager)

        // 메인 xml의 id가 mainViewPagerd인 프래그먼트의 어댑터는 mViewpagerAdapter가 될거다
        mainViewPager.adapter = mViewPagerAdapter

        // 메인 xml에서 id가 tabLayout인 것이랑 mainViewPager인 것을 연결
        // 실제 화면에 나타님
        tabLayout.setupWithViewPager(mainViewPager)

    }
}