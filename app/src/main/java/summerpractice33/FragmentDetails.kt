package ru.itis.summerpractice24

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentDetails : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.fragment_details, container, false)
        val textView = view.findViewById<TextView>(R.id.textViewDetails)
        val text = arguments?.getString("text")
        textView.text = text

        return view
    }
}
