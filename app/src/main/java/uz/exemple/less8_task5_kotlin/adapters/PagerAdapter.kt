package uz.exemple.less8_task5_kotlin.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.exemple.less8_task5_kotlin.fragments.ContactsFragment
import uz.exemple.less8_task5_kotlin.fragments.PostsFragment
import uz.exemple.less8_task5_kotlin.fragments.UsersFragment

class PagerAdapter (fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->{ContactsFragment()}
            1->{
                UsersFragment()
            }
            2->{
                PostsFragment()
            }
            else->{ContactsFragment()}
        }
    }
}