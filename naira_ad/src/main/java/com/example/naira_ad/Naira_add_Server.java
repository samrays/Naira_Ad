package com.example.naira_ad;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Naira_add_Server {
    @GET("/users/{id}/{ip}")
    Call<List<AddInfo>> getAddInfo(@Path("id") String id, @Path("repos") String ip);
}
