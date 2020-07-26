package com.example.testrevolut.model.models;

public class Rate {

    private float value;
    private String currency;
    private String currencyName;
    private int flagImageId;


    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public int getFlagImageId() {
        return flagImageId;
    }

    public void setFlagImageId(int flagImageId) {
        this.flagImageId = flagImageId;
    }
}
