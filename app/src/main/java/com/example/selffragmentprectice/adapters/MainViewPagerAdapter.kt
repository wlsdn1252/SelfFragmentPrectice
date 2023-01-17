package com.example.selffragmentprectice.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.selffragmentprectice.fragments.FirstFragment
import com.example.selffragmentprectice.fragments.SecondFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> FirstFragment()
            else -> SecondFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }


}