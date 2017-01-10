package com.allsunny.wechatluckymoney.activity;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;

import com.allsunny.wechatluckymoney.R;
import com.allsunny.wechatluckymoney.fragment.SettingsFragment;

/**
 * Created by allsunny on 2017/1/6.
 * Email:623368886@qq.com
 */

public class SettingsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);

        getFragmentManager().beginTransaction()
                .replace(R.id.preferences_fragment, new SettingsFragment())
                .commit();
    }

    public void performBack(View view) {
        super.onBackPressed();
    }

}
