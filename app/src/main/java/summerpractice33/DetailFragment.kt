package ru.itis.summerpractice24

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide

class DetailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_details2, container, false)

        val planetId = arguments?.getInt("planetId") ?: 0
        val planetRepository = PlanetRepository()
        val planet = planetRepository.getPlanetById(planetId)

        if (planet != null) {
            val imageView: ImageView = view.findViewById(R.id.imageView)
            val nameTextView: TextView = view.findViewById(R.id.nameTextView)
            val descriptionTextView: TextView = view.findViewById(R.id.descriptionTextView)
            val longDescriptionTextView: TextView = view.findViewById(R.id.longDescriptionTextView)

            Glide.with(this).load(planet.imageUrl).into(imageView)
            nameTextView.text = planet.name
            descriptionTextView.text = planet.description
            longDescriptionTextView.text = planet.longDescription

            val backButton: ImageView = view.findViewById(R.id.backButton)
            backButton.setOnClickListener {
                findNavController().popBackStack() // Возврат на предыдущий фрагмент
            }
        }

        return view
    }
}
