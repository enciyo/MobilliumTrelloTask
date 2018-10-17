package t.timer.mobilliumtrellotask

import android.Manifest.permission.*
import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG: String = MainActivity.javaClass.simpleName
        val REQUEST_CODE: Int = 101
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNetworkPermission.setOnClickListener {
            ActivityCompat.requestPermissions(this, arrayOf(CAMERA), REQUEST_CODE)
        }

        btnCheckNetwork.setOnClickListener {
            val permission = ContextCompat.checkSelfPermission(this, CAMERA)
            if (permission != PackageManager.PERMISSION_GRANTED) {
                txvStateNetwork.text = "Don't have Permission"
            } else if (permission == PackageManager.PERMISSION_GRANTED) {
                txvStateNetwork.text = "Already has permission"
            }
        }


    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        when (requestCode) {
            REQUEST_CODE -> {

                if (grantResults.isEmpty() || grantResults[0] != PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(this, "Permission has been denied by user", Toast.LENGTH_SHORT).show()
                    Log.i(TAG, "Permission has been denied by user")
                } else {
                    Toast.makeText(this, "Permission has been granted by user", Toast.LENGTH_SHORT).show()
                    Log.i(TAG, "Permission has been granted by user")
                }
            }
        }
    }


}
