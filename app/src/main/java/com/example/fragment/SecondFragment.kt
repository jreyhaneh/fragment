package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.fragment.databinding.FragmentFirstBinding
import com.example.fragment.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    val arg: SecondFragmentArgs by navArgs()                                                        //arg

    private lateinit
    var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val binding = FragmentSecondBinding.inflate(layoutInflater, container, false)

        val number = arg.number                                                            //arg
        binding.secondTv.setText(number.toString())                                        //arg

        binding.secondTv.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_firstFragment)     //second to first
        }
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}