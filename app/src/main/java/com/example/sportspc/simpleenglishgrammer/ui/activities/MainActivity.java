package com.example.sportspc.simpleenglishgrammer.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.sportspc.simpleenglishgrammer.R;
import com.example.sportspc.simpleenglishgrammer.adapters.HomeListAdapter;
import com.example.sportspc.simpleenglishgrammer.utilhelpers.Constants;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringArrayRes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@EActivity(R.layout.activity_main)

public class MainActivity extends AppCompatActivity {
    HomeListAdapter homeListAdapter;
    @ViewById
    ListView lvHome;

    @ViewById(R.id.homeNavigation)
    BottomNavigationView homeBottomNavigation;

    @AfterViews
    void initHomeList() {
        listHomeItems = new ArrayList<>();
        listHomeItems = Arrays.asList(homeNameList);
        homeListAdapter = new HomeListAdapter(this, listHomeItems);
        lvHome.setAdapter(homeListAdapter);
        homeBottomNavigation.setOnNavigationItemSelectedListener(mHomeBottomNavigation);
    }

    @ItemClick
   public void lvHome(int pos) {
        startActivity(new Intent(this,DetailActivity_.class).putExtra(Constants.KEY_CAT_MAIN_PAGE,"grammar/"+listHomeItems.get(pos).toString()));

    }
    private void getBranch(){

    }


    private BottomNavigationView.OnNavigationItemSelectedListener mHomeBottomNavigation = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    getSupportActionBar().setTitle(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    getSupportActionBar().setTitle(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    getSupportActionBar().setTitle(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };



    //data
    @StringArrayRes
    String[] homeNameList;


    List listHomeItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

}
