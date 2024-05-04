package com.ilmiddin1701.viewpagerlivedata.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.ilmiddin1701.viewpagerlivedata.fragments.FirstFragment
import com.ilmiddin1701.viewpagerlivedata.fragments.SecondFragment

class VpAdapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int = 2

    override fun getItem(position: Int): Fragment {
        if (position == 0){
            return FirstFragment()
        }else {
            return SecondFragment()
        }
    }
}