package `in`.srntech90.demo.ui.main

import `in`.srntech90.demo.R
import `in`.srntech90.demo.md.SearchItem
import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target

/**
Created by Tanuj.Sareen on 21,January,2020
 **/
class ListAdapter(
    private val context: Context,
    private val movieList: ArrayList<SearchItem>
) : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    var count: Int = 1

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img = itemView.findViewById<ImageView>(R.id.imgMovie)
        val movieName = itemView.findViewById<TextView>(R.id.txtMovieName)
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ListViewHolder {
        val item = LayoutInflater.from(context).inflate(R.layout.movie_list_item, null)
        return ListViewHolder(item)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, pos: Int) {
        /* Glide.with(context).load(movieList[pos].poster)
             .fitCenter()
             .into(holder.img)*/

        context.let {
            Glide.with(it).load(movieList[pos].poster)
                .fitCenter()
                .thumbnail(0.25f)
                .addListener(object : RequestListener<Drawable> {

                    override fun onLoadFailed(
                        e: GlideException?,
                        model: Any?,
                        target: Target<Drawable>?,
                        isFirstResource: Boolean
                    ): Boolean {
                        holder.img.scaleType = ImageView.ScaleType.FIT_CENTER
                        /* holder.img.setImageResource(R.drawable.ic_hotel)*/

                        return true
                    }

                    override fun onResourceReady(
                        resource: Drawable?,
                        model: Any?,
                        target: Target<Drawable>?,
                        dataSource: DataSource?,
                        isFirstResource: Boolean
                    ): Boolean {
                        /*   holder.progressBarGridImage.visibility = View.GONE*/
                        holder.img.scaleType = ImageView.ScaleType.FIT_XY
                        holder.img.setImageDrawable(resource)

                        return true
                    }

                }).into(holder.img)
        }
        holder.movieName.text = movieList[pos].title

    }

    fun initCounter() {
        count = 1
        notifyDataSetChanged()
    }
}