package t.timer.mobilliumtrellotask

import android.app.AlertDialog
import android.app.Dialog
import android.graphics.Color
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

        ebtnClick.setOnClickListener {
            val snackbar:Snackbar = Snackbar.make(relativeLayout,"onClickListener",Snackbar.LENGTH_SHORT)
            snackbar.show()

            val builder: AlertDialog.Builder = AlertDialog.Builder(this)
            builder.apply {
                title="Hello AlertDialog"
                setMessage("onClick")
                setPositiveButton("Positive"){dialog, which ->
                    ebtnClick.setBackgroundColor(Color.GREEN)
                }
                setNegativeButton("Negative"){dialog, which ->
                    ebtnClick.setBackgroundColor(Color.RED)
                }
                setNeutralButton("Cancel"){dialog, which ->
                    ebtnClick.setBackgroundColor(Color.WHITE)
                }
            }
            val dialog:Dialog = builder.create()
            dialog.show()
        }




    }


}
