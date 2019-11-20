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

class FavoritesFragment : Fragment() {
    private var favouritesRecyclerView: RecyclerView? = null

    override

    fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_favorities, container, false)
        favouritesRecyclerView = view.findViewById(R.id.favorites_recyclerView)
        favouritesRecyclerView!!.layoutManager = LinearLayoutManager(context)
        favouritesRecyclerView!!.adapter = ArticleCardRecyclerAdapter()
        return view
    }

}