package t.timer.mobilliumtrellotask

import android.content.Context
import android.content.res.Resources
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_list.view.*


class RecyclerAdapter(val context: Context,var arrayList: ArrayList<Model>) : RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_list,parent,false)
        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val mPosition = arrayList[position]
        holder.setData(mPosition)

    }


    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

        fun setData(model: Model){
            itemView.imageView.setImageResource(arrayList[position].ımages)
        }
    }
}
