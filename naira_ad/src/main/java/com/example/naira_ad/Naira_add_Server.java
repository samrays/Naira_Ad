package com.example.naira_ad;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Naira_add_Server {
    @GET("mobile-ads/{id}/{ip}")
    Call<List<AddInfo>> getAddInfo(@Path("id") int id, @Path("ip") String ip);
}
