package com.example.olawale.jimoh_toheeb_gads2020.data;


import com.example.olawale.jimoh_toheeb_gads2020.pojo.SkillIqModel;
import com.example.olawale.jimoh_toheeb_gads2020.pojo.TopLearnerModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostInterface {
    @GET("api/skilliq")
    public Call<List<SkillIqModel>>   getTopSkill();

    @GET("api/hours")
    public Call<List<TopLearnerModel>>   getTopLearners();

}
