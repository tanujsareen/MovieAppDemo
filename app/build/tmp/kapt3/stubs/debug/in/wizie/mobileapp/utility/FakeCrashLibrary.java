package in.wizie.mobileapp.utility;

import java.lang.System;

/**
 * Not a real crash reporting library!
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lin/wizie/mobileapp/utility/FakeCrashLibrary;", "", "()V", "Companion", "app_debug"})
public final class FakeCrashLibrary {
    public static final in.wizie.mobileapp.utility.FakeCrashLibrary.Companion Companion = null;
    
    private FakeCrashLibrary() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a8\u0006\u000e"}, d2 = {"Lin/wizie/mobileapp/utility/FakeCrashLibrary$Companion;", "", "()V", "log", "", "priority", "", "tag", "", "message", "logError", "t", "", "logWarning", "app_debug"})
    public static final class Companion {
        
        public final void log(int priority, @org.jetbrains.annotations.Nullable()
        java.lang.String tag, @org.jetbrains.annotations.Nullable()
        java.lang.String message) {
        }
        
        public final void logWarning(@org.jetbrains.annotations.Nullable()
        java.lang.Throwable t) {
        }
        
        public final void logError(@org.jetbrains.annotations.Nullable()
        java.lang.Throwable t) {
        }
        
        private Companion() {
            super();
        }
    }
}