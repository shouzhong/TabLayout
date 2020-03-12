package com.shouzhong.tablayout.demo;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.shouzhong.tablayout.ITabAdapter;

public class TabAdapter implements ITabAdapter {

    private String[] titles = {"标题1", "标题2", "标题3", "标题4", "标题5"};

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public View onCreateView(LayoutInflater inflater) {
        return inflater.inflate(R.layout.tl_tab, null);
    }

    @Override
    public void onBindView(View v, int position, boolean isSelected) {
        TextView tv = v.findViewById(R.id.tv);
        tv.setText(titles[position]);
        tv.setTextColor(isSelected ? 0xffff0000 : 0xff333333);
    }
}
