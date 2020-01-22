package `in`.srntech90.demo.md


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MovieList(
    @SerializedName("Response")
    val response: String? = "",
    @SerializedName("totalResults")
    val totalResults: String? = "",
    @SerializedName("Search")
    val search: List<SearchItem>?
) : Serializable


data class SearchItem(
    @SerializedName("Type")
    val type: String? = "",
    @SerializedName("Year")
    val year: String? = "",
    @SerializedName("imdbID")
    val imdbID: String? = "",
    @SerializedName("Poster")
    val poster: String? = "",
    @SerializedName("Title")
    val title: String? = ""
) : Serializable


