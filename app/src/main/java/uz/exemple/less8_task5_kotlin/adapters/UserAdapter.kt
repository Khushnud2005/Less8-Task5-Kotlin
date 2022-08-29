package uz.exemple.less8_task5_kotlin.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.exemple.less8_task5_kotlin.R
import uz.exemple.less8_task5_kotlin.models.UserModel

class UserAdapter(val arrayList: ArrayList<UserModel>): RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.setText("Name: ${arrayList[position].name}, age:  ${arrayList[position].age} years")
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView: TextView
        var linearLayout: LinearLayout

        init {
            linearLayout = itemView.findViewById(R.id.linear_layout)
            textView = itemView.findViewById(R.id.itemTv)
        }
    }
}