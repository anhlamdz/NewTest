package com.example.hahalolofake.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hahalolofake.data.models.ResultEntity
import com.example.hahalolofake.databinding.ItemAlbumBinding
import com.example.hahalolofake.databinding.ItemCharacterBinding
import com.example.hahalolofake.ui.album.AlbumViewHolder
import com.squareup.picasso.Picasso

class CharacterViewHolder(
    private val binding: ItemAlbumBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(entity: ResultEntity) {
        Picasso.get()
            .load(entity.image)
            .into(binding.albumImg);
    }

    companion object {
        fun create(
            viewGroup: ViewGroup,
        ): AlbumViewHolder {
            return AlbumViewHolder(
                binding = ItemAlbumBinding.inflate(
                    LayoutInflater.from(viewGroup.context),
                    viewGroup,
                    false
                )
            )
        }
    }
}