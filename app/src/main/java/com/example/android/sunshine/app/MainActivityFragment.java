package com.example.android.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] arrayForecast = {
                "Tuesday - Snowy - 1C",
                "Wednesday - Cloudy - 0C",
                "Thursday - Rainy - 2C",
                "Friday - Cats and Dogs - 3C",
                "Saturday - Foggy - 2C",
                "Sunday - Sunny - 5C" };
        List<String> weekForecast = new ArrayList<String>(Arrays.asList(arrayForecast));
        ArrayAdapter<String> mForecastAdapter = new ArrayAdapter<String>
                (getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, weekForecast);
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);
        return rootView;
    }
}
