package com.dablaze.wikiapp.ui.home


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.dablaze.wikiapp.R
import com.dablaze.wikiapp.SearchActivity
import com.dablaze.wikiapp.adapters.ArticleCardRecyclerAdapter
import com.dablaze.wikiapp.holders.ArticleCardViewHolder
import com.google.android.material.card.MaterialCardView
import kotlinx.android.synthetic.main.fragment_explore.*

class ExploreFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_explore, container, false)

        search_card.setOnClickListener {
            val searchIntent = Intent(context, SearchActivity::class.java)
            context?.startActivity(searchIntent)
            article_recycler_explore.layoutManager = LinearLayoutManager(context)
            article_recycler_explore.adapter = ArticleCardRecyclerAdapter()
        }
        return view
    }


}



