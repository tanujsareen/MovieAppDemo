package `in`.srntech90.demo.ui.main

import `in`.srntech90.demo.BaseFragmentActivity
import `in`.srntech90.demo.BuildConfig
import `in`.srntech90.demo.R
import `in`.srntech90.demo.databinding.MainFragmentBinding
import `in`.srntech90.demo.md.MovieList
import `in`.srntech90.demo.md.SearchItem
import `in`.srntech90.demo.network.Outcome
import `in`.srntech90.demo.vm.MovieListViewModel
import android.app.Activity
import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SimpleItemAnimator
import kotlinx.android.synthetic.main.main_activity.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private var activity: Activity? = null

    private val viewModel by activityViewModels<MovieListViewModel>()

    private lateinit var mainFragDB: MainFragmentBinding

    private var movieList: ArrayList<SearchItem> = ArrayList()

    private var movieAdapter: ListAdapter? = null


    override fun onAttach(context: Context) {
        super.onAttach(context)
        this.activity = context as Activity?
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mainFragDB = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false)
        initMainFrag()
        return mainFragDB.root
    }

    private fun initMainFrag() {
        onConfigurationChanged(resources.configuration)
        (mainFragDB.recycleView.itemAnimator as SimpleItemAnimator).supportsChangeAnimations =
            true
        mainFragDB.recycleView.setHasFixedSize(true)


        activity?.let {
            movieAdapter = ListAdapter(it, movieList)
            mainFragDB.recycleView?.adapter = movieAdapter
        }


    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        movieAdapter?.let {
            callMovies((activity as BaseFragmentActivity).search_badge.query.toString(), it.count)
        }

    }

    private fun callMovies(movieName: String, index: Int) {

        viewModel.listRepos(movieName, index, BuildConfig.API_KEY)
        activity?.let {
            viewModel.observerMovieList()
                ?.observe(this, Observer {
                    setValues(it)
                })
        }
    }


    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        when (newConfig.orientation) {
            Configuration.ORIENTATION_UNDEFINED -> {
            }
            Configuration.ORIENTATION_LANDSCAPE -> {
                if ((activity as BaseFragmentActivity).isTablet()) {

                    val layoutManager = GridLayoutManager(activity, 5)
                    mainFragDB.recycleView.layoutManager = layoutManager
                    setonScrollManager(layoutManager)


                } else {
                    val layoutManager = GridLayoutManager(activity, 3)
                    mainFragDB.recycleView.layoutManager = layoutManager
                    setonScrollManager(layoutManager)
                }

            }
            Configuration.ORIENTATION_PORTRAIT -> {
                if ((activity as BaseFragmentActivity).isTablet()) {
                    val layoutManager = GridLayoutManager(activity, 4)
                    mainFragDB.recycleView.layoutManager = layoutManager
                    setonScrollManager(layoutManager)

                } else {
                    val layoutManager = GridLayoutManager(activity, 2)
                    mainFragDB.recycleView.layoutManager = layoutManager
                    setonScrollManager(layoutManager)

                }
            }
        }

        movieAdapter?.notifyDataSetChanged()
    }

    private fun setonScrollManager(layoutManager: LinearLayoutManager) {

        mainFragDB.recycleView.addOnScrollListener(object : RecyclerView.OnScrollListener() {

            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)

                if (layoutManager.findLastCompletelyVisibleItemPosition() == movieList.size - 1) {
                    movieAdapter?.let {
                        it.count++
                        callMovies( (activity as BaseFragmentActivity).search_badge.query.toString(), it.count)
                    }
                }
            }
        })

    }

    private fun setValues(outCome: Outcome<MovieList>?) {

        when (outCome) {
            is Outcome.Progress -> {

                mainFragDB.progressBar?.visibility = if (outCome.loading)
                    View.VISIBLE
                else
                    View.GONE
            }
            is Outcome.Failure -> showFailure(outCome.error)
            is Outcome.Success -> {

                outCome.data.search?.forEach {
                    movieList.add(it)
                }
                movieAdapter?.notifyDataSetChanged()
            }

        }
    }

    private fun showFailure(error: String) {

    }

    fun initQuery(query: String) {
        movieList.clear()
        movieAdapter?.let {
            it.initCounter()
            callMovies(query, it.count)
        }

    }

}
