package com.example.myapplication.screens.root

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.example.myapplication.R
import com.example.myapplication.ViewPagerAdapter
import kotlinx.android.synthetic.main.fragment_root.*
import kotlinx.android.synthetic.main.fragment_root.view.*

class RootFragment : Fragment() {

    private var ctx:Context? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        ctx = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_root, container,false)
        view.tab_layout.tabIconTint = null
        view.view_pager.adapter = ViewPagerAdapter(ctx as FragmentActivity)
        //Inflate the layout for this fragment
        return view
    }
}