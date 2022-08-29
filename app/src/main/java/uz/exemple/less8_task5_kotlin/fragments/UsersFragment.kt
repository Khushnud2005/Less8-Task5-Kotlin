package uz.exemple.less8_task5_kotlin.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.exemple.less8_task5_kotlin.R
import uz.exemple.less8_task5_kotlin.adapters.PostAdapter
import uz.exemple.less8_task5_kotlin.adapters.UserAdapter
import uz.exemple.less8_task5_kotlin.models.PostModel
import uz.exemple.less8_task5_kotlin.models.UserModel

class UsersFragment:Fragment() {

    lateinit var recyclerView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.user_fragment, container, false)
        initViews(view)
        return view
    }

    fun initViews(view:View){
        recyclerView = view.findViewById(R.id.users_Rw_List)
        val arrayList: ArrayList<UserModel> = ArrayList<UserModel>()
        for (i in 1..20) {
            arrayList.add(UserModel("User $i",  i+18))
        }
        recyclerView.setLayoutManager(LinearLayoutManager(context))
        recyclerView.setAdapter(UserAdapter(arrayList))
    }
}