package com.example.olawale.jimoh_toheeb_gads2020;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.olawale.jimoh_toheeb_gads2020.data.PostClient;
import com.example.olawale.jimoh_toheeb_gads2020.pojo.SkillIqModel;
import com.example.olawale.jimoh_toheeb_gads2020.pojo.TopLearnerModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
// This is the View Model here
public class DataViewModel extends ViewModel {

    public  MutableLiveData<List<SkillIqModel>> skillmutabledata = new MutableLiveData<>();
    public MutableLiveData<List<TopLearnerModel>> toplearnermutabledata = new MutableLiveData<>();


    public void getTopSkill(){

        PostClient.getINSTANCE().getTopSkill().enqueue(new Callback<List<SkillIqModel>>() {
            @Override
            public void onResponse(Call<List<SkillIqModel>> call, Response<List<SkillIqModel>> response) {
                skillmutabledata.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<SkillIqModel>> call, Throwable t) {

            }
        });
    }
    public void getToplearners(){

        PostClient.getINSTANCE().getTopLearners().enqueue(new Callback<List<TopLearnerModel>>() {
            @Override
            public void onResponse(Call<List<TopLearnerModel>> call, Response<List<TopLearnerModel>> response) {
                toplearnermutabledata.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<TopLearnerModel>> call, Throwable t) {

            }
        });
    }
}
