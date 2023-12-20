package edu.cdu.ua.maksymsavienkov.mobile_activity_introduction_lab_app.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import edu.cdu.ua.maksymsavienkov.mobile_activity_introduction_lab_app.MainActivity
import edu.cdu.ua.maksymsavienkov.mobile_activity_introduction_lab_app.R
import edu.cdu.ua.maksymsavienkov.mobile_activity_introduction_lab_app.databinding.FragmentTabbedBinding
import edu.cdu.ua.maksymsavienkov.mobile_activity_introduction_lab_app.databinding.FragmentWithButtonBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [WithButtonFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WithButtonFragment : Fragment() {
    private var _binding: FragmentWithButtonBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWithButtonBinding.inflate(layoutInflater)

        val textView : TextView = binding.textView
        textView.text = "asdfasdfas";

        val backButton: Button = binding.backButton

        backButton.setOnClickListener {
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
        }

        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}