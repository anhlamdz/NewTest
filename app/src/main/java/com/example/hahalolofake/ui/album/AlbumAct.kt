package com.example.hahalolofake.ui.album

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hahalolofake.R
import com.example.hahalolofake.base.AbsActivity
import com.example.hahalolofake.data.models.AlbumEntity
import com.example.hahalolofake.data.models.IntroEntity
import com.example.hahalolofake.databinding.ActivityAlbumBinding
import com.example.hahalolofake.ui.intro.adaper.IntroAdapter
import com.example.hahalolofake.ui.main.adapter.CharacterAdapter
import javax.inject.Inject


class AlbumAct @Inject constructor() : AbsActivity<ActivityAlbumBinding>() {

    private val albumData : List<AlbumEntity> = listOf(
        AlbumEntity(id = 1, img = R.drawable.ic_1),
        AlbumEntity(id = 2, img = R.drawable.ic_2),
        AlbumEntity(id = 3, img = R.drawable.ic_3),
        AlbumEntity(id = 4, img = R.drawable.ic_4),
        AlbumEntity(id = 5, img = R.drawable.ic_4),
        AlbumEntity(id = 5, img = R.drawable.ic_5),
        AlbumEntity(id = 6, img = R.drawable.ic_6),
        AlbumEntity(id = 7, img = R.drawable.ic_7),
        AlbumEntity(id = 8, img = R.drawable.ic_8),
        AlbumEntity(id = 9, img = R.drawable.ic_9),
        AlbumEntity(id = 10, img = R.drawable.ic_10),
        AlbumEntity(id = 11, img = R.drawable.ic_11),
        AlbumEntity(id = 1, img = R.drawable.ic_1),
        AlbumEntity(id = 2, img = R.drawable.ic_2),
        AlbumEntity(id = 3, img = R.drawable.ic_3),
        AlbumEntity(id = 4, img = R.drawable.ic_4),
        AlbumEntity(id = 5, img = R.drawable.ic_4),
        AlbumEntity(id = 5, img = R.drawable.ic_5),
        AlbumEntity(id = 6, img = R.drawable.ic_6),
        AlbumEntity(id = 7, img = R.drawable.ic_7),
        AlbumEntity(id = 8, img = R.drawable.ic_8),
        AlbumEntity(id = 9, img = R.drawable.ic_9),
        AlbumEntity(id = 10, img = R.drawable.ic_10),
        AlbumEntity(id = 11, img = R.drawable.ic_11),
    )

    private val albumAdapter by lazy {
        AlbumAdapter(albumData)
    }

    override fun initView() {

        binding.AlbumRcv.layoutManager =
            GridLayoutManager(this@AlbumAct,3)
        binding.AlbumRcv.adapter = albumAdapter



    }

    override fun initAction() {

    }

    override fun getContentView(): Int {
        return R.layout.activity_album
    }

    override fun bindViewModel() {

    }
}