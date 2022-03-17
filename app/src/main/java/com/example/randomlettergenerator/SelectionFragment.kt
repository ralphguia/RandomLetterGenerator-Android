package com.example.randomlettergenerator

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.randomlettergenerator.databinding.FragmentSelectionBinding


class SelectionFragment : Fragment() { //TODO viewModel

    private val temp_letterlist: ArrayList<Char> = arrayListOf()

    fun btnActionLetter(letter: Char, checked: Boolean){
        if(checked){
            temp_letterlist.add(letter)
        } else {
            temp_letterlist.remove(letter)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSelectionBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_selection, container, false)

        binding.nextButton.setOnClickListener{
                view: View -> Navigation.findNavController(view).navigate(R.id.action_selectionFragment_to_displayLettersFragment)
        }

        binding.toggleButtonA.setOnCheckedChangeListener{ _,
                                                          isChecked -> btnActionLetter('A', isChecked)
            for (element in temp_letterlist){
                Log.i("test","Element in List:$element")
            }
        }
        binding.toggleButtonB.setOnCheckedChangeListener{ _, isChecked -> btnActionLetter('B', isChecked) }
        binding.toggleButtonC.setOnCheckedChangeListener{ _, isChecked -> btnActionLetter('C', isChecked)}
        binding.toggleButtonD.setOnCheckedChangeListener{ _, isChecked -> btnActionLetter('D', isChecked)}
        binding.toggleButtonE.setOnCheckedChangeListener{ _, isChecked -> btnActionLetter('E', isChecked)}
        binding.toggleButtonF.setOnCheckedChangeListener{ _, isChecked -> btnActionLetter('F', isChecked)}
        binding.toggleButtonG.setOnCheckedChangeListener{ _, isChecked -> btnActionLetter('G', isChecked)}
        binding.toggleButtonH.setOnCheckedChangeListener{ _, isChecked -> btnActionLetter('H', isChecked)}
        binding.toggleButtonI.setOnCheckedChangeListener{ _, isChecked -> btnActionLetter('I', isChecked)}
        binding.toggleButtonJ.setOnCheckedChangeListener{ _, isChecked -> btnActionLetter('J', isChecked)}
        binding.toggleButtonK.setOnCheckedChangeListener{ _, isChecked -> btnActionLetter('K', isChecked)}
        binding.toggleButtonL.setOnCheckedChangeListener{ _, isChecked -> btnActionLetter('L', isChecked)}
        binding.toggleButtonM.setOnCheckedChangeListener{ _, isChecked -> btnActionLetter('M', isChecked)}
        binding.toggleButtonN.setOnCheckedChangeListener{ _, isChecked -> btnActionLetter('N', isChecked)}
        binding.toggleButtonO.setOnCheckedChangeListener{ _, isChecked -> btnActionLetter('O', isChecked)}
        binding.toggleButtonP.setOnCheckedChangeListener{ _, isChecked -> btnActionLetter('P', isChecked)}
        binding.toggleButtonQ.setOnCheckedChangeListener{ _, isChecked -> btnActionLetter('Q', isChecked)}
        binding.toggleButtonR.setOnCheckedChangeListener{ _, isChecked -> btnActionLetter('R', isChecked)}
        binding.toggleButtonS.setOnCheckedChangeListener{ _, isChecked -> btnActionLetter('S', isChecked)}
        binding.toggleButtonT.setOnCheckedChangeListener{ _, isChecked -> btnActionLetter('T', isChecked)}
        binding.toggleButtonU.setOnCheckedChangeListener{ _, isChecked -> btnActionLetter('U', isChecked)}
        binding.toggleButtonV.setOnCheckedChangeListener{ _, isChecked -> btnActionLetter('V', isChecked)}
        binding.toggleButtonW.setOnCheckedChangeListener{ _, isChecked -> btnActionLetter('W', isChecked)}
        binding.toggleButtonX.setOnCheckedChangeListener{ _, isChecked -> btnActionLetter('X', isChecked)}
        binding.toggleButtonY.setOnCheckedChangeListener{ _, isChecked -> btnActionLetter('Y', isChecked)}
        binding.toggleButtonZ.setOnCheckedChangeListener{ _, isChecked -> btnActionLetter('Z', isChecked)}


        return binding.root
    }


}