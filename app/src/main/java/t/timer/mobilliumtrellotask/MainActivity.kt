package t.timer.mobilliumtrellotask

import android.graphics.Color
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import t.timer.mobilliumtrellotask.Adapters.ViewPagerAdapter
import t.timer.mobilliumtrellotask.Fragments.AboutFragment
import t.timer.mobilliumtrellotask.Fragments.HomeFragment
import t.timer.mobilliumtrellotask.Fragments.ProfileFragment

class MainActivity : AppCompatActivity(), ViewPager.OnPageChangeListener {

    override fun onPageScrollStateChanged(state: Int) {
        Log.i(TAG, "onPageScrollStateChanged")
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        Log.i(TAG, "onPageScrolled")
    }

    override fun onPageSelected(position: Int) {
        fab.setOnClickListener {
            Toast.makeText(this,pagerAdapter!!.getPageTitle(position).toString(),Toast.LENGTH_SHORT).show()
        }

        when (position) {
            0 -> viewPager.setBackgroundColor(Color.WHITE)
            1 -> viewPager.setBackgroundColor(Color.MAGENTA)
            2 -> viewPager.setBackgroundColor(Color.GRAY)
        }
    }

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
        viewPager.addOnPageChangeListener(this)
        tabLayout.setupWithViewPager(viewPager)


    }
}
