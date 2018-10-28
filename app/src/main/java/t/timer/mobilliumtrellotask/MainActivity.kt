package t.timer.mobilliumtrellotask

import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity() {



    companion object {
        val TAG: String = "myLog"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar.title="Simple Toolbar"
        toolbar.setTitleTextColor(Color.WHITE)
        setSupportActionBar(toolbar)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_item,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item!!.itemId) {
            R.id.appbar_add -> Snackbar.make(relativeLayout,"Add on Click",Snackbar.LENGTH_SHORT).show()
            R.id.appbar_play -> Snackbar.make(relativeLayout,"Play on Click",Snackbar.LENGTH_SHORT).show()
            R.id.appbar_share-> Snackbar.make(relativeLayout,"Share on Click",Snackbar.LENGTH_SHORT).show()
        }
        return true
    }


}
