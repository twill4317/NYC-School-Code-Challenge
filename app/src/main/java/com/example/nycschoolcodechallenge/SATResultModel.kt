package com.example.nycschoolcodechallenge

/* Data model item numbers
* [0] = dbn     [1] = school name   [2] = num of test takers
* [3] = avg reading score   [4] = ... avg math score
* [5] = avg writing score */
data class SATResultModel (val dbn: String, val schoolName: String, val satTakers: Int,
                            val mathAvgScore: Int, val readingAvgScore: Int, val writingAvgScore: Int)
