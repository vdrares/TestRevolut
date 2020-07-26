package com.example.testrevolut.model.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RatesDataResponse {

    @SerializedName("baseCurrency")
    @Expose
    private String baseCurrency;
    @SerializedName("rates")
    @Expose
    private RatesResponse rates;

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public RatesResponse getRates() {
        return rates;
    }

    public void setRates(RatesResponse rates) {
        this.rates = rates;
    }
}
