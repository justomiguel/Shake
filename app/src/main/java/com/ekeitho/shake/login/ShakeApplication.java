package com.ekeitho.shake.login;

import android.app.Application;

import com.ekeitho.shake.R;
import com.parse.Parse;
import com.parse.ParseFacebookUtils;

public class ShakeApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        /* Enable Local Datastore */
        Parse.enableLocalDatastore(this);

        // Required - Initialize the Parse SDK
        Parse.initialize(this, getString(R.string.parse_app_id),
                getString(R.string.parse_client_key));

        ParseFacebookUtils.initialize(getString(R.string.parse_app_id));

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

    }

}
