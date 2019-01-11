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
import kotlinx.android.synthetic.main.fragment_job.*
import java.util.*

import com.example.thoma.tpnot_11_01_2019.adapter.JobAdapter
import com.example.thoma.tpnot_11_01_2019.model.Job


class JobFragment : Fragment() {

    var arrayJobs: List<Skill> = Arrays.asList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_job, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        recyclerJob.layoutManager = LinearLayoutManager(context)
        // TODO récupérer les données
        // TODO réinit la vue après la récéption des données
        val adapter = SkillAdapter(arrayJobs)
        recyclerJob.adapter = adapter

////        arrayJobs.ad
//        /** Create handle for the RetrofitInstance interface*/
//        val service = RetrofitInstance.getRetrofitInstance().create(GetDataService::class.java)
//
//        /** Call the method with parameter in the interface to get the notice data*/
//        val call = service.getJobData()
//
//        /**Log the URL called*/
//        Log.wtf("URL Called", call.request().url().toString())
//
//        call.enqueue(object : Callback<JobList>() {
//            fun onResponse(call: Call<JobList>, response: Response<JobList>) {
//                val array = arrayOfNulls<Job>(arrayJobs.size)
//                arrayJobs.toTypedArray(array)
//                generateNoticeList(response.body().getJobList())
//            }
//
//            fun onFailure(call: Call<JobList>, t: Throwable) {
//                context?.toast("Something went wrong...Error message: " + t.message)
//            }
//        })




//        recyclerJob.adapter = adapter

    }

    /** Method to generate List of notice using RecyclerView with custom adapter */
    private fun generateNoticeList(jobArrayList: ArrayList<Job>) {
        recyclerJob.layoutManager = LinearLayoutManager(context)
        val adapter = JobAdapter(jobArrayList)
//        recyclerJob.LayoutManager(layoutManager)
        recyclerJob.setAdapter(adapter)
    }
}
