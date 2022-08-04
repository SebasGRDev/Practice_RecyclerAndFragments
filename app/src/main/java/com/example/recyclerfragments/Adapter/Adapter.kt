package com.example.recyclerfragments.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerfragments.R
import com.example.recyclerfragments.SuperHero
import com.example.recyclerfragments.ViewHolder.ViewHolder

class Adapter(private val superHeroList: List<SuperHero>, private val onClickListener: (SuperHero) -> Unit) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_super_hero, parent, false))

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = superHeroList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount() : Int = superHeroList.size
}