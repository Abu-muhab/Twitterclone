package com.example.android.twitterclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private Page currentPage;
    int currentToolBarId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.home_toolbar);
        currentToolBarId = R.id.home_toolbar;
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setElevation(4);

        TimelineFragment timelineFragment = new TimelineFragment();
        timelineFragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, timelineFragment).commit();
        currentPage = Page.TIMELINE;
    }

    public void aviClicked(View view) {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.openDrawer(Gravity.LEFT);
    }

    public void homeButtonCLicked(View view) {
        TimelineFragment timelineFragment = new TimelineFragment();
        if (currentPage != Page.TIMELINE) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, timelineFragment).commit();
            replaceToolBar(R.layout.home_toolbar, currentToolBarId);
            currentToolBarId = R.id.home_toolbar;
            currentPage = Page.TIMELINE;
        }
    }

    public void searchButtonClicked(View view) {
        SearchFragment searchFragment = new SearchFragment();
        if (currentPage != Page.SEARCH) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, searchFragment, "search").commit();
            replaceToolBar(R.layout.search_toolbar, currentToolBarId);
            currentToolBarId = R.id.search_toolbar;
            currentPage = Page.SEARCH;
        }
    }

    void replaceToolBar(int newToolBarLayoutId, int oldToolBarId) {
        Toolbar toolbar = findViewById(oldToolBarId);
        ViewGroup parent = (ViewGroup) toolbar.getParent();
        int index = parent.indexOfChild(toolbar);
        parent.removeView(toolbar);
        toolbar = (Toolbar) getLayoutInflater().inflate(newToolBarLayoutId, parent, false);
        parent.addView(toolbar, index);
    }
}

enum Page {
    TIMELINE,
    SEARCH,
    NOTIFICATION,
    MESSAGES
}