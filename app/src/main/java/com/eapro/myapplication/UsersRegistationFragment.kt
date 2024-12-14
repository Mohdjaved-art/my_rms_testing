package com.eapro.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eapro.myapplication.databinding.FragmentUsersRegistationBinding

class UsersRegistationFragment : Fragment() {

    private var _binding: FragmentUsersRegistationBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_users_registation, container, false)
        // we ahve to made one screnerio
        // that will be  fitted here
    }

}