package com.example.k190289assignment4.Interface;

import com.example.k190289assignment4.Adapter.CategoryListResponse;

import retrofit.Callback;
import retrofit.http.GET;

public interface CategoryAPI_Interface {
    @GET("/api/users") public void getUsersList(
            Callback<CategoryListResponse> callback);
}
