package com.digimaster.projectdia.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.digimaster.projectdia.R

import com.digimaster.projectdia.model.JobPosition

class ListAdapter(private val arrayList: List<JobPosition>):RecyclerView.Adapter<ListAdapter.JobHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobHolder {
       return JobHolder(LayoutInflater.from(parent.context).inflate(R.layout.row,parent,false))
    }

    override fun onBindViewHolder(holder: JobHolder, position: Int) {
val data = arrayList[holder.adapterPosition]
        holder.tv.text = data.jobName

    }

    override fun getItemCount(): Int =arrayList.size
    class JobHolder(view:View):RecyclerView.ViewHolder(view){
        var tv :TextView = view.findViewById(R.id.tvJobName)
    }

}