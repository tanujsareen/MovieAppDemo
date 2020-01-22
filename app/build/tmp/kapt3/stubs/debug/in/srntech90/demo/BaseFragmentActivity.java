package in.srntech90.demo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u0016H\u0002J\u000e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020\u0016H\u0002J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010!\u001a\u00020\u0010J\b\u0010\"\u001a\u00020\u0016H\u0016J\u0012\u0010#\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0012\u0010&\u001a\u00020\u00102\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020+H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006,"}, d2 = {"Lin/srntech90/demo/BaseFragmentActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "DURATION", "", "getDURATION", "()J", "START_DELAY", "getSTART_DELAY", "mainVBinding", "Lin/srntech90/demo/databinding/MainActivityBinding;", "getMainVBinding", "()Lin/srntech90/demo/databinding/MainActivityBinding;", "setMainVBinding", "(Lin/srntech90/demo/databinding/MainActivityBinding;)V", "searchActive", "", "getSearchActive", "()Z", "setSearchActive", "(Z)V", "callDetailFrag", "", "searchItem", "Lin/srntech90/demo/md/SearchItem;", "img", "Landroid/widget/ImageView;", "initBaseActivity", "initFrag", "frag", "Landroidx/fragment/app/Fragment;", "initHome", "initSearchBar", "isTablet", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "app_debug"})
public final class BaseFragmentActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.Nullable()
    private in.srntech90.demo.databinding.MainActivityBinding mainVBinding;
    private boolean searchActive;
    private final long DURATION = 600L;
    private final long START_DELAY = 100L;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final in.srntech90.demo.databinding.MainActivityBinding getMainVBinding() {
        return null;
    }
    
    public final void setMainVBinding(@org.jetbrains.annotations.Nullable()
    in.srntech90.demo.databinding.MainActivityBinding p0) {
    }
    
    public final boolean getSearchActive() {
        return false;
    }
    
    public final void setSearchActive(boolean p0) {
    }
    
    public final long getDURATION() {
        return 0L;
    }
    
    public final long getSTART_DELAY() {
        return 0L;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initBaseActivity() {
    }
    
    private final void initHome() {
    }
    
    private final void initSearchBar(boolean searchActive) {
    }
    
    public final boolean isTablet() {
        return false;
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public final void callDetailFrag(@org.jetbrains.annotations.NotNull()
    in.srntech90.demo.md.SearchItem searchItem, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView img) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public final void initFrag(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment frag) {
    }
    
    public BaseFragmentActivity() {
        super();
    }
}