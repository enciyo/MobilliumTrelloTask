package t.timer.mobilliumtrellotask

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_share.*

class shareFragment() : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_share,container,false)
        return view!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        comeBackTo.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.goBack))
        nextScreen.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.anotherFragment))
        Snackbar.make(view,"Fragment Share",Snackbar.LENGTH_SHORT).show()
    }
}