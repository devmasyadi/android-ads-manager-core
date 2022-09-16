package com.adsmanager.core

abstract class CallbackAds {
    open fun onAdLoaded() {}
    open fun onAdFailedToLoad(error: String? = "") {}
}