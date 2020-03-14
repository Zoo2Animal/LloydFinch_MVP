package com.lloydfinch.l_mvp;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.lloydfinch.l_mvp.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //<editor-fold desc="lifecycle">
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.hello.setText("hello, binding");
        init(this);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    //</editor-fold>

    //<editor-fold desc="init方法">
    private void init(Context context) {
        initView();
        initData();
        initEvent();

        Log.e(TAG, "init: ");
    }

    private void initView() {

    }

    private void initData() {

    }

    private void initEvent() {

    }
    //</editor-fold>
}
