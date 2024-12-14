package com.eapro.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class AlertItem(val alert: String, val dateTime: String)

class AlertAdapter(private val alerts: List<AlertItem>) :
    RecyclerView.Adapter<AlertAdapter.AlertViewHolder>() {

    class AlertViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val alertText: TextView = view.findViewById(R.id.alertText)
        val dateTimeText: TextView = view.findViewById(R.id.dateTimeText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlertViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_alert, parent, false)
        return AlertViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlertViewHolder, position: Int) {
        val alert = alerts[position]
        holder.alertText.text = alert.alert
        holder.dateTimeText.text = alert.dateTime
    }

    override fun getItemCount(): Int = alerts.size
}
