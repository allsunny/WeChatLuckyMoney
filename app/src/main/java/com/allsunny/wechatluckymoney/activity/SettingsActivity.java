package com.allsunny.wechatluckymoney.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.allsunny.wechatluckymoney.R;

/**
 * Created by allsunny on 2017/1/6.
 * Email:623368886@qq.com
 */

public class SettingsActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);

    }

    public void performBack(View view) {
        super.onBackPressed();
    }

}
