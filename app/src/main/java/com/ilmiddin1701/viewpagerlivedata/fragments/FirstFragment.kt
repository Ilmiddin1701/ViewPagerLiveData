package com.ilmiddin1701.viewpagerlivedata.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import com.ilmiddin1701.viewpagerlivedata.R
import com.ilmiddin1701.viewpagerlivedata.databinding.FragmentFirstBinding
import com.ilmiddin1701.viewpagerlivedata.obj

class FirstFragment : Fragment() {
    private val binding by lazy { FragmentFirstBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.edt1.addTextChangedListener {
            obj.liveData.postValue(it.toString())
        }
        return binding.root
    }
}