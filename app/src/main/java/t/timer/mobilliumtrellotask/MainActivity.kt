package t.timer.mobilliumtrellotask

import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.util.Log
import android.view.ViewOutlineProvider
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.coroutines.experimental.CoroutineContext
import kotlin.coroutines.experimental.coroutineContext

class MainActivity : AppCompatActivity() {


    companion object {
        val TAG: String = "myLog"
    }


    @SuppressLint("ResourceType")
    @TargetApi(Build.VERSION_CODES.M)
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate")

        layoutEditText.setOnFocusChangeListener { v, hasFocus ->
            if (!hasFocus) {
                if (layoutEditText.text.toString() != "e-mail") {
                    layoutEditText.error = "e-mail wrong"
                    textInputLayout.setErrorTextAppearance(R.style.error_appearance)
                }
            }
        }

        val array = resources.getStringArray(R.array.autoComplete)
        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,array)
        autoCompleteTextView3.setAdapter(arrayAdapter)

    }


}
