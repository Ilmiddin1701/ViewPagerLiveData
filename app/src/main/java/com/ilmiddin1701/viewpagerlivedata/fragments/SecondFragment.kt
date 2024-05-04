package com.ilmiddin1701.viewpagerlivedata.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ilmiddin1701.viewpagerlivedata.R
import com.ilmiddin1701.viewpagerlivedata.databinding.FragmentSecondBinding
import com.ilmiddin1701.viewpagerlivedata.obj

class SecondFragment : Fragment() {
    private val binding by lazy { FragmentSecondBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        obj.liveData.observe(viewLifecycleOwner){
            binding.tv1.text = it
        }
        return binding.root
    }
}