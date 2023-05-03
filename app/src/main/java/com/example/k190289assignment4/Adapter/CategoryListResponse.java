package com.example.k190289assignment4.Adapter;

import com.example.k190289assignment4.Domain.CategoryDomain;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class CategoryListResponse {
    @SerializedName("data")
    public List<CategoryDomain> data = new ArrayList<>();
}
