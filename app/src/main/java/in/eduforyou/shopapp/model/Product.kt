package `in`.eduforyou.shopapp.model

import androidx.annotation.DrawableRes

data class Product(
    val id: String,
    val name: String,
    val color: Int,
    val price: Float,
    val discountPrice: Float,
    val size: Int,
    val rating: Float,
    @DrawableRes val imageRes: Int,
)