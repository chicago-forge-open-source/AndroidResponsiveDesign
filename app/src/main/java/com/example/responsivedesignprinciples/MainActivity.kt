package com.example.responsivedesignprinciples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.responsivedesignprinciples.ui.main.CenteredFragment
import com.example.responsivedesignprinciples.ui.main.MainFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import kotlinx.android.synthetic.main.main_activity.*
import androidx.fragment.app.Fragment
import com.example.responsivedesignprinciples.ui.main.LeftAlignedFragment
import com.example.responsivedesignprinciples.ui.main.MultiConstraintFragment


class MainActivity : AppCompatActivity(), OnTabSelectedListener {
    private val fragmentOne = MainFragment.newInstance()
    private val fragmentTwo = CenteredFragment.newInstance()
    private val fragmentThree = LeftAlignedFragment.newInstance()
    private val fragmentFour = MultiConstraintFragment.newInstance()

    override fun onTabReselected(p0: TabLayout.Tab?) {
        println("p0 = $p0")
    }

    override fun onTabUnselected(p0: TabLayout.Tab?) {
        println("p0 = $p0")
    }

    override fun onTabSelected(p0: TabLayout.Tab?) {
        println("appbar = WE CLICKED ON")
        println("p0 = $p0")
        setCurrentTabFragment(p0!!.position)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.main_activity)
        tabs.addOnTabSelectedListener(this)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MultiConstraintFragment.newInstance())
                    .commitNow()
            tabs.selectTab(tabs.getTabAt(3), true)
        }
    }

    private fun setCurrentTabFragment(tabPosition: Int) {
        when (tabPosition) {
            0 -> replaceFragment(fragmentOne)
            1 -> replaceFragment(fragmentTwo)
            2 -> replaceFragment(fragmentThree)
            3 -> replaceFragment(fragmentFour)
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction().apply {
            replace(R.id.container, fragment)
            addToBackStack(null)
        }
        transaction.commit()
    }


}


