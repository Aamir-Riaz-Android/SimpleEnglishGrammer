package com.example.sportspc.simpleenglishgrammer.utilhelpers;

import android.content.Context;
import android.util.Log;

import java.io.InputStream;
import java.util.List;

/**
 * Created by SportsPc on 11/18/2017.
 */

public class ReadFiles {


    public static String readFile(Context mContext,String filename) {
        String file_data = "";
        String str = "";
        String cur_folder = filename;
        try {
            if (cur_folder.contains("//")) {
                cur_folder = cur_folder.replace("//", "/");
            }
            InputStream is = mContext.getAssets().open(cur_folder);
            byte[] buffer = new byte[is.available()];
            is.read(buffer);
           file_data = new String(buffer);
            str = file_data.toString();
            is.close();
            return str;
        } catch (Exception e) {
            Log.i("amirrrrrrrrrrrrrrrrr",e.toString());
            System.out.println(e.getMessage());
            return str;
        }
    }

}
