package step.tour.project.introslide;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by felipesepulveda on 12/10/2017.
 */

public class MpagerAdapter extends PagerAdapter {

    /**
     * Fields
     */
    private int[] layouts;
    private LayoutInflater layoutInflater;
    private Context context;

    /**
     * Constructor
     * @param layouts
     * @param context
     */
    public MpagerAdapter(int[] layouts,Context context){
        this.layouts = layouts;
        this.context = context;
        layoutInflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    /**
     *
     * @return layouts.length
     */
    @Override
    public int getCount() {

        return layouts.length;
    }

    /**
     *
     * @param view
     * @param object
     * @return view==object
     */
    @Override
    public boolean isViewFromObject(View view, Object object) {

        return view == object;
    }

    /**
     *
     * @param container
     * @param position
     * @return view
     */
    @Override
    public Object instantiateItem(ViewGroup container, int position)
    {
    View view = layoutInflater.inflate(layouts[position], container, false);
        container.addView(view);
        return view;
    }

    /**
     *
     * @param container
     * @param position
     * @param object
     */
    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        View view = (View)object;
        container.removeView(view);
    }
}