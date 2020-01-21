/*
 * Copyright 2019 Wizie Technologies. All rights reserved.
 * Created By : Tanuj Sareen on 17 - 10 - 2019
 */
package `in`.wizie.mobileapp.utility

/** Not a real crash reporting library!  */
class FakeCrashLibrary private constructor() {
    companion object {
        fun log(priority: Int, tag: String?, message: String?) {
            println("priority: $priority, tag: $tag, message: $message")
        }

        fun logWarning(t: Throwable?) { // TODO report non-fatal warning.
        }

        fun logError(t: Throwable?) { // TODO report non-fatal error.
        }
    }

    init {
        throw AssertionError("No instances.")
    }
}