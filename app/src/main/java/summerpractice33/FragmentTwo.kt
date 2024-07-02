package ru.itis.summerpractice24

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FragmentTwo : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_two, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        val planetRepository = PlanetRepository()
        val planets = planetRepository.planets

        val adapter = PlanetAdapter(planets) { planetId ->
            findNavController().navigate(R.id.action_fragment_two_to_details, Bundle().apply {
                putInt("planetId", planetId)
            })
        }
        recyclerView.adapter = adapter
        return view
    }
}
