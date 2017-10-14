package com.training.iqbaaaaalf.tasktutoryan001.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by iqbaaaaalf on 10/8/2017.
 */

public class ApiClient {
    public static final String BASE_URL = "http://yippytech.com:3000/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient(){
        if(retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
