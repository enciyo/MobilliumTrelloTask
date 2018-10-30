package t.timer.mobilliumtrellotask

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NavigationUI.setupActionBarWithNavController(
            this,
            NavHostFragment.findNavController(myHostFragment)
        )//set appbar

    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.myHostFragment).navigateUp()
    }


}
