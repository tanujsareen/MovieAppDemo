package `in`.srntech90.demo.vm

import `in`.srntech90.demo.md.MovieList
import `in`.srntech90.demo.network.Outcome
import `in`.srntech90.demo.repos.MListRepository
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
Created by Tanuj.Sareen on 20,January,2020
 **/
class MovieListViewModel : ViewModel() {

    private val mListRepository: MListRepository?

    private var movieListLD: MutableLiveData<Outcome<MovieList>>?

    init {
        mListRepository = MListRepository()
        movieListLD = MutableLiveData()
    }


    fun listRepos(
        movieName: String,
        pageCount: Int,
        apiKey: String
    ) {
        movieListLD = mListRepository?.listRepos(movieName, pageCount, apiKey)
    }

    fun observerMovieList(): MutableLiveData<Outcome<MovieList>>? {
        return movieListLD
    }

}