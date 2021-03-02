package com.dolphpire;

import android.os.Bundle;

import com.zeoflow.compat.ActivityCore;

public class MainActivity extends ActivityCore
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}