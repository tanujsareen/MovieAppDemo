package `in`.srntech90.demo

import `in`.srntech90.demo.databinding.MainActivityBinding
import `in`.srntech90.demo.md.SearchItem
import `in`.srntech90.demo.ui.detail.DetailFragment
import `in`.srntech90.demo.ui.main.ListFragment
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.transition.*
import timber.log.Timber

class BaseFragmentActivity : AppCompatActivity() {

    var mainVBinding: MainActivityBinding? = null

    var searchActive = false

    val DURATION: Long = 600
    val START_DELAY: Long = 100


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainVBinding = DataBindingUtil.setContentView(this, R.layout.main_activity)
        initBaseActivity()
    }

    private fun initBaseActivity() {

        setSupportActionBar(mainVBinding?.toolbar)
        invalidateOptionsMenu()
        initHome()
        mainVBinding?.searchBadge?.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                Timber.i("query: $query")
                val frag = supportFragmentManager.findFragmentById(R.id.container)
                return if (frag is ListFragment && query != null && query.isNotEmpty() && query.length > 2) {
                    frag.initQuery(query)
                    true
                } else
                    true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                Timber.i("newText: $newText")
                val frag = supportFragmentManager.findFragmentById(R.id.container)
                return if (frag is ListFragment && newText != null && newText.isNotEmpty() && newText.length > 2) {
                    frag.initQuery(newText)
                    true
                } else
                    true
            }
        })

    }

    private fun initHome() {

        val listFragment = ListFragment()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
            .apply {
                replace(R.id.container, listFragment, "ListFragment")
                addToBackStack("ListFragment")
            }

        fragmentTransaction.commit()
    }

    private fun initSearchBar(searchActive: Boolean) {
        if (searchActive) {
            mainVBinding?.searchBadge?.visibility = View.VISIBLE
            mainVBinding?.searchBadge?.onActionViewExpanded()

            supportActionBar?.title = ""
        } else {
            mainVBinding?.searchBadge?.onActionViewCollapsed()
            mainVBinding?.searchBadge?.visibility = View.GONE

            supportActionBar?.title = getString(R.string.app_name)
        }


    }

    fun isTablet(): Boolean {
        val isBoolean: Boolean

        val metrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(metrics)

        val widthDp: Float = metrics.widthPixels / metrics.density
        val heightDp: Float = metrics.heightPixels / metrics.density

        val smallestWidth: Float = Math.min(widthDp, heightDp)

        isBoolean = if (smallestWidth > 720) {
            true
        } else smallestWidth > 600

        return isBoolean
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val frag = supportFragmentManager.findFragmentById(R.id.container)
        if (frag is DetailFragment) {
            menuInflater.inflate(R.menu.empty_menu, menu)

        } else if (frag is ListFragment) {
            if (searchActive) menuInflater.inflate(R.menu.empty_menu, menu)
            else
                menuInflater.inflate(R.menu.home_menu, menu)
        }

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.app_bar_search -> {
                searchActive = true
                initSearchBar(true)
                invalidateOptionsMenu()
            }
        }
        return true
    }

    fun callDetailFrag(searchItem: SearchItem, img: ImageView) {

        val detailFrag = DetailFragment()
        val bundle = Bundle()
        bundle.putSerializable("searchItem", searchItem)
        bundle.putParcelable("IMAGE", (img.drawable as? BitmapDrawable)?.bitmap)
        detailFrag.arguments = bundle
        val enterTransitionSet = TransitionSet()
        enterTransitionSet.addTransition(TransitionInflater.from(this).inflateTransition(android.R.transition.move))
        enterTransitionSet.duration = DURATION
        enterTransitionSet.startDelay = START_DELAY
        enterTransitionSet.addTransition(ChangeBounds())
        enterTransitionSet.addTransition(ChangeTransform())
        enterTransitionSet.addTransition(ChangeImageTransform())
        detailFrag.sharedElementEnterTransition = enterTransitionSet

        val enterFade = Fade()
        enterFade.startDelay = DURATION + START_DELAY
        enterFade.duration = START_DELAY
        detailFrag.enterTransition = enterFade

        val fragmentTransaction = supportFragmentManager.beginTransaction().apply {
            replace(R.id.container, detailFrag, "DetailFragment")
            addToBackStack("DetailFragment")

        }
        fragmentTransaction.addSharedElement(img, img.transitionName)

        fragmentTransaction.commit()

    }

    override fun onBackPressed() {

        when (supportFragmentManager.findFragmentById(R.id.container)) {
            is DetailFragment -> {
                super.onBackPressed()
            }
            is ListFragment -> {
                finish()
            }
        }
    }

    fun initFrag(frag: Fragment) {

        when (frag) {

            is DetailFragment -> {
                mainVBinding?.searchBadge?.visibility = View.GONE
                supportActionBar?.title = getString(R.string.app_name)
                invalidateOptionsMenu()
            }
            is ListFragment -> {
                initSearchBar(searchActive)
                invalidateOptionsMenu()
            }
        }

    }
}
