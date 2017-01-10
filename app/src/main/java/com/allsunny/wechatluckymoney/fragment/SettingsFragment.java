package com.allsunny.wechatluckymoney.fragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.allsunny.wechatluckymoney.R;

/**
 * Created by allsunny on 2017/1/10.
 * Email:623368886@qq.com
 */

public class SettingsFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
