package t.timer.mobilliumtrellotask

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item.view.*

class Adapter(val context: Context,val list : ArrayList<Repo>): RecyclerView.Adapter<Adapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
            return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val repoc =list[position]

        holder.setData(repoc,position)
    }


    inner class MyViewHolder (itemView:View): RecyclerView.ViewHolder(itemView) {

            var repoList:Repo? =null
            var repoPosition:Int = 0


            init {

            }

        fun setData(repo: Repo,position: Int?){
            for (i in list.size downTo  0 step 1) {
                itemView.textView.text="*"+repo.title
            }

        }

    }

}