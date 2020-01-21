package `in`.srntech90.demo.network

import `in`.srntech90.demo.md.MovieList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


/**
Created by Tanuj.Sareen on 20,January,2020
 **/
interface API {

    @GET("/")
    fun listRepos(@Query("s") movieName: String?, @Query("page") pageCount: Int, @Query("apikey") apiKey: String): Call<MovieList>


}