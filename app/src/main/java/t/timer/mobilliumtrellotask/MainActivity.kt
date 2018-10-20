package t.timer.mobilliumtrellotask

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    companion object {
        val TAG: String = MainActivity.javaClass.simpleName

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG,"onCreate")


        var adapter:listAdapter =listAdapter(this,Color.colors)

         gridview.adapter=adapter


    }




}
