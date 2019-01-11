package com.example.thoma.tpnot_11_01_2019.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JobList {
    @SerializedName("Job_List")
    private List<Job> jobList;

    public List<Job> getJobList() {
        return jobList;
    }

    public void setJobList(List<Job> jobList) {
        this.jobList = jobList;
    }
}
