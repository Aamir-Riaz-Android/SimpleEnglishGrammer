package com.example.sportspc.simpleenglishgrammer.ui.activities;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.sportspc.simpleenglishgrammer.R;
import com.example.sportspc.simpleenglishgrammer.adapters.DynamicPageAdapter;
import com.example.sportspc.simpleenglishgrammer.ui.fragments.DynamicPage;
import com.example.sportspc.simpleenglishgrammer.utilhelpers.Constants;
import com.example.sportspc.simpleenglishgrammer.utilhelpers.InitialiseData;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.FragmentById;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_detail)
public class DetailActivity extends AppCompatActivity {
    DynamicPageAdapter mAdapter;

    @ViewById (R.id.detailPager)
    ViewPager detailsViewPager;

   /* @ViewById (R.id.webVDetails)
    WebView wVDetails;*/
@AfterViews
 void initAdapter(){
    Bundle extras=this.getIntent().getExtras();
    Constants.CAT_MAIN_PAGE=extras.getString(Constants.KEY_CAT_MAIN_PAGE);
    InitialiseData.getPagesList(extras.getString(Constants.KEY_CAT_MAIN_PAGE));
    this.mAdapter = new DynamicPageAdapter(getSupportFragmentManager());
    detailsViewPager.setAdapter(this.mAdapter);
    }


    /* @FragmentById
     void setFragment(DynamicPage dynamicPageFragment){

    }*/





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_detail);
    }
}
