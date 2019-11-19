package com.dablaze.wikiapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dablaze.wikiapp.R
import com.dablaze.wikiapp.holders.ArticleCardViewHolder


class ArticleCardRecyclerAdapter : RecyclerView.Adapter<ArticleCardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleCardViewHolder {
        val cardItem =
            LayoutInflater.from(parent.context).inflate(R.layout.article_card_item, parent, false)
        return ArticleCardViewHolder(cardItem)
    }

    override fun getItemCount(): Int {
        return 15
    }

    override fun onBindViewHolder(holder: ArticleCardViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}