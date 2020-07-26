package com.example.testrevolut.model.networking;

import com.example.testrevolut.model.models.Rate;
import com.example.testrevolut.model.models.RatesDataResponse;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    @GET("base")
    Observable<RatesDataResponse> getRates(@Path("base") String base);

}
