package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register Parse model
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("JNxzlKcA2IYNwKbylQD645N4H7nsLa9bCXI68wpe")
                .clientKey("E9pmoWbbk5zDVoVKbX6prKB8Lj9OuS9kK089jepZ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }

}
