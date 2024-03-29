package com.adsmanager.core.iadsmanager

import android.app.Activity
import android.content.Context
import android.widget.RelativeLayout
import com.adsmanager.core.CallbackAds
import com.adsmanager.core.rewards.IRewards
import com.adsmanager.core.SizeBanner
import com.adsmanager.core.SizeNative

interface IAds {
    fun initialize(
        context: Context,
        appId: String?,
        iInitialize: IInitialize?,
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


