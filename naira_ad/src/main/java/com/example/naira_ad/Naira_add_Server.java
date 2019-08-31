package com.example.naira_ad;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Naira_add_Server {
    @GET("mobile-ads/1258755/41.217.18.54")
    Call<List<AddInfo>> getAddInfo();
}
