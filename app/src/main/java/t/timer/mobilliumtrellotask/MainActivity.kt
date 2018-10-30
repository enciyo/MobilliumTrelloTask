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
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val fragment = shareFragment()
        val fragment2 = playFragment()

        when(item!!.itemId) {
            R.id.appbar_play -> {
                fragmentTransaction.replace(R.id.frameLayout, fragment2)
                fragmentTransaction.commit()
            }
            R.id.appbar_share -> {
                Snackbar.make(relativeLayout, "Play on Share", Snackbar.LENGTH_SHORT).show()
                fragmentTransaction.replace(R.id.frameLayout, fragment)
                fragmentTransaction.commit()
            }
        }
        return true
    }


}
