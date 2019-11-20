package com.dablaze.wikiapp.ui.home


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dablaze.wikiapp.R
import com.dablaze.wikiapp.SearchActivity
import com.dablaze.wikiapp.adapters.ArticleCardRecyclerAdapter
import com.dablaze.wikiapp.holders.ArticleCardViewHolder
import com.google.android.material.card.MaterialCardView
import kotlinx.android.synthetic.main.fragment_explore.*

class ExploreFragment : Fragment() {
    private var searchCard: MaterialCardView? = null
    private var exploreRecyclerView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_explore, container, false)
        searchCard = view.findViewById(R.id.search_card)
        exploreRecyclerView = view.findViewById(R.id.article_recycler_explore)


        searchCard!!.setOnClickListener {
            val searchIntent = Intent(context, SearchActivity::class.java)
            context?.startActivity(searchIntent)
            exploreRecyclerView!!.layoutManager = LinearLayoutManager(context)
            exploreRecyclerView!!.adapter = ArticleCardRecyclerAdapter()
        }
        return view
    }


}



