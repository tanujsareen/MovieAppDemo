package `in`.srntech90.demo.ui.main

import `in`.srntech90.demo.R
import `in`.srntech90.demo.md.SearchItem
import android.content.Context
import android.graphics.drawable.Drawable
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
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
    private val movieList: ArrayList<SearchItem>,
    val iCallBack: ICallBackSelector
) : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    var count: Int = 1

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img: ImageView = itemView.findViewById(R.id.imgMovie)
        val movieName: TextView = itemView.findViewById(R.id.txtMovieName)
        val cardView: CardView = itemView.findViewById(R.id.cardView)
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
                        holder.img.setImageResource(R.drawable.ic_image_black_50dp)

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

        ViewCompat.setTransitionName(
            holder.img,
            TextUtils.concat(movieList[pos].imdbID).toString()
        )
        ViewCompat.setTransitionName(
            holder.movieName,
            TextUtils.concat(movieList[pos].title).toString()
        )


        holder.cardView.setOnClickListener {
            iCallBack.callDetailView(movieList[pos], holder.img)
        }

    }

    fun initCounter() {
        count = 1
        notifyDataSetChanged()
    }


}