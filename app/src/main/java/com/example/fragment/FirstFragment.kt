package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputBinding
import android.widget.RadioGroup
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.fragment.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit
    var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentFirstBinding.inflate(layoutInflater, container, false)
//        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(37)    //arg

//        val textView = view.findViewById<TextView>(R.id.firstTv)
        binding.firstTv.setOnClickListener {
            findNavController().navigate(action)      //first to second
        }
//        return view
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }


}