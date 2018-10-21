package t.timer.mobilliumtrellotask

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.widget.GridLayout
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    companion object {
        val TAG: String = MainActivity.javaClass.simpleName

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate")

        val layoutManager=LinearLayoutManager(this)
        layoutManager.orientation=GridLayout.VERTICAL
        rcyclerView.layoutManager=layoutManager
        val adapter:Adapter = Adapter(this,Repos.repo)
        rcyclerView.adapter=adapter



    }


}
