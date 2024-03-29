package com.adsmanager.core

object ConfigAds {

    var isShowAds = false
    var isShowOpenAd = false
    var isShowBanner = false
    var isShowInterstitial = false
    var isShowNativeAd = false
    var isShowRewards = false

    var intervalTimeInterstitial = 10 // seconds

    var primaryOpenAdId = ""
    var secondaryOpenAdId = ""
    var tertiaryOpenAdId = ""
    var quaternaryOpenAdId = ""

    var primaryAds: NetworkAds = NetworkAds.NONE
    var secondaryAds: NetworkAds = NetworkAds.NONE
    var tertiaryAds: NetworkAds = NetworkAds.NONE
    var quaternaryAds: NetworkAds = NetworkAds.NONE

    var primaryAppId = ""
    var secondaryAppId = ""
    var tertiaryAppId = ""
    var quaternaryAppId = ""

    var primaryBannerId = ""
    var secondaryBannerId = ""
    var tertiaryBannerId = ""
    var quaternaryBannerId = ""

    var primaryInterstitialId = ""
    var secondaryInterstitialId = ""
    var tertiaryInterstitialId = ""
    var quaternaryInterstitialId = ""

    var primaryNativeId = ""
    var secondaryNativeId = ""
    var tertiaryNativeId = ""
    var quaternaryNativeId = ""

    var primaryRewardsId = ""
    var secondaryRewardsId = ""
    var tertiaryRewardsId = ""
    var quaternaryRewardsId = ""
}