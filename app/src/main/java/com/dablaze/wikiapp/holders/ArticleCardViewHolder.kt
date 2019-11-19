package com.dablaze.wikiapp.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dablaze.wikiapp.R

class ArticleCardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var articleImage: ImageView = itemView.findViewById(R.id.imageView_article)
    private var articleText: TextView = itemView.findViewById(R.id.textView_article)
}