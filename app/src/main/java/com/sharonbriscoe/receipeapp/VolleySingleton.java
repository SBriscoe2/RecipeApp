package com.sharonbriscoe.receipeapp;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleySingleton {

    private static VolleySingleton sInstance= null;

    private RequestQueue mrequestQueue;

    private VolleySingleton(){
        mrequestQueue = Volley.newRequestQueue(MyApplication.getAppContext());

    }

    public static VolleySingleton getInstance(){
        if(sInstance == null)
        {
            sInstance= new VolleySingleton();
        }
        return sInstance;
    }

    public RequestQueue getMrequestQueue () {
        return mrequestQueue;
    }
}
