package com.tanmaychordia.us;

import android.app.Application;

import com.parse.Parse;
import com.pubnub.api.Pubnub;

/**
 * Created by Tanmay on 7/10/15.
 */
public class UsApp extends Application {

    public static final String subKey = "sub-c-d60bd90e-27f0-11e5-b869-0619f8945a4f";
    public static final String pubKey = "pub-c-c5299197-0afe-40da-9164-fad99f2da26c";
    public static final Pubnub pubnub = new Pubnub(subKey,pubKey);
    public static String myId;
    @Override
    public void onCreate(){
        super.onCreate();

        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "dyWJIWnj9GVRHJWy3xUXYt5hmWgtQQR5uSoUOM0T", "vaGQ8S3Eh04T8iC1Fg5VVcdbOZojncXLEzDMcdWK");





    }
}
