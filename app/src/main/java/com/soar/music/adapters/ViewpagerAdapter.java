package com.soar.music.adapters;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by gaofei on 2016/12/21.
 */
public class ViewpagerAdapter extends PagerAdapter{

    private List<TextView> viewList;

    public ViewpagerAdapter(List<TextView> viewList) {
        this.viewList = viewList;
    }

    @Override
    public int getCount() {
        return viewList.size();
    }

    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        return arg0 == arg1;
    }




    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        try {
            if (viewList.get(position).getParent() == null) {
                container.addView(viewList.get(position));
            } else {
                ((ViewGroup) viewList.get(position).getParent())
                        .removeView(viewList.get(position));
                container.addView(viewList.get(position));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return viewList.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        (container).removeView(viewList.get(position));
    }

}