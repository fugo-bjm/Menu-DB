package com.qiaooapp.menudb

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    @GET("get_menu.php")
    suspend fun getMenus(): List<MenuItem>

    @GET("get_rateUSD.php")
    suspend fun getRates(): Map<String, Double>

    @POST("post_checkout.php")
    suspend fun postCheckout(@Body data: CheckoutRequest): Response<Map<String, Any>>
}
