package t.timer.mobilliumtrellotask

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    companion object {
        val TAG: String = "myLog"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowSnackbar.setOnClickListener {
            var snackbar:Snackbar = Snackbar.make(coordinatorLayout,"OnClicked",Snackbar.LENGTH_SHORT)
            snackbar.show()
        }

    }


}
