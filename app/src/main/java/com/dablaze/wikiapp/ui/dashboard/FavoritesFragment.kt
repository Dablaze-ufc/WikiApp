package com.dablaze.wikiapp.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dablaze.wikiapp.R
import com.dablaze.wikiapp.adapters.ArticleCardRecyclerAdapter
import kotlinx.android.synthetic.main.fragment_favorities.*

class FavoritesFragment : Fragment() {
    val favouritesRecyclerView: RecyclerView? = null

    override

    fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_favorities, container, false)
        favorites_recyclerView.layoutManager = LinearLayoutManager(context)
        favorites_recyclerView.adapter = ArticleCardRecyclerAdapter()
        return view
    }

}