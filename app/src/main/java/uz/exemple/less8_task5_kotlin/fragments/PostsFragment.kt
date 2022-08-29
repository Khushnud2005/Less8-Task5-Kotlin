package uz.exemple.less8_task5_kotlin.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.exemple.less8_task5_kotlin.R
import uz.exemple.less8_task5_kotlin.adapters.ContactAdapter
import uz.exemple.less8_task5_kotlin.adapters.PostAdapter
import uz.exemple.less8_task5_kotlin.models.ContactModel
import uz.exemple.less8_task5_kotlin.models.PostModel

class PostsFragment :Fragment() {
    lateinit var recyclerView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.post_fragment, container, false)
        initViews(view)
        return view
    }

    fun initViews(view:View){
        recyclerView = view.findViewById(R.id.posts_Rw_List)
        val arrayList: ArrayList<PostModel> = ArrayList()
        for (i in 1..20) {
            arrayList.add(PostModel("Title $i",  R.drawable.trip))
        }
        recyclerView.setLayoutManager(LinearLayoutManager(context))
        recyclerView.setAdapter(PostAdapter(arrayList))
    }
}