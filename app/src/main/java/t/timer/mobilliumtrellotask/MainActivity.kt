package t.timer.mobilliumtrellotask

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import t.timer.mobilliumtrellotask.Adapters.ViewPagerAdapter
import t.timer.mobilliumtrellotask.Fragments.AboutFragment
import t.timer.mobilliumtrellotask.Fragments.HomeFragment
import t.timer.mobilliumtrellotask.Fragments.ProfileFragment

class MainActivity : AppCompatActivity() {


    companion object {
        val TAG: String = "myLog"

    }
    var pagerAdapter: ViewPagerAdapter? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate")

        pagerAdapter = ViewPagerAdapter(supportFragmentManager)
        pagerAdapter!!.addFragments(HomeFragment(),"Home")
        pagerAdapter!!.addFragments(ProfileFragment(),"Profile")
        pagerAdapter!!.addFragments(AboutFragment(),"About")

        viewPager.adapter=pagerAdapter
        tabLayout.setupWithViewPager(viewPager)


    }
}
