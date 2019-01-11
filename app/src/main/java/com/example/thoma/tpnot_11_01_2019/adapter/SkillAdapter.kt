package com.example.thoma.tpnot_11_01_2019.adapter

import android.app.slice.Slice
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.thoma.tpnot_11_01_2019.R
import com.example.thoma.tpnot_11_01_2019.model.Skill

class SkillAdapter(private val skills: List<Skill>): RecyclerView.Adapter<SkillAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_skill, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return skills.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(skills[position])
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindItems(skill: Skill) {

            itemView.setOnClickListener {

            }
            // TODO set la vue

        }
    }
}