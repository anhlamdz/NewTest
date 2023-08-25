package com.example.hahalolofake.ui.album

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hahalolofake.data.models.AlbumEntity


import com.example.hahalolofake.databinding.ItemAlbumBinding


class AlbumViewHolder(private val binding: ItemAlbumBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(ab: AlbumEntity) {
        binding.albumImg.setImageResource(ab.img ?: 0)
    }
    companion object {
        fun create(viewGroup: ViewGroup): AlbumViewHolder {
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