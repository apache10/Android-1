package com.example.vishalkumar1.moviesrating.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by gaurav on 13/10/16.
 */

public class TvSeriesResponse {

    @SerializedName("page")
    private int page;

    @SerializedName("results")
    private List<TvSeries> results;

    @SerializedName("total_results")
    private int totalResults;

    @SerializedName("total_pages")
    private int totalPages;

    public int getPage(){
        return page;
    }

    public void setPage(int page){
        this.page=page;
    }

    public List<TvSeries> getResults(){
        return results;
    }
    public void setResults(List<TvSeries> results){
        this.results=results;
    }

    public int getTotalResults(){
        return totalResults;
    }

    public void setTotalResults(int totalResults){
        this.totalResults=totalResults;
    }

    public int getTotalPages(){
        return totalPages;
    }

    public void setTotalPages(int totalPages){
        this.totalPages=totalPages;
    }
}