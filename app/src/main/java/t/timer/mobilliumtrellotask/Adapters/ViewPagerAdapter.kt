package t.timer.mobilliumtrellotask.Adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager){

    var mFragmentList:ArrayList<Fragment>? = ArrayList()
    var mFragmentTitle : ArrayList<String>? = ArrayList()

    fun addFragments(fragment:Fragment,fragmentTitle:String){
        mFragmentList!!.add(fragment)
        mFragmentTitle!!.add(fragmentTitle)
    }


    override fun getPageTitle(position: Int): CharSequence? {
        return mFragmentTitle!![position]
    }

    override fun getItem(position: Int): Fragment {
        return mFragmentList!![position]
    }

    override fun getCount(): Int {
        return  mFragmentList!!.size
    }

}