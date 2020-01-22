package in.srntech90.demo.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0002J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"H\u0016J$\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0018\u0010+\u001a\u00020\u00142\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-H\u0002J\u0010\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u000201H\u0002J\u0010\u00102\u001a\u00020\u00142\u0006\u00103\u001a\u00020\u0016H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u00a8\u00064"}, d2 = {"Lin/srntech90/demo/ui/main/ListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "activity", "Landroid/app/Activity;", "mainFragDB", "Lin/srntech90/demo/databinding/MainFragmentBinding;", "movieAdapter", "Lin/srntech90/demo/ui/main/ListAdapter;", "movieList", "Ljava/util/ArrayList;", "Lin/srntech90/demo/md/SearchItem;", "Lkotlin/collections/ArrayList;", "viewModel", "Lin/srntech90/demo/vm/MovieListViewModel;", "getViewModel", "()Lin/srntech90/demo/vm/MovieListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "callMovies", "", "movieName", "", "index", "", "initMainFrag", "initQuery", "query", "observeData", "onAttach", "context", "Landroid/content/Context;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setValues", "outCome", "Lin/srntech90/demo/network/Outcome;", "Lin/srntech90/demo/md/MovieList;", "setonScrollManager", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "showFailure", "error", "app_debug"})
public final class ListFragment extends androidx.fragment.app.Fragment {
    private android.app.Activity activity;
    private final kotlin.Lazy viewModel$delegate = null;
    private in.srntech90.demo.databinding.MainFragmentBinding mainFragDB;
    private java.util.ArrayList<in.srntech90.demo.md.SearchItem> movieList;
    private in.srntech90.demo.ui.main.ListAdapter movieAdapter;
    private java.util.HashMap _$_findViewCache;
    
    private final in.srntech90.demo.vm.MovieListViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void initMainFrag() {
    }
    
    private final void observeData() {
    }
    
    private final void callMovies(java.lang.String movieName, int index) {
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
    
    private final void setonScrollManager(androidx.recyclerview.widget.LinearLayoutManager layoutManager) {
    }
    
    private final void setValues(in.srntech90.demo.network.Outcome<in.srntech90.demo.md.MovieList> outCome) {
    }
    
    private final void showFailure(java.lang.String error) {
    }
    
    public final void initQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public ListFragment() {
        super();
    }
}