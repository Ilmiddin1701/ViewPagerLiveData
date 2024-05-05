package com.ilmiddin1701.viewpagerlivedata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ilmiddin1701.viewpagerlivedata.adapters.VpAdapter
import com.ilmiddin1701.viewpagerlivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    lateinit var vpAdapter: VpAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        vpAdapter = VpAdapter(supportFragmentManager)
        binding.tabLayout.setupWithViewPager(binding.viewPager)
        binding.viewPager.adapter = vpAdapter
    }
}