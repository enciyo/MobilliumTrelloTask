package t.timer.mobilliumtrellotask

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item.view.*

class Adapter(val context: Context,val list:ArrayList<Repo>) : RecyclerView.Adapter<Adapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
            return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var position = list[position]
        holder.setData(position)

    }

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun setData(repo:Repo){
            itemView.textView.text=repo.title
        }
    }

}