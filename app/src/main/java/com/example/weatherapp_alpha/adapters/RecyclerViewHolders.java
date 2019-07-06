package com.example.weatherapp_alpha.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.weatherapp_alpha.R;

public class RecyclerViewHolders extends RecyclerView.ViewHolder{

    private static final String TAG = RecyclerViewHolders.class.getSimpleName();

    public TextView dayOfWeek;

    public ImageView weatherIcon;

    public TextView weatherResult;

    public TextView weatherResultSmall;

    public RecyclerViewHolders(final View itemView) {
        super(itemView);
        dayOfWeek = (TextView)itemView.findViewById(R.id.day_of_week);
        weatherIcon = (ImageView)itemView.findViewById(R.id.weather_icon);
        weatherResult = (TextView) itemView.findViewById(R.id.weather_result);
        weatherResultSmall = (TextView)itemView.findViewById(R.id.weather_result_small);
    }
}
