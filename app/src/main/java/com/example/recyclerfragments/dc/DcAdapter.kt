package com.example.recyclerfragments.dc

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerfragments.R
import com.example.recyclerfragments.SuperHero

class DcAdapter(private val dcList: List<SuperHero>): RecyclerView.Adapter<DcViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DcViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DcViewHolder(layoutInflater.inflate(R.layout.item_super_hero, parent, false))
    }

    override fun onBindViewHolder(holder: DcViewHolder, position: Int) {
        val item = dcList[position]
        holder.dcRender(item)
    }

    override fun getItemCount(): Int = dcList.size

}