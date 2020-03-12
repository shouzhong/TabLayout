package com.shouzhong.tablayout;

import android.view.LayoutInflater;
import android.view.View;

public interface ITabAdapter {

    int getCount();

    View onCreateView(LayoutInflater inflater);

    void onBindView(View v, int position, boolean isSelected);
}
