package com.test.mylogin;

import android.app.Application;

import com.test.mylogin.dagger.components.ApplicationComponent;
import com.test.mylogin.dagger.modules.ApplicationModule;


/**
 * Created by kiwitech on 1/8/17.
 */

public class AndroidApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override public void onCreate() {
        super.onCreate();
        this.initializeInjector();
        this.initializeLeakDetection();
    }

    private void initializeInjector() {
//        this.applicationComponent = DaggerApplicationComponent.builder()
//                .applicationModule(new ApplicationModule(this))
//                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return this.applicationComponent;
    }

    private void initializeLeakDetection() {
//            LeakCanary.install(this);
    }
}