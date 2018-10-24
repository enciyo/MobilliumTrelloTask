package t.timer.mobilliumtrellotask

import android.os.Bundle
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    companion object {
        val TAG: String = "myLog"
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate")
        setSupportActionBar(toolbar)
        val actionBar: ActionBar? = supportActionBar
        actionBar?.apply {
            setHomeAsUpIndicator(android.R.drawable.ic_menu_sort_by_size)
            setDisplayHomeAsUpEnabled(true)
        }

        drawerLayout.addDrawerListener(
            object : DrawerLayout.DrawerListener {
                override fun onDrawerStateChanged(newState: Int) {
                    Log.i(TAG, "onDrawerStateChanged")
                }

                override fun onDrawerSlide(drawerView: View, slideOffset: Float) {
                    Log.i(TAG, "onDrawerSlide")
                }

                override fun onDrawerClosed(drawerView: View) {
                    Log.i(TAG, "onDrawerClosed")
                }

                override fun onDrawerOpened(drawerView: View) {
                    Log.i(TAG, "onDrawerOpened")
                }

            }
        )


        navigationView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_Home ->Toast.makeText(this,"Nav_Home",Toast.LENGTH_SHORT).show()
                R.id.nav_About -> Toast.makeText(this,"Nav_About",Toast.LENGTH_SHORT).show()
                R.id.nav_Profile -> Toast.makeText(this,"Nav_Profile",Toast.LENGTH_SHORT).show()
            }

            drawerLayout.closeDrawers()

            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when (item!!.itemId) {
            android.R.id.home -> {
                drawerLayout.openDrawer(GravityCompat.START)
                true
            }
            else ->
                return super.onOptionsItemSelected(item)
        }
    }
}
