package by.brust.animallibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), FragmentNavi {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        naviToMainFragment()
    }

    override fun naviToAddFragment() {
        val fragment = AddFragment()
        val fm = supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commit()
    }

    override fun naviToSortFragment() {
        TODO("Not yet implemented")
    }

//    override fun NaviToSortFragment() {
//        val fragment = SortFragment()
//        val fm = supportFragmentManager.beginTransaction()
//            .replace(R.id.container, fragment)
//            .commit()
//    }

    override fun naviToMainFragment() {
       val fragment = MainFragment()
        val fm = supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commit()
    }
}