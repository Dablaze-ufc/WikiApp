package com.dablaze.wikiapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dablaze.wikiapp.R
import com.dablaze.wikiapp.holders.ArticleListViewHolder

class ArticalListRecyclerAdapter : RecyclerView.Adapter<ArticleListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleListViewHolder {
        val listItem =
            LayoutInflater.from(parent.context).inflate(R.layout.article_list_item, parent, false)
        return ArticleListViewHolder(listItem)
    }

    override fun getItemCount(): Int {
        return 15
    }

    override fun onBindViewHolder(holder: ArticleListViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}