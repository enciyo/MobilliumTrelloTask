package t.timer.mobilliumtrellotask

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.widget.FrameLayout


class PagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    var mFragmentItems:ArrayList<Fragment> = ArrayList()
    var mFragmentTitles: ArrayList<String> = ArrayList()

    fun addFragments(fragmentItem:Fragment,fragmentTitles: String){
        mFragmentItems.add(fragmentItem)
        mFragmentTitles.add(fragmentTitles)
    }

    override fun getItem(position: Int): Fragment {
       return mFragmentItems[position]
    }

    override fun getCount(): Int {
        return mFragmentItems.size
    }

}