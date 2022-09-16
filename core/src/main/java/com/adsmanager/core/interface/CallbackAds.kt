package com.adsmanager.core.`interface`

abstract class CallbackAds {
    open fun onAdLoaded() {}
    open fun onAdFailedToLoad(error: String? = "") {}
}