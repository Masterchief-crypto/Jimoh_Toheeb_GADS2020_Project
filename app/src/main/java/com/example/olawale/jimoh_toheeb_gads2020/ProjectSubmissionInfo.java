package com.example.olawale.jimoh_toheeb_gads2020;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProjectSubmissionInfo {
    @SerializedName("firstName")
    @Expose
    private  String firstName;

    @SerializedName("lastName")
    @Expose
    private String lastName;

    @SerializedName("emailAdress")
    @Expose
    private String emailAdress;

    @SerializedName("githubLink")
    @Expose
    private String githubLink;

    public ProjectSubmissionInfo(String firstName, String lastName, String emailAdress, String githubLink) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAdress = emailAdress;
        this.githubLink = githubLink;
    }
}
