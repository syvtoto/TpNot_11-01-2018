package com.example.thoma.tpnot_11_01_2019;

import com.example.thoma.tpnot_11_01_2019.model.Job;
import com.example.thoma.tpnot_11_01_2019.model.JobList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface GetDataService
{
    @GET("bins/1bsqcn/")
    Call<JobList> getJobData();

    /**
     * URL MANIPULATION
     * Using Query parameters.
     * */
    @GET("group/{id}/users")
    Call<List<Job>> groupList(@Path("id") int groupId, @Query("sort") String sort);
}
