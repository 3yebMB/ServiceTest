package dev.m13d.servicetest.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import dev.m13d.servicetest.R;
import dev.m13d.servicetest.service.MyLifeCycleService;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startService(View v) {
        startService(new Intent(this, MyLifeCycleService.class));
    }

    public void stopService(View v) {
        stopService(new Intent(this, MyLifeCycleService.class));
    }

}
