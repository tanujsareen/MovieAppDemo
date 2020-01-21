package in.srntech90.demo;

import java.lang.System;

/**
 * Created by Tanuj.Sareen on 21,January,2020
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lin/srntech90/demo/ApplicationController;", "Landroid/app/Application;", "()V", "onCreate", "", "CrashReportingTree", "app_debug"})
public final class ApplicationController extends android.app.Application {
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public ApplicationController() {
        super();
    }
    
    /**
     * A tree which logs important information for crash reporting.
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014\u00a8\u0006\f"}, d2 = {"Lin/srntech90/demo/ApplicationController$CrashReportingTree;", "Ltimber/log/Timber$Tree;", "()V", "log", "", "priority", "", "tag", "", "message", "t", "", "app_debug"})
    static final class CrashReportingTree extends timber.log.Timber.Tree {
        
        @java.lang.Override()
        protected void log(int priority, @org.jetbrains.annotations.Nullable()
        java.lang.String tag, @org.jetbrains.annotations.NotNull()
        @androidx.annotation.NonNull()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable t) {
        }
        
        public CrashReportingTree() {
            super();
        }
    }
}