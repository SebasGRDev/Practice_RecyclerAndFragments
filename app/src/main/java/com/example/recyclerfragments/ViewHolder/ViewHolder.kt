package com.example.recyclerfragments.ViewHolder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerfragments.R
import com.example.recyclerfragments.SuperHero
import com.example.recyclerfragments.databinding.ItemSuperHeroBinding

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding = ItemSuperHeroBinding.bind(view)

    fun render(superHeroModel: SuperHero, onClickListener: (SuperHero) -> Unit) {
        binding.tvRealName.text = superHeroModel.realName
        binding.tvAlias.text = superHeroModel.alias
        binding.tvHabilities.text = superHeroModel.habilities
        Glide.with(binding.ivPhoto.context).load(superHeroModel.photo).into(binding.ivPhoto)

        itemView.setOnClickListener { onClickListener(superHeroModel) }
    }

}