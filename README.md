# TabLayout
## 说明
类原生TabLayout，在此基础上增加了一些常用的属性设置，原生TabLayout属性基本通用
## 效果图
![效果图](https://github.com/shouzhong/TabLayout/blob/master/img/1.jpg)
## 依赖
```
implementation 'com.shouzhong:TabLayout:1.0.2'
```

## 属性说明

属性 | 说明
------------ | -------------
tabNeedSwitchAnimation | indicator是否有动画
tabIndicatorMode | indicator模式：normal看tabIndicatorWidth，text看tabIndicatorWidthExtra，fixed为指示器宽度等于tab宽度
tabIndicatorWidthExtra | tabIndicatorMode为text时，指示线相对于文字宽度，负值表示文字宽度减去
tabIndicatorWidth | tabIndicatorMode为normal时，指示线宽度
tabTextSize | 文字大小

## 自定义tab
首先实现适配器
```
public class TabAdapter implements ITabAdapter {

    private String[] titles = {"标题1", "标题2", "标题3", "标题4", "标题5"};

    @Override
    public int getCount() {
        return titles.length;
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
```
然后设置适配器
```
tabLayout.setAdapter(new TabAdapter());
```
可以与setupWithViewPager兼容使用

