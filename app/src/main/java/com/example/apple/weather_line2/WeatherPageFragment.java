package com.example.apple.weather_line2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by 张越 on on 17-6-4.
 */

public class WeatherPageFragment extends Fragment {

    String locationName = "";
    String temperature = "";
    public WeatherPageFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_weather_page, container, false);
        TextView locationTv = (TextView) root.findViewById(R.id.tv);
        TextView tempTv = (TextView) root.findViewById(R.id.tv_temperature);
        locationTv.setText(locationName);
        tempTv.setText(temperature);

        return root;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
}
