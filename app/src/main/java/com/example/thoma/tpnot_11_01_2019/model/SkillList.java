package com.example.thoma.tpnot_11_01_2019.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SkillList {
    @SerializedName("Skill_List")
    private List<Skill> skillList;

    public List<Skill> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<Skill> skillList) {
        this.skillList = skillList;
    }
}
