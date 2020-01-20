package `in`.srntech90.demo.ui.main

import `in`.srntech90.demo.R
import `in`.srntech90.demo.md.MovieList
import `in`.srntech90.demo.network.Outcome
import `in`.srntech90.demo.vm.MovieListViewModel
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private val viewModel by activityViewModels<MovieListViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.listRepos("Batman", 1, "")
        viewModel.observerMovieList()
            ?.observe(this, Observer {
                setValues(it)
            })

    }

    private fun setValues(outCome: Outcome<MovieList>?) {

        when(outCome){
            is Outcome.Progress -> { }
            is Outcome.Failure -> { }
            is Outcome.Success -> { }

        }
    }

}
