package edu.cdu.ua.maksymsavienkov.mobile_activity_introduction_lab_app.ui.newFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import edu.cdu.ua.maksymsavienkov.mobile_activity_introduction_lab_app.databinding.NewFragmentBinding

class NewFragment: Fragment() {
    private var _binding: NewFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val vm =
            ViewModelProvider(this)[NewFragmentViewModel::class.java]

        _binding = NewFragmentBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}