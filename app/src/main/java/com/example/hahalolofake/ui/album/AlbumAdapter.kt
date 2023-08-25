package com.example.hahalolofake.ui.album

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.hahalolofake.R
import com.example.hahalolofake.data.models.AlbumEntity
import com.example.hahalolofake.ui.main.adapter.CharacterViewHolder


class AlbumAdapter(private val albumData: List<AlbumEntity>) : RecyclerView.Adapter<AlbumViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        return AlbumViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        val albumEntity = albumData[position]
        holder.bind(albumEntity)
    }

    override fun getItemCount(): Int {
        return albumData.size
    }
}