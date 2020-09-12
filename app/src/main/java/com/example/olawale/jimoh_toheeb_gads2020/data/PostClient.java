package com.example.olawale.jimoh_toheeb_gads2020.data;

import com.example.olawale.jimoh_toheeb_gads2020.pojo.SkillIqModel;
import com.example.olawale.jimoh_toheeb_gads2020.pojo.TopLearnerModel;
import com.example.olawale.jimoh_toheeb_gads2020.pojo.TopLearnerModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PostClient {

    private static final String BASE_URL = "https://gadsapi.herokuapp.com/";
    private com.example.olawale.jimoh_toheeb_gads2020.data.PostInterface postInterface;
    private static PostClient INSTANCE;
    public PostClient( ) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        postInterface = retrofit.create(com.example.olawale.jimoh_toheeb_gads2020.data.PostInterface.class);
    }


    // Singelton

    public static PostClient getINSTANCE() {
        if (null == INSTANCE){
            INSTANCE = new PostClient();
        }
        return INSTANCE;
    }
    public Call<List<SkillIqModel>>getTopSkill(){
        return postInterface.getTopSkill();
    }
    public Call<List<TopLearnerModel>>getTopLearners(){ return postInterface.getTopLearners(); }
}
