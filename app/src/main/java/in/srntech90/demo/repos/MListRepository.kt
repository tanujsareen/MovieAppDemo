package `in`.srntech90.demo.repos

import `in`.srntech90.demo.md.MovieList
import `in`.srntech90.demo.network.BaseNetwork
import `in`.srntech90.demo.network.Outcome
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import timber.log.Timber

/**
Created by Tanuj.Sareen on 20,January,2020
 **/
class MListRepository {

    fun listRepos(
        movieName: String,
        pageCount: Int,
        apiKey: String
    ): MutableLiveData<Outcome<MovieList>> {

        Timber.i("request:movieName->${movieName}, pageCount->${pageCount}, apiKey->${apiKey}")
        val data = MutableLiveData<Outcome<MovieList>>()
        data.value = Outcome.loading(true)

        BaseNetwork.callAPI.listRepos(movieName, pageCount, apiKey)
            .enqueue(object : Callback<MovieList> {
                override fun onFailure(call: Call<MovieList>, t: Throwable) {
                    Timber.i("exception")
                    data.value = Outcome.loading(false)
                    data.value = Outcome.failure("Something went wrong")
                }

                override fun onResponse(call: Call<MovieList>, response: Response<MovieList>) {
                    Timber.i("onResponse: response.body() > ${response.body()}")
                    data.value = Outcome.loading(false)
                    if (response.isSuccessful && response.body() != null)
                        data.value = Outcome.success(response.body()!!)
                    else
                        data.value = Outcome.failure(response.errorBody().toString())
                }

            })

        return data
    }
}