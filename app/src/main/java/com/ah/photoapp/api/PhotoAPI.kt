package com.ah.photoapp.api

import com.ah.photoapp.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by huangarch on 2017/10/20.
 */
interface PhotoAPI {
    @GET("?key=6663001-68f002361a86fe0c751dc7500&q=nature&image_type=photo")
    fun getPhotos(): Call<PhotoList>

}
