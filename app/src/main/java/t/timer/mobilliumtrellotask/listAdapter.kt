package t.timer.mobilliumtrellotask

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class listAdapter(var context: Context, private val list: List<Model>): BaseAdapter() {

    var colorList: List<Model>? = null
    var inflator: LayoutInflater? = null

    init {
        colorList=list
        inflator= LayoutInflater.from(context)
    }

    override fun getItem(position: Int): Model {
            return  list?.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
       return list!!.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View?= null
        view = inflator?.inflate(R.layout.list_item,parent,false)
        var text:TextView =view!!.findViewById(R.id.txvList)

        text.text=list.get(position).color.toString()
        return view!!
    }

}