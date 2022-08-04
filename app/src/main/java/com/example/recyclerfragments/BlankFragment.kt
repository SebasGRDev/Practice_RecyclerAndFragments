package com.example.recyclerfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.recyclerfragments.R
import com.example.recyclerfragments.databinding.FragmentBlankBinding
import com.example.recyclerfragments.databinding.FragmentMarvelListBinding

class BlankFragment : Fragment() {
    private var _binding: FragmentBlankBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = FragmentBlankBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentBlankBinding.bind(view)
        binding.btnMarvel.setOnClickListener {
            findNavController().navigate(R.id.go_marvel)
        }
        binding.btnDC.setOnClickListener {
            findNavController().navigate(R.id.go_Dc)
        }
    }
}
