package com.example.thoma.tpnot_11_01_2019.model;

import com.google.gson.annotations.SerializedName;

public class Job {
    @SerializedName("name")
    private String name;
    @SerializedName("normalized_name")
    private String normalized_skill_name;
    private String onet_element_id;
    @SerializedName("uid")
    private String uuid;

    public Job() {
    }

    public Job(String name, String normalized_skill_name, String onet_element_id, String uuid) {
        this.name = name;
        this.normalized_skill_name = normalized_skill_name;
        this.onet_element_id = onet_element_id;
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNormalized_skill_name() {
        return normalized_skill_name;
    }

    public void setNormalized_skill_name(String normalized_skill_name) {
        this.normalized_skill_name = normalized_skill_name;
    }

    public String getOnet_element_id() {
        return onet_element_id;
    }

    public void setOnet_element_id(String onet_element_id) {
        this.onet_element_id = onet_element_id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "Job{" +
                "name='" + name + '\'' +
                ", normalized_skill_name='" + normalized_skill_name + '\'' +
                ", onet_element_id='" + onet_element_id + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
