package com.adsmanager.core.`interface`

import android.app.Activity
import android.widget.RelativeLayout
import com.adsmanager.core.CallbackAds
import com.adsmanager.core.IRewards

interface IAds {
    fun initialize(
        activity: Activity,
        iInitialize: IInitialize,
    )

    fun setTestDevices(activity: Activity, testDevices: List<String>)
    fun loadGdpr(activity: Activity, childDirected: Boolean)
    fun showBanner(
        activity: Activity,
        bannerView: RelativeLayout,
        sizeBanner: SizeBanner,
        adUnitId: String,
        callbackAds: CallbackAds?
    )

    fun loadInterstitial(activity: Activity, adUnitId: String)
    fun showInterstitial(activity: Activity, adUnitId: String, callbackAds: CallbackAds?)
    fun showNativeAds(
        activity: Activity,
        nativeView: RelativeLayout,
        sizeNative: SizeNative,
        adUnitId: String,
        callbackAds: CallbackAds?
    )

    fun loadRewards(activity: Activity, adUnitId: String)
    fun showRewards(
        activity: Activity,
        adUnitId: String,
        callbackAds: CallbackAds?,
        iRewards: IRewards?
    )
}


