package com.example.untitled;
import android.content.res.Configuration;
import android.app.Application;
/**
 * Created by sundays on 7/13/14.
 */
public class MyApplication extends Application{
    private static MyApplication singleton;
    public static MyApplication getInstance() {
        return singleton;
    }
    @Override
    public final void onCreate(){
        super.onCreate();
        singleton = this;
    }
    @Override
    public final void onLowMemory(){
        super.onLowMemory();
    }
    @Override
    public final void onTrimMemory(int level){
        super.onTrimMemory(level);
    }
    @Override
    public final void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);
    }
}