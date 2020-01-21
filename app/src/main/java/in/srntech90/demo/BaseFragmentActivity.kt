package `in`.srntech90.demo

import `in`.srntech90.demo.databinding.MainActivityBinding
import `in`.srntech90.demo.ui.main.MainFragment
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import timber.log.Timber

class BaseFragmentActivity : AppCompatActivity() {

    var mainVBinding: MainActivityBinding? = null

    var searchActive = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainVBinding = DataBindingUtil.setContentView(this, R.layout.main_activity)
        initBaseActivity()
    }

    private fun initBaseActivity() {

        setSupportActionBar(mainVBinding?.toolbar)
        supportActionBar?.title = getString(R.string.app_name)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        invalidateOptionsMenu()
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, MainFragment.newInstance())
            .commitNow()


        initSearchBar(false)
    }

    private fun initSearchBar(isInit: Boolean) {
        if (isInit)
            mainVBinding?.searchBadge?.onActionViewExpanded()
        else
            mainVBinding?.searchBadge?.setQuery("Movies",true)

        mainVBinding?.searchBadge?.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                Timber.i("query: $query")
                val frag = supportFragmentManager.findFragmentById(R.id.container)
                return if (frag is MainFragment && query != null && query.isNotEmpty()) {
                    frag.initQuery(query)
                    true
                } else
                    true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                Timber.i("newText: $newText")
                val frag = supportFragmentManager.findFragmentById(R.id.container)
                return if (frag is MainFragment && newText != null && newText.isNotEmpty()) {
                    frag.initQuery(newText)
                    true
                } else
                    true
            }
        })
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
        if (searchActive) menuInflater.inflate(R.menu.empty_menu, menu)
        else
            menuInflater.inflate(R.menu.home_menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.app_bar_search -> {
                mainVBinding?.searchBadge?.visibility = View.VISIBLE
                searchActive = true
                supportActionBar?.title = ""
                initSearchBar(true)
                invalidateOptionsMenu()
            }
        }
        return true
    }
}
