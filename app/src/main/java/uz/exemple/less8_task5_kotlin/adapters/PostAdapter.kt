package uz.exemple.less8_task5_kotlin.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.exemple.less8_task5_kotlin.R
import uz.exemple.less8_task5_kotlin.models.PostModel

class PostAdapter(val arrayList: ArrayList<PostModel>):RecyclerView.Adapter<PostAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.setText(arrayList[position].title)
        holder.image_view!!.setImageResource(arrayList[position].image)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView: TextView
        var image_view:ImageView? = null
        var linearLayout: LinearLayout

        init {
            linearLayout = itemView.findViewById(R.id.linear_layout)
            textView = itemView.findViewById(R.id.itemTv)
            image_view = itemView.findViewById(R.id.image_view)
        }
    }
}