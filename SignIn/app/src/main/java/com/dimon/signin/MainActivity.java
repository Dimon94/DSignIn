package com.dimon.signin;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.fabBtn)
    FloatingActionButton mFabBtn;
    @Bind(R.id.app_bar_layout)
    AppBarLayout mAppBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initUi();
        initializeToolbar();
    }

    private void initUi() {
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    private void initializeToolbar() {
        setSupportActionBar(mToolbar);
        mToolbar.setTitle("GanWuMei");

        if (mToolbar == null || mAppBar == null) {
            throw new IllegalStateException("No toolbar");
        }

        mToolbar.setOnClickListener(v -> onToolbarClick());

        setSupportActionBar(mToolbar);

        if (canBack()) {
            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) actionBar.setDisplayHomeAsUpEnabled(true);
        }

        if (Build.VERSION.SDK_INT >= 21) {
            mAppBar.setElevation(10.6f);
        }
    }

    private void onToolbarClick() {

    }

    public boolean canBack() {
        return false;
    }
}
