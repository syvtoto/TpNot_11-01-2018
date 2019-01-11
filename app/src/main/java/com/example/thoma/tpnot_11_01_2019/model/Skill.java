package com.example.thoma.tpnot_11_01_2019.model;

import com.google.gson.annotations.SerializedName;

public class Skill {

    private String description;
    private String importance;
    private String level;
    @SerializedName("normalized_name")
    private String normalized_skill_name;
    @SerializedName("name")
    private String skill_name;
    @SerializedName("uid")
    private String skill_uuid;

    public Skill() {
    }

    public Skill(String description, String importance, String level, String normalized_skill_name, String skill_name, String skill_uuid) {
        this.description = description;
        this.importance = importance;
        this.level = level;
        this.normalized_skill_name = normalized_skill_name;
        this.skill_name = skill_name;
        this.skill_uuid = skill_uuid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getNormalized_skill_name() {
        return normalized_skill_name;
    }

    public void setNormalized_skill_name(String normalized_skill_name) {
        this.normalized_skill_name = normalized_skill_name;
    }

    public String getSkill_name() {
        return skill_name;
    }

    public void setSkill_name(String skill_name) {
        this.skill_name = skill_name;
    }

    public String getSkill_uuid() {
        return skill_uuid;
    }

    public void setSkill_uuid(String skill_uuid) {
        this.skill_uuid = skill_uuid;
    }
}
