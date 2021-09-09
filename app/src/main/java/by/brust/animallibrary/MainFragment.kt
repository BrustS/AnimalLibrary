package by.brust.animallibrary

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainFragment : Fragment() {

    private var recycler: RecyclerView? = null
    private lateinit var fragmentNavigate : FragmentNavi
    private var fab : FloatingActionButton? = null

    val animals = listOf(
        Animal(1,"Graf",1,"Dvor"),
        Animal(2,"Guffi",4,"Dvor"),
        Animal(3,"Puppy",3,"Dvor"),
        Animal(4,"Bax",7,"Dvor"),
        Animal(5,"Pirate",8,"Dvor"),
        Animal(3,"Loki",10,"Dvor"),
        Animal(4,"Foxxy",2,"Dvor"),
        Animal(5,"Pse",11,"Dvor")
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentNavigate = context as FragmentNavi
        fab = view?.findViewById(R.id.FAB_add)
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycler = view.findViewById(R.id.recycler)
        recycler?.layoutManager = LinearLayoutManager(activity)
        recycler?.adapter = AnimalAdapter(animals)

        fab?.setOnClickListener {
           Log.d("FAB","Clicked!!!")
            fragmentNavigate.naviToAddFragment()
        }

    }

}