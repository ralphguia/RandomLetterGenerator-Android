package com.example.randomlettergenerator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.randomlettergenerator.databinding.FragmentDisplayLettersBinding


class DisplayLettersFragment : Fragment() {

    lateinit var temp_letterlist: ArrayList<Char>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentDisplayLettersBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_display_letters, container, false)

        binding.buttonLetter.setOnClickListener{
            var randomLetter:Char = temp_letterlist.random()
            binding.textViewLetter.setText("$randomLetter")
            temp_letterlist.remove(randomLetter)
        }

        return binding.root
    }

}