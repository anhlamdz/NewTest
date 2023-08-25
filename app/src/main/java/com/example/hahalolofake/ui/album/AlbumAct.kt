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





    override fun initView() {

        binding.AlbumRcv.layoutManager =
            GridLayoutManager(this@AlbumAct,3)
        binding.AlbumRcv.adapter= AlbumAdapter(AlbumAdapter.dummyData)


    }

    override fun initAction() {

    }

    override fun getContentView(): Int {
        return R.layout.activity_album
    }

    override fun bindViewModel() {

    }
}