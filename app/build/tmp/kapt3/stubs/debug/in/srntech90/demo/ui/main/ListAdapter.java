package in.srntech90.demo.ui.main;

import java.lang.System;

/**
 * Created by Tanuj.Sareen on 21,January,2020
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0014\u001a\u00020\rH\u0016J\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\rH\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lin/srntech90/demo/ui/main/ListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lin/srntech90/demo/ui/main/ListAdapter$ListViewHolder;", "context", "Landroid/content/Context;", "movieList", "Ljava/util/ArrayList;", "Lin/srntech90/demo/md/SearchItem;", "Lkotlin/collections/ArrayList;", "iCallBack", "Lin/srntech90/demo/ui/main/ICallBackSelector;", "(Landroid/content/Context;Ljava/util/ArrayList;Lin/srntech90/demo/ui/main/ICallBackSelector;)V", "count", "", "getCount", "()I", "setCount", "(I)V", "getICallBack", "()Lin/srntech90/demo/ui/main/ICallBackSelector;", "getItemCount", "initCounter", "", "onBindViewHolder", "holder", "pos", "onCreateViewHolder", "p0", "Landroid/view/ViewGroup;", "p1", "ListViewHolder", "app_debug"})
public final class ListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<in.srntech90.demo.ui.main.ListAdapter.ListViewHolder> {
    private int count;
    private final android.content.Context context = null;
    private final java.util.ArrayList<in.srntech90.demo.md.SearchItem> movieList = null;
    @org.jetbrains.annotations.NotNull()
    private final in.srntech90.demo.ui.main.ICallBackSelector iCallBack = null;
    
    public final int getCount() {
        return 0;
    }
    
    public final void setCount(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public in.srntech90.demo.ui.main.ListAdapter.ListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup p0, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    in.srntech90.demo.ui.main.ListAdapter.ListViewHolder holder, int pos) {
    }
    
    public final void initCounter() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.srntech90.demo.ui.main.ICallBackSelector getICallBack() {
        return null;
    }
    
    public ListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<in.srntech90.demo.md.SearchItem> movieList, @org.jetbrains.annotations.NotNull()
    in.srntech90.demo.ui.main.ICallBackSelector iCallBack) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lin/srntech90/demo/ui/main/ListAdapter$ListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "cardView", "Landroidx/cardview/widget/CardView;", "getCardView", "()Landroidx/cardview/widget/CardView;", "img", "Landroid/widget/ImageView;", "getImg", "()Landroid/widget/ImageView;", "movieName", "Landroid/widget/TextView;", "getMovieName", "()Landroid/widget/TextView;", "app_debug"})
    public static final class ListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView img = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView movieName = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.cardview.widget.CardView cardView = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImg() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMovieName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getCardView() {
            return null;
        }
        
        public ListViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}