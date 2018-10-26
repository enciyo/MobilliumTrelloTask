package t.timer.mobilliumtrellotask

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.scrolview2.*

class MainActivity : AppCompatActivity() {



    companion object {
        val TAG: String = "myLog"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutManager = LinearLayoutManager(this)
        val layoutManager2 = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayout.VERTICAL
        layoutManager2.orientation = LinearLayout.VERTICAL
        recyclerView.layoutManager = layoutManager
        recyclerView2.layoutManager = layoutManager2
        recyclerView.adapter = RecyclerAdapter(this,Repo.models)
        recyclerView2.adapter = RecyclerAdapter(this,Repo.models)

    }


}
