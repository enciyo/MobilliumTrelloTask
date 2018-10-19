package t.timer.mobilliumtrellotask

import android.Manifest.permission.*
import android.content.pm.PackageManager
import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.util.Log
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener,SeekBar.OnSeekBarChangeListener {

    companion object {
        val TAG: String = MainActivity.javaClass.simpleName
    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //SeekBar
        sBar.setOnSeekBarChangeListener(this)
        sBar.progress = 40
        sBar.max=60
        ///

        //Spinner
        spinner.onItemSelectedListener = this
        ArrayAdapter.createFromResource(
            this,
            R.array.Spinner_array,
            R.layout.support_simple_spinner_dropdown_item
        ).also { arrayAdapter ->

            arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item)
            spinner.adapter = arrayAdapter
        }
        ///

        //CheckBox
        cBox.setOnClickListener {
            checkBoxControl()
        }
        ///


    }
    //CheckBox
    private fun checkBoxControl() {
        if(cBox.isChecked){
            txvState.text="Checkbox Enable"
        }
        else {
            txvState.text="CheckBox Disable"
        }
    }
    ///

    //Spinner
    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        txvState.text=seekBar?.progress.toString()
    }
    override fun onNothingSelected(parent: AdapterView<*>?) {
        Log.i(TAG, "onNothingSelected")
    }
    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        Log.i("OnItemSelected", position.toString())
        txvState.text=parent?.getItemAtPosition(position).toString()
    }
    ///

    //SeekBar
    override fun onStartTrackingTouch(seekBar: SeekBar?) {
        txvState.text="onStartTrackingTouch"
    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {
        txvState.text="onStopTrackingTouch"
    }
    ///





}
