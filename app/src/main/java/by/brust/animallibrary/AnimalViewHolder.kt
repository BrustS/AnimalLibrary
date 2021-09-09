package by.brust.animallibrary

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnimalViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var name: TextView? = null
    var age: TextView? = null
    var breed: TextView? = null

    init {
        name = view.findViewById(R.id.nameTextView)
        age = view.findViewById(R.id.ageTextView)
        breed = view.findViewById(R.id.breedTextView)
    }

    fun bind( item: Animal) {
        name?.text = item.name
        age?.text = item.age.toString()
        breed?.text  =item.breed
    }

}