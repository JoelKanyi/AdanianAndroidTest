package com.kanyideveloper.adanianandroidtest.domain.repository

import com.kanyideveloper.adanianandroidtest.domain.model.Image
import com.kanyideveloper.adanianandroidtest.util.Resource
import kotlinx.coroutines.flow.Flow


interface ImageRepository {

    fun getImages(name: String?): Flow<Resource<List<Image>>>
}