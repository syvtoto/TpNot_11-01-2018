package com.example.thoma.tpnot_11_01_2019.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.thoma.tpnot_11_01_2019.R
import com.example.thoma.tpnot_11_01_2019.model.Job

class JobAdapter(private val jobs: List<Job>): RecyclerView.Adapter<JobAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_job, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return jobs.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(jobs[position])
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindItems(job: Job) {
            // TODO set la vue

        }
    }
}