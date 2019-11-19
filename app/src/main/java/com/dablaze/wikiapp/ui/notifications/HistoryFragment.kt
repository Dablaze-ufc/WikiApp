package com.dablaze.wikiapp.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.dablaze.wikiapp.R
import com.dablaze.wikiapp.adapters.ArticalListRecyclerAdapter
import kotlinx.android.synthetic.main.fragment_history.*
import java.lang.ArithmeticException

class HistoryFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_history, container, false)
        history_recyclerView.layoutManager = LinearLayoutManager(context)
        history_recyclerView.adapter = ArticalListRecyclerAdapter()

        return view
    }
}