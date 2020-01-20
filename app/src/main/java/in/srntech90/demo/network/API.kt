package `in`.srntech90.demo.network

import `in`.srntech90.demo.md.MovieList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


/**
Created by Tanuj.Sareen on 20,January,2020
 **/
interface API {

    @GET("?s={movieName}&page={pageCount}&apikey={apiKey}")
    fun listRepos(@Path("s") movieName: String?, @Path("page") pageCount: Int, @Path("apikey") apiKey: String): Call<MovieList>


}