package com.example.nycschoolcodechallenge
/* HS Directory Model Item numbers
* [0] = dbn     [1] = schoolname    [2] = boro  [3] = overview paragraph    [4] = school10thseat
* [5] - [9] = academicopportunities1 - academicopportunities5   [11] = language classes
* [12] = advanced placement courses     [13] = diploma endorsements     [14] = neighborhood
* [18] = location   [19] = phone_number     [20] = fax number   [21] = email    [22] = website
* [27] = total students     [31] = extracurricular_activities   [32] = psal_sports_boy
* [33] = psal sports girl   [34] = psal sports coed     [35] = school sports    [36] = graduation rate
* [37] = attendance rate    [455] = latitude    [456] = longitude */
data class HSDirectoryModel (val dbn: Int, val schoolName: String, val boro: String,
                            val overviewParagraph: String, val schoolTenthSeat: String,
                             val academicOpportunities1: String, val academicOpportunites2: String,
                             val academicOpportunities3: String, val academicOpportunities4: String,
                             val academicOpportunities5: String, val diplomaEndorsements: String,
                            val languageClasses: String, val advancedPlacementClasses: String,
                            val neighborhood: String, val location: String, val phoneNumber: String,
                            val faxNumber: String, val email: String, val website: String, val totalStudents: Int,
                            val extracurricularActivities: String, val psalSportsBoy: String,
                            val psalSportsGirl: String, val psalSportsCoed: String, val schoolSports: String,
                            val graduationRate: Int, val attendanceRate: Int, val latitude: Double, val longitude: Double)
