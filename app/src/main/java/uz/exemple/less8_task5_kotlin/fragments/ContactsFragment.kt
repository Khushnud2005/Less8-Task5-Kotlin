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
import uz.exemple.less8_task5_kotlin.models.ContactModel

class ContactsFragment :Fragment() {
    lateinit var recyclerView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.contact_fragment, container, false)
        initViews(view)
        return view
    }

    fun initViews(view:View){
        recyclerView = view.findViewById(R.id.contacts_Rw_List)
        val arrayList: ArrayList<ContactModel> = ArrayList<ContactModel>()
        for (i in 1..20) {
            arrayList.add(ContactModel("Contact $i",  "123456789"))
        }
        recyclerView.setLayoutManager(LinearLayoutManager(context))
        recyclerView.setAdapter(ContactAdapter(arrayList))
    }
}