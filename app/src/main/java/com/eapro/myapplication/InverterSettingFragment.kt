package com.eapro.myapplication
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eapro.myapplication.databinding.FragmentInverterSettingBinding


class InverterSettingFragment : Fragment() {

    private var _binding: FragmentInverterSettingBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInverterSettingBinding.inflate(inflater, container, false)
        return binding.root
    }


}





