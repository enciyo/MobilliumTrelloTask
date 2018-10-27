package t.timer.mobilliumtrellotask

import android.app.ProgressDialog
import android.content.Context
import android.os.AsyncTask
import android.support.design.widget.Snackbar
import android.text.Editable
import android.view.View
import android.widget.EditText

class asynTask(val time: Editable, var editText: EditText, val context: Context, val view: View) : AsyncTask<String,String,String>() {

    var progressDialog:ProgressDialog? = null

    override fun doInBackground(vararg params: String?): String {

        val timer:Int=Integer.parseInt(params[0]) * 1000
        Thread.sleep(timer.toLong())
        return "Good Jop"
    }

    override fun onPreExecute() {

        progressDialog = ProgressDialog.show(context,"Progress Dialog", "\n Wait for: " + time.toString())
    }

    override fun onPostExecute(result: String?) {
        progressDialog!!.dismiss()
        editText.setText(result.toString())

    }

    override fun onProgressUpdate(vararg values: String?) {
        val snackbar:Snackbar = Snackbar.make(view,time.toString(),Snackbar.LENGTH_SHORT)
        snackbar.show()
    }

}