package t.timer.mobilliumtrellotask

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val PREFS_FILE = ".com.sharedpreferences"
    val KEY_NAME = "NAME"
    val KEY_AGE = "AGE"
    val KEY_JOB = "JOB"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val preferences = getSharedPreferences(PREFS_FILE, Context.MODE_PRIVATE)
        val editor = preferences.edit()

        btnCommit.setOnClickListener {
            editor.putString(KEY_NAME, edtName.text.toString())
            editor.putString(KEY_AGE, edtAge.text.toString())
            editor.putString(KEY_JOB, edtJob.text.toString())
            editor.apply()
        }

        txvResult.text = preferences.getString(KEY_NAME, "Don't save name")+ "\n" +
                preferences.getString(KEY_AGE, "Don't save age")+ "\n" +
                preferences.getString(KEY_JOB,"Don't save job")


    }


}
