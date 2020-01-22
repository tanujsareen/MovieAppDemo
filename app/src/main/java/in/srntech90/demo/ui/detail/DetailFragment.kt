package `in`.srntech90.demo.ui.detail

import `in`.srntech90.demo.BaseFragmentActivity
import `in`.srntech90.demo.R
import `in`.srntech90.demo.databinding.DetailFragmentBinding
import `in`.srntech90.demo.md.SearchItem
import `in`.srntech90.demo.utility.Utils
import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import timber.log.Timber

/**
Created by Tanuj.Sareen on 22,January,2020
 **/
class DetailFragment : Fragment() {

    private var activity: Activity? = null

    private var detailVB: DetailFragmentBinding? = null

    private var searchItem: SearchItem? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        this.activity = context as Activity
        Timber.i("onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        searchItem = arguments?.getSerializable("searchItem") as SearchItem
        Timber.i("onCreate")

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Timber.i("onCreateView")
        (activity as BaseFragmentActivity).initFrag(this)
        detailVB = DataBindingUtil.inflate(inflater, R.layout.detail_fragment, container, false)
        init()
        return detailVB?.root
    }

    private fun init() {

        ViewCompat.setTransitionName(
            detailVB?.imgDetail!!,
            TextUtils.concat(searchItem?.imdbID).toString()
        )

        ViewCompat.setTransitionName(
            detailVB?.txtMovieName!!,
            TextUtils.concat(searchItem?.title).toString()
        )

        detailVB?.imgDetail?.setImageBitmap(arguments?.getParcelable("IMAGE"))
        detailVB?.txtMovieName?.text = searchItem?.title
        detailVB?.txtYears?.text = Utils.getYears(searchItem?.year ?: "")
    }
}