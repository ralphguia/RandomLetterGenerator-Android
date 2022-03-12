package com.example.randomlettergenerator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.randomlettergenerator.databinding.FragmentDisplayLettersBinding


class DisplayLettersFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentDisplayLettersBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_display_letters, container, false)

        return binding.root
    }

}