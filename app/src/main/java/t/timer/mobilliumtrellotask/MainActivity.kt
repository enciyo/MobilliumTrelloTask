package t.timer.mobilliumtrellotask

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar.title = "Simple Toolbar"
        toolbar.setTitleTextColor(Color.WHITE)
        setSupportActionBar(toolbar)

    }

    override fun onSupportNavigateUp(): Boolean {
       return findNavController(R.id.myHostFragment).navigateUp()
    }




}
