package com.adsmanager.core

data class RewardsItem(
    val amount: Int?,
    val type: String?,
)

interface IRewards {
    fun onUserEarnedReward(rewardsItem: RewardsItem?)
}