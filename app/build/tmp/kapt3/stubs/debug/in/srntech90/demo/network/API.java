package in.srntech90.demo.network;

import java.lang.System;

/**
 * Created by Tanuj.Sareen on 20,January,2020
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0006H\'\u00a8\u0006\n"}, d2 = {"Lin/srntech90/demo/network/API;", "", "listRepos", "Lretrofit2/Call;", "Lin/srntech90/demo/md/MovieList;", "movieName", "", "pageCount", "", "apiKey", "app_debug"})
public abstract interface API {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/")
    public abstract retrofit2.Call<in.srntech90.demo.md.MovieList> listRepos(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "s")
    java.lang.String movieName, @retrofit2.http.Query(value = "page")
    int pageCount, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "apikey")
    java.lang.String apiKey);
}