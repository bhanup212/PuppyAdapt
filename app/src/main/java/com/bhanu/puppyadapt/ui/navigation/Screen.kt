package com.bhanu.puppyadapt.ui.navigation

import com.bhanu.puppyadapt.R
import com.bhanu.puppyadapt.utils.NAV_HOME
import com.bhanu.puppyadapt.utils.NAV_PUPPY_DETAILS

sealed class Screen(val route: String, val resourceId: Int){
    object Home: Screen(NAV_HOME, R.string.home)
    object PuppyDetails: Screen(NAV_PUPPY_DETAILS, R.string.details)
}
