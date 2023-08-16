package com.mo.tameem.gmail.batabit.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewpager.widget.PagerAdapter;

import com.mo.tameem.gmail.batabit.R;
import com.mo.tameem.gmail.batabit.pojo.Slide;

import java.util.List;

public class SlidePagerAdapter extends PagerAdapter {

    Context mContext;
    List<Slide> mList;


    public SlidePagerAdapter(Context mContext, List<Slide> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {


        LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View slideInflater = layoutInflater.inflate(R.layout.slider_item , null, false);

        AppCompatImageView imageView = slideInflater.findViewById(R.id.img_slider);

        TextView title = slideInflater.findViewById(R.id.textTitle);

        imageView.setImageResource(mList.get(position).getDrawable());
        title.setText(mList.get(position).getTitle());

        container.addView(slideInflater);

        return slideInflater;

    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
