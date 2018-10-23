package t.timer.mobilliumtrellotask

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.coroutines.experimental.CoroutineContext
import kotlin.coroutines.experimental.coroutineContext

class MainActivity : AppCompatActivity() {

    private var adapter:PagerAdapter? = null

    companion object {
        val TAG: String = MainActivity.Companion.javaClass.simpleName
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate")

        adapter = PagerAdapter(supportFragmentManager)
        adapter!!.addFragments(Page1(),"Page1")
        adapter!!.addFragments(Page2(),"Page2")

        viewPager.adapter=adapter


    }


}
