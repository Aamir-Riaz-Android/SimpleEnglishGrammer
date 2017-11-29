package com.example.sportspc.simpleenglishgrammer.ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.sportspc.simpleenglishgrammer.R;
import com.example.sportspc.simpleenglishgrammer.utilhelpers.Constants;
import com.example.sportspc.simpleenglishgrammer.utilhelpers.InitialiseData;
import com.example.sportspc.simpleenglishgrammer.utilhelpers.ReadFiles;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

/**
 * Created by SportsPc on 11/19/2017.
 */

@EFragment(value = R.layout.fragment_dynamic_page, forceLayoutInjection = true)
public class DynamicPage extends Fragment {
    Context mContext;
    int currentPosition=0;

    @ViewById (R.id.webVDynamicPage)
    WebView wVDynamicPage;



    @AfterViews
   public void initLoadPage(){
        WebSettings settings = wVDynamicPage.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
     //setDefaultZoom(WebSettings.ZoomDensity.MEDIUM);
        settings.setUseWideViewPort(true);
      settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptEnabled(true);
    // wVDynamicPage.loadUrl("file:///android_asset/" + "grammer/Adjectives/Adjectives.html");
        Bundle extras=this.getArguments();
        currentPosition=extras.getInt(Constants.KEY_PAGE_POS);


       wVDynamicPage.loadDataWithBaseURL("file:///android_asset/" + Constants.CAT_MAIN_PAGE, ReadFiles.readFile(mContext, Constants.CAT_MAIN_PAGE+"/"+ InitialiseData.data.get(currentPosition).toString()), "text/html", "utf-8", null);
    }


    @Override
    public void onResume() {
        super.onResume();
     //   initLoadPage();
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext=context;
    }
    public static DynamicPage newInstance(int num) {
        DynamicPage f = new DynamicPage_();

        // Supply num input as an argument.
       Bundle args = new Bundle();
        args.putInt(Constants.KEY_PAGE_POS, num);
        f.setArguments(args);

        return f;
    }
}
