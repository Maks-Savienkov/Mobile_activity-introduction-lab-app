package edu.cdu.ua.maksymsavienkov.mobile_activity_introduction_lab_app.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import edu.cdu.ua.maksymsavienkov.mobile_activity_introduction_lab_app.MainActivity
import edu.cdu.ua.maksymsavienkov.mobile_activity_introduction_lab_app.R
import edu.cdu.ua.maksymsavienkov.mobile_activity_introduction_lab_app.databinding.FragmentTabbedBinding

/**
 * A placeholder fragment containing a simple view.
 */
class PlaceholderFragment : Fragment() {

    private lateinit var pageViewModel: PageViewModel
    private var _binding: FragmentTabbedBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pageViewModel = ViewModelProvider(this)[PageViewModel::class.java].apply {
            setIndex(arguments?.getInt(ARG_SECTION_NUMBER) ?: 1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentTabbedBinding.inflate(inflater, container, false)
        val root = binding.root

        val textView: TextView = binding.sectionLabel
        pageViewModel.text.observe(viewLifecycleOwner) { text ->
            textView.text = text
        }

//        when (arguments?.getInt(ARG_SECTION_NUMBER)) {
//            1, 2 -> {
//                pageViewModel.text.observe(viewLifecycleOwner, Observer {
//                    textView.text = it
//                })
//            }
//            3 -> {
//                val anotherRoot = FragmentSecondTabBinding.inflate(inflater, container, false).root
//                val btn : Button = anotherRoot.findViewById(R.id.go_back_button)
//                btn.setOnClickListener(){
//                    val intent : Intent = Intent(activity, MainActivity::class.java)
//                    startActivity(intent)
//                }
//            }
//        }

        return root
    }

    companion object {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private const val ARG_SECTION_NUMBER = "section_number"

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        @JvmStatic
        fun newInstance(sectionNumber: Int): PlaceholderFragment {
            return PlaceholderFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}