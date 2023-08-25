package com.example.hahalolofake.ui.album

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.hahalolofake.R
import com.example.hahalolofake.data.models.AlbumEntity
import com.example.hahalolofake.data.models.IntroEntity
import com.example.hahalolofake.data.models.ResultEntity
import com.example.hahalolofake.databinding.ItemAlbumBinding
import com.example.hahalolofake.databinding.ItemIntroBinding
import com.example.hahalolofake.ui.main.adapter.CharacterViewHolder

class AlbumAdapter(
    private val list: ArrayList<Int>
) :
    RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder>() {

    companion object {
        val dummyData = arrayListOf(
            R.drawable.ic_1,
            R.drawable.ic_2,
            R.drawable.ic_3,
            R.drawable.ic_4,
            R.drawable.ic_5,
            R.drawable.ic_6,
            R.drawable.ic_7,
            R.drawable.ic_8,
            R.drawable.ic_9,
            R.drawable.ic_10,
            R.drawable.ic_11,
            R.drawable.ic_1,
            R.drawable.ic_2,
            R.drawable.ic_3,
            R.drawable.ic_4,
            R.drawable.ic_5,
            R.drawable.ic_6,
            R.drawable.ic_7,
            R.drawable.ic_8,
            R.drawable.ic_9,
            R.drawable.ic_10,
            R.drawable.ic_11,
        )
    }

    inner class AlbumViewHolder(val binding: ItemAlbumBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AlbumAdapter.AlbumViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemAlbumBinding.inflate(layoutInflater, parent, false)
        return AlbumViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        val itemImage = list[position]
        holder.binding.albumImg.setImageResource(itemImage)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}