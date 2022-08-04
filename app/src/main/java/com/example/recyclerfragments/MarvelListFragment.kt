package com.example.recyclerfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerfragments.Adapter.Adapter
import com.example.recyclerfragments.SHProvider.Companion.superHeroList
import com.example.recyclerfragments.databinding.FragmentMarvelListBinding


class MarvelListFragment : Fragment() {
    private lateinit var binding: FragmentMarvelListBinding
    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentMarvelListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = binding.recyclerMarvel

        val manager = LinearLayoutManager(requireContext())
        val decoration = DividerItemDecoration(requireContext(), manager.orientation)

        recyclerView.layoutManager = manager
        recyclerView.adapter = Adapter(superHeroList) { superHero -> onItemSelected(superHero) }

        binding.recyclerMarvel.addItemDecoration(decoration)
    }

    private fun onItemSelected(superHero: SuperHero) {
        Toast.makeText(requireContext(), superHero.alias, Toast.LENGTH_SHORT).show()
    }
}