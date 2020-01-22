package `in`.srntech90.demo.utility

import java.util.*

/**
Created by Tanuj.Sareen on 22,January,2020
 **/
object Utils {

    fun getYears(checkYear: String): String {

        var year = checkYear
        if (year.contains("–")) {
            year = checkYear.split("–")[0]
        }
        val currentYear: Int = Calendar.getInstance().get(Calendar.YEAR)

        return run {

            val totalYears = currentYear - year.toInt()

            when {
                totalYears > 1 -> "$totalYears  years ago"
                totalYears == 1 -> "$totalYears  year ago"
                else -> "This year"
            }
        }
    }
}