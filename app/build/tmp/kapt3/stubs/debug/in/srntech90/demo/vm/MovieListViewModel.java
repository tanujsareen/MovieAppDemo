package in.srntech90.demo.vm;

import java.lang.System;

/**
 * Created by Tanuj.Sareen on 20,January,2020
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fJ\u0014\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lin/srntech90/demo/vm/MovieListViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "mListRepository", "Lin/srntech90/demo/repos/MListRepository;", "movieListLD", "Landroidx/lifecycle/MutableLiveData;", "Lin/srntech90/demo/network/Outcome;", "Lin/srntech90/demo/md/MovieList;", "listRepos", "", "movieName", "", "pageCount", "", "apiKey", "observerMovieList", "app_debug"})
public final class MovieListViewModel extends androidx.lifecycle.ViewModel {
    private final in.srntech90.demo.repos.MListRepository mListRepository = null;
    private androidx.lifecycle.MutableLiveData<in.srntech90.demo.network.Outcome<in.srntech90.demo.md.MovieList>> movieListLD;
    
    public final void listRepos(@org.jetbrains.annotations.NotNull()
    java.lang.String movieName, int pageCount, @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<in.srntech90.demo.network.Outcome<in.srntech90.demo.md.MovieList>> observerMovieList() {
        return null;
    }
    
    public MovieListViewModel() {
        super();
    }
}