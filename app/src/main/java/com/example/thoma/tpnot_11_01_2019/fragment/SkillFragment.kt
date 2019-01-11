package com.example.thoma.tpnot_11_01_2019.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.thoma.tpnot_11_01_2019.R
import com.example.thoma.tpnot_11_01_2019.adapter.SkillAdapter
import com.example.thoma.tpnot_11_01_2019.model.Skill
import kotlinx.android.synthetic.main.fragment_skill.*
import java.util.*

class SkillFragment : Fragment() {

    var arraySkills: List<Skill> = Arrays.asList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_skill, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerSkill.layoutManager = LinearLayoutManager(context)

        // TODO récupérer les données

        // TODO attendre la vue après la récéption des données

        val adapter = SkillAdapter(arraySkills)
        recyclerSkill.adapter = adapter

    }


}
