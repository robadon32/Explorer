package com.example.robad.explorer;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link CategoryFragmentAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Place} objects.
 */
public class CategoryFragmentAdapter extends FragmentPagerAdapter {
    /** Context of the app */
    private Context mContext;

    /**
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    CategoryFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new LandmarkFragment();
        }
        else if(position == 1){
            return new FunFragment();
        }
        else if(position == 2){
            return new RestaurantFragment();
        }
        else {
            return new HotelFragment();
        }
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
       if (position == 0){
           return mContext.getString(R.string.tab_title_1);
       }
       else if (position == 1){
           return mContext.getString(R.string.tab_title_2);
       }
       else if (position == 2){
           return mContext.getString(R.string.tab_title_3);
       }
       else {
           return mContext.getString(R.string.tab_title_4);
       }
    }
    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }
}
