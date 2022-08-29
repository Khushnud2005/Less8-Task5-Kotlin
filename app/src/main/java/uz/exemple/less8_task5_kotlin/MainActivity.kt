package uz.exemple.less8_task5_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import uz.exemple.less8_task5_kotlin.adapters.PagerAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    fun initViews(){
        viewPager = findViewById<ViewPager2>(R.id.view_pager)
        tabLayout = findViewById(R.id.tab_layout)

        viewPager.adapter = PagerAdapter(this)

        TabLayoutMediator(tabLayout,viewPager){tab,index ->
            tab.text = when(index){
                0->{"Contacts"}
                1->{"Users"}
                2->{"Posts"}
                else -> {"Contacts"}
            }

        }.attach()
    }
}