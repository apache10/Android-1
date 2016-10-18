package com.example.vishalkumar1.moviesrating.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaurav on 13/10/16.
 */

public class TvSeries implements Serializable{
    @SerializedName("poster_path")
    private String posterPath;

    @SerializedName("overview")
    private String overview;

    @SerializedName("genre_ids")
    private List<Integer> genreIds = new ArrayList<Integer>();

    @SerializedName("id")
    private Integer id;

    @SerializedName("original_name")
    private String originalName;

    @SerializedName("first_air_date")
    private String firstAirDate;

    @SerializedName("original_language")
    private String originalLanguage;

    @SerializedName("backdrop_path")
    private String backdropPath;

    @SerializedName("popularity")
    private Double popularity;

    @SerializedName("vote_count")
    private Integer voteCount;

    @SerializedName("vote_average")
    private Double voteAverage;

    @SerializedName("origin_country")
    private String originCountry;

    public TvSeries(String posterPath, String overview, String firstAirDate, List<Integer> genreIds, Integer id,
                 String originalName, String originalLanguage, String backdropPath, Double popularity,
                 Integer voteCount, Double voteAverage,String originCountry) {
        this.posterPath = posterPath;
        this.overview = overview;
        this.firstAirDate = firstAirDate;
        this.genreIds = genreIds;
        this.id = id;
        this.originalName = originalName;
        this.originalLanguage = originalLanguage;
        this.backdropPath = backdropPath;
        this.popularity = popularity;
        this.voteCount = voteCount;
        this.voteAverage = voteAverage;
        this.originCountry= originCountry;
    }
    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }


    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getFirstAirDate() {
        return firstAirDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.firstAirDate = firstAirDate;
    }

    public List<Integer> getGenreIds() {
        return genreIds;
    }

    public void setGenreIds(List<Integer> genreIds) {
        this.genreIds = genreIds;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalName = originalName;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public Double getPopularity() {
        return popularity;
    }

    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }
}