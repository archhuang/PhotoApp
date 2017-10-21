package com.ah.photoapp.models

import java.io.Serializable
/**
 * Created by huangarch on 2017/10/20.
 */
data class Photo(val id: String,
                 val likes: Int,
                 val favorites: Int,
                 val tags: String,
                 val previewURL: String,
                 val webformatURL: String): Serializable {


}
