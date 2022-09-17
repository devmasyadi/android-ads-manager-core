package com.adsmanager.core

abstract class CallbackOpenAd {
    open fun onAdLoaded() {}
    open fun onAdFailedToLoad(error: String? = "") {}
    open fun onShowAdComplete() {}
}