package com.example.recyclerfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerfragments.databinding.FragmentDcListBinding
import com.example.recyclerfragments.dc.DcAdapter
import com.example.recyclerfragments.dc.DcProvider.Companion.dcList


class DcListFragment : Fragment() {
    private lateinit var binding: FragmentDcListBinding
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDcListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = binding.recyclerDc


        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = DcAdapter(dcList)
    }

}