package com.example.myapplication.screens.second

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import kotlinx.android.synthetic.main.fragment_second.view.*

class SecondFragment : Fragment() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: SecondAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val viewModel = ViewModelProvider(this)[SecondViewModel::class.java]
        recyclerView = view.rcViewSecond
        adapter = SecondAdapter()
        recyclerView.adapter = adapter
        viewModel.getBezNalMoney()
        viewModel.myMoneyList.observe(viewLifecycleOwner) { list ->
            list.body()?.let { adapter.setList(it) }
        }
        return view
    }
}