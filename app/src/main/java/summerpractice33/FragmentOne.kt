package ru.itis.summerpractice24

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar

class FragmentOne : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_one, container, false)
        val editText = view.findViewById<EditText>(R.id.editText)
        val sendButton = view.findViewById<Button>(R.id.sendButton)

        sendButton.setOnClickListener {
            val text = editText.text.toString()
            if (text.isEmpty()) {
                Snackbar.make(view, "Для отправки текста требуется заполнить поле", Snackbar.LENGTH_SHORT).show()
            } else {
                val bundle = Bundle()
                bundle.putString("text", text)
                findNavController().navigate(R.id.action_fragment_one_to_details, bundle)
            }
        }

        return view
    }
}
