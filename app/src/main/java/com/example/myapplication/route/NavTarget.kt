package com.example.myapplication.route

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * You can create this class inside the body of RootNode
 *
 * Note: You must apply the 'kotlin-parcelize' plugin to use @Parcelize
 * https://developer.android.com/kotlin/parcelize
 */
sealed class NavTarget : Parcelable {
    @Parcelize
    object Child1 : NavTarget()

    @Parcelize
    object Child2 : NavTarget()

    @Parcelize
    object Child3 : NavTarget()
}
