package com.example.nycschoolcodechallenge

import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class SATResultModelAdapter (private val resultsList: MutableList<SATResultModel>): RecyclerView.Adapter<SATResultModelAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val textViewSchoolName: TextView = itemView.findViewById(R.id.school_name)
        val textViewAvgReading: TextView = itemView.findViewById(R.id.text_avg_reading_score)
        val textViewAvgMath: TextView = itemView.findViewById(R.id.text_avg_math_score)
        val textViewAvgWriting: TextView = itemView.findViewById(R.id.text_avg_writing_score)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_design,
                                                                parent, false)

        val cardView = view.findViewById<CardView>(R.id.base_cardview)
        val hiddenView = view.findViewById<LinearLayout>(R.id.hidden_view)
        val dropDownButton = view.findViewById<ImageButton>(R.id.arrow_down_button)

        dropDownButton.setOnClickListener(View.OnClickListener {
            if(hiddenView.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cardView)
                hiddenView.visibility = View.GONE
                dropDownButton.setImageResource(R.drawable.ic_baseline_arrow_drop_down_24)
            } else if(hiddenView.visibility == View.GONE){
                TransitionManager.beginDelayedTransition(cardView)
                hiddenView.visibility = View.VISIBLE
                dropDownButton.setImageResource(R.drawable.ic_baseline_arrow_drop_up_24)
            }
        })
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemsHolder = resultsList[position]
        holder.textViewSchoolName.text = itemsHolder.schoolName
        holder.textViewAvgMath.text = itemsHolder.mathAvgScore.toString()
        holder.textViewAvgReading.text = itemsHolder.readingAvgScore.toString()
        holder.textViewAvgWriting.text = itemsHolder.writingAvgScore.toString()
    }

    override fun getItemCount(): Int {
        return resultsList.size
    }
}
