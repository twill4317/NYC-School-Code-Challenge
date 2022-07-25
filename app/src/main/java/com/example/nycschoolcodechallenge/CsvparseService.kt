package com.example.nycschoolcodechallenge



object CsvparseService {

//    private val satResultFile: File = File("src/main/res/raw/sat_results_2012.csv")
//    private val highSchoolDirectoryFile: File = File("src/main/res/raw/doe_high_school_directory_2017.csv")

    private val lines = object {}.javaClass.getResourceAsStream("sat_results_2012.csv")?.bufferedReader()?.readLines().toString()
//    private val satResultInputStream: InputStream = satResultFile.inputStream()
//    private val highSchoolDirectoryInputStream: InputStream = highSchoolDirectoryFile.inputStream()

//    private val satResultInputString = satResultInputStream.bufferedReader().use { it.readText() }
//    private val directoryInputStream = highSchoolDirectoryInputStream.bufferedReader().use { it.readText() }

//    fun printResultString (): String {
//        return satResultInputString
//    }

//    fun printDirectoryString(): String {
//        return directoryInputStream
//    }

    fun printLines(): String {
        return lines
    }
}