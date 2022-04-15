package com.example.myapplication.screens.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.curse.KurseItem
import kotlinx.android.synthetic.main.item_money_layout.view.*

class StartAdapter:RecyclerView.Adapter<StartAdapter.StartViewHolder>() {
    var listStart = emptyList<KurseItem>()
    class
        StartViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout,parent, false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.itemView.item_name.text = listStart[position].currencyCodeA.toString()
        if (listStart[position].rateBuy == 0.0){
            holder.itemView.item_buy.text = listStart[position].rateCross.toString()
            holder.itemView.item_sale.text = ""
        }
        else {
            holder.itemView.item_buy.text = listStart[position].rateBuy.toString()
            holder.itemView.item_sale.text = listStart[position].rateSell.toString()
        }
    }

    override fun getItemCount(): Int {
        return listStart.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list:List<KurseItem>){
        listStart = list
        notifyDataSetChanged()
    }
}