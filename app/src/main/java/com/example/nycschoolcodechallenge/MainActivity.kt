package com.example.nycschoolcodechallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Spinner
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {
    lateinit var mySpinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun sortListByNameAscending(unsortedList: MutableList<SATResultModel>): MutableList<SATResultModel>{
        val result = unsortedList
        result.sortBy { it.schoolName }
        return result
    }

    fun sortListByNameDescending(unsortedList: MutableList<SATResultModel>): MutableList<SATResultModel>{
        val result = unsortedList
        result.sortByDescending { it.schoolName }
        return result
    }



    override fun onResume() {
        super.onResume()
//        mySpinner = findViewById(R.id.sort_spinner)
//        ArrayAdapter.createFromResource(this, R.array.sort_options,
//            androidx.appcompat.R.layout.support_simple_spinner_dropdown_item).also {
//                adapter ->
//            adapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item)
//        }


        val recyclerView = findViewById<RecyclerView>(R.id.schools_list)
        recyclerView.layoutManager = LinearLayoutManager(this)


        val satResultString: List<String> = resources.openRawResource(R.raw.sat_results_2012)
                                                        .bufferedReader().use {it.readLines()}

        val satResultList: MutableList<SATResultModel> = mutableListOf()

        satResultString.forEach{
            val focus: List<String> = it.split(',')
            val resultModel: SATResultModel

            try {
                resultModel = SATResultModel(
                    focus[0], focus[1], focus[2].toInt(),
                    focus[3].toInt(), focus[4].toInt(),
                    focus[5].toInt()
                )
                satResultList.add(resultModel)
                Log.v("On resume test: satResultString ", resultModel.schoolName)
            } catch (e :NumberFormatException) {
                Log.v("Error On Resume test" , e.message.toString())
            }

        }
        Log.v("On Resume test: List of Objects creation" , satResultList[satResultList.size-1].schoolName)

        val adapter = SATResultModelAdapter(satResultList)
        recyclerView.adapter = adapter
    }
}