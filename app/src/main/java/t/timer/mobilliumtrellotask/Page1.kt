package t.timer.mobilliumtrellotask

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class Page1 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = LayoutInflater.from(context).inflate(R.layout.fragment_page1,container,false)
        return view
    }
}