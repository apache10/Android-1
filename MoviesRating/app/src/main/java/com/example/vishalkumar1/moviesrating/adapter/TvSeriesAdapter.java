package com.example.vishalkumar1.moviesrating.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.vishalkumar1.moviesrating.R;
import com.example.vishalkumar1.moviesrating.model.Movie;
import com.example.vishalkumar1.moviesrating.model.TvSeries;

import java.util.List;

/**
 * Created by gaurav on 14/10/16.
 */

public class TvSeriesAdapter extends RecyclerView.ViewHolder {

        private List<TvSeries> tvSeries;
        private int rowLayout;
        private Context context;

        public static  class TvSeriesViewHolder extends RecyclerView.ViewHolder{
            LinearLayout moviesLayout;
            TextView movieTitle;
            TextView data;
            TextView movieDescription;
            TextView rating;

            public TvSeriesViewHolder(View v){
                super(v);
                moviesLayout = (LinearLayout) v.findViewById(R.id.movies_layout);
                movieTitle = (TextView) v.findViewById(R.id.title);
                data = (TextView) v.findViewById(R.id.subtitle);
                movieDescription = (TextView) v.findViewById(R.id.description);
                rating = (TextView) v.findViewById(R.id.rating);
            }
        }

        public TvSeriesAdapter(List<TvSeries> tvSeries, int rowLayout, Context context) {
            this.tvSeries = tvSeries;
            this.rowLayout = rowLayout;
            this.context = context;
        }

        @Override
        public com.example.vishalkumar1.moviesrating.adapter.TvSeriesAdapter.TvSeriesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
            return new com.example.vishalkumar1.moviesrating.adapter.TvSeriesAdapter.TvSeriesViewHolder(view);
        }

        @Override
        public void onBindViewHolder(com.example.vishalkumar1.moviesrating.adapter.TvSeriesAdapter.TvSeriesViewHolder holder, int position) {
            holder.movieTitle.setText(tvSeries.get(position).getTitle());
            holder.data.setText(tvSeries.get(position).getReleaseDate());
            holder.movieDescription.setText(tvSeries.get(position).getOverview());
            holder.rating.setText(tvSeries.get(position).getVoteAverage().toString());
        }

        @Override
        public int getItemCount() {
            return tvSeries.size();
        }
    }