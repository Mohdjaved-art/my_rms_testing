package com.eapro.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup



import androidx.recyclerview.widget.LinearLayoutManager
import com.eapro.myapplication.databinding.FragmentAlertBinding

//data class AlertItems(val alert: String, val dateTime: String)

class AlertFragment : Fragment() {

    private var _binding: FragmentAlertBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAlertBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Sample data for the alerts
        val alertList = listOf(
            AlertItem("Battery Low", "2024-12-07 14:32"),
            AlertItem("Inverter Overload", "2024-12-07 14:45"),
            AlertItem("System Maintenance", "2024-12-07 15:12"),
            AlertItem("Connection Lost", "2024-12-07 15:30"),
            AlertItem("Battery Low", "2024-12-07 14:32"),
            AlertItem("Inverter Overload", "2024-12-07 14:45"),
            AlertItem("System Maintenance", "2024-12-07 15:12"),
            AlertItem("Connection Lost", "2024-12-07 15:30"),
            AlertItem("Battery Low", "2024-12-07 14:32"),
            AlertItem("Inverter Overload", "2024-12-07 14:45"),
            AlertItem("System Maintenance", "2024-12-07 15:12"),
            AlertItem("Connection Lost", "2024-12-07 15:30"),
            AlertItem("Battery Low", "2024-12-07 14:32"),
            AlertItem("Inverter Overload", "2024-12-07 14:45"),
            AlertItem("System Maintenance", "2024-12-07 15:12"),
            AlertItem("Connection Lost", "2024-12-07 15:30")
        )

        // Initialize the RecyclerView with adapter and layout manager
        val adapter = AlertAdapter(alertList)
        binding.recyclerViewAlerts.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerViewAlerts.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
