package com.example.vishalkumar1.moviesrating.activity.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vishalkumar1.moviesrating.R;
import com.example.vishalkumar1.moviesrating.activity.MainActivity;
import com.example.vishalkumar1.moviesrating.activity.TopMovieActivity;
import com.example.vishalkumar1.moviesrating.adapter.MoviesAdapter;
import com.example.vishalkumar1.moviesrating.constant.ProjectConst;
import com.example.vishalkumar1.moviesrating.listener.RecyclerTouchListener;
import com.example.vishalkumar1.moviesrating.model.Movie;
import com.example.vishalkumar1.moviesrating.model.MovieResponse;
import com.example.vishalkumar1.moviesrating.rest.ApiClient;
import com.example.vishalkumar1.moviesrating.rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by gaurav on 31-08-2016.
 */
public class SearchMovies extends BaseFragment implements View.OnClickListener {
    TextView t;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view=inflater.inflate(R.layout.fragment_search_movie,container,false);
        t= (TextView) view.findViewById(R.id.txt_search_movie);
        Button button=(Button) view.findViewById(R.id.btn_searchMovie);
        button.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_searchMovie:
                Log.d("Search", t.getText().toString() );
                ((MainActivity)getActivity()).SearchMovieResult(t.getText().toString());
                break;
        }
    }
}
