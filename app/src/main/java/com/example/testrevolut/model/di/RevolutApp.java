package com.example.testrevolut.model.di;

import android.app.Application;

import com.example.testrevolut.DaggerApplicationComponent;

public class RevolutApp extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getComponent() {
        return applicationComponent;
    }
}
