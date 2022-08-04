package com.example.recyclerfragments.dc

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerfragments.SuperHero
import com.example.recyclerfragments.databinding.ItemSuperHeroBinding

class DcViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding = ItemSuperHeroBinding.bind(view)

    fun dcRender(superHeroModel: SuperHero) {
        binding.tvRealName.text = superHeroModel.realName
        binding.tvAlias.text = superHeroModel.alias
        binding.tvHabilities.text = superHeroModel.habilities
        Glide.with(binding.ivPhoto.context).load(superHeroModel.photo).into(binding.ivPhoto)

        binding.ivPhoto.setOnClickListener {
            Toast.makeText(binding.ivPhoto.context,
                "Es el increible ${superHeroModel.alias}",
                Toast.LENGTH_SHORT).show()
        }

        itemView.setOnClickListener{
            Toast.makeText(binding.ivPhoto.context,
                "Es el increible ${superHeroModel.realName}",
                Toast.LENGTH_SHORT).show()
        }
    }
}