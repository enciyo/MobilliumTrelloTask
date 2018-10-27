package t.timer.mobilliumtrellotask

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    companion object {
        val TAG: String = "myLog"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            val runner: asynTask = asynTask(textView.text,textView,this,relativeLayout)
            runner.execute(textView.text.toString())
        }

    }


}
