package t.timer.mobilliumtrellotask

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar.title = "Simple Toolbar"
        toolbar.setTitleTextColor(Color.WHITE)
        setSupportActionBar(toolbar)
        NavigationUI.setupActionBarWithNavController(this,NavHostFragment.findNavController(myHostFragment))

    }

    override fun onSupportNavigateUp(): Boolean {
       return findNavController(R.id.myHostFragment).navigateUp()
    }




}
