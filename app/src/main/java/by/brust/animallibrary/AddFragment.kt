package by.brust.animallibrary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class AddFragment : Fragment() {

    private lateinit var fragmentNavigate : FragmentNavi
    private var add_button: Button? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentNavigate = context as FragmentNavi
        add_button = view?.findViewById(R.id.addAnimal_btn)
        return inflater.inflate(R.layout.add_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        add_button?.setOnClickListener{
            fragmentNavigate.naviToMainFragment()
        }
    }
}