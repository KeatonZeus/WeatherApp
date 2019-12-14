package com.example.leo.weatherapp.Retrofit;

import com.example.leo.weatherapp.Model.WeatherForecastResult;
import com.example.leo.weatherapp.Model.WeatherResult;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IOpenWeatherMap {
    @GET("weather")
    Observable<WeatherResult> getWeatherByLating(@Query("lat") String lat,  //用我的位置去查 才要這些
                                                 @Query("lon") String lon,
                                                 @Query("appid") String appid,
                                                 @Query("units") String unit); //單位

    @GET("forecast")
    Observable<WeatherForecastResult> getForecastWeatherByLating(@Query("lat") String lat,  //用我的位置去查 才要這些
                                                                 @Query("lon") String lon,
                                                                 @Query("appid") String appid,
                                                                 @Query("units") String unit); //單位
}
