package com.sympla.testeandroid.data.model

import com.google.gson.annotations.SerializedName

data class SymplaEventsResponse(
    @SerializedName("data")
    val data: List<EventDTO>,

    @SerializedName("pagination")
    val pagination: PaginationDTO,

    @SerializedName("sort")
    val sort: SortDTO
)

data class EventDTO(
    @SerializedName("id")
    val id: String,

    @SerializedName("reference_id")
    val referenceId: Int,

    @SerializedName("start_date")
    val startDate: String,

    @SerializedName("end_date")
    val endDate: String,

    @SerializedName("name")
    val name: String,

    @SerializedName("detail")
    val detail: String,

    @SerializedName("private_event")
    val privateEvent: Int,

    @SerializedName("published")
    val published: Int,

    @SerializedName("cancelled")
    val cancelled: Int,

    @SerializedName("image")
    val image: String,

    @SerializedName("url")
    val url: String,

    @SerializedName("address")
    val address: AddressDTO,

    @SerializedName("host")
    val host: HostDTO,

    @SerializedName("category_prim")
    val categoryPrim: CategoryDTO,

    @SerializedName("category_sec")
    val categorySec: CategoryDTO
)

data class AddressDTO(
    @SerializedName("name")
    val name: String,

    @SerializedName("address")
    val address: String,

    @SerializedName("address_num")
    val addressNum: String,

    @SerializedName("city")
    val city: String,

    @SerializedName("state")
    val state: String,

    @SerializedName("country")
    val country: String,

    @SerializedName("lat")
    val lat: Double,

    @SerializedName("lon")
    val lon: Double
)

data class HostDTO(
    @SerializedName("name")
    val name: String
)

data class CategoryDTO(
    @SerializedName("name")
    val name: String
)

data class PaginationDTO(
    @SerializedName("has_next")
    val hasNext: Boolean,

    @SerializedName("has_prev")
    val hasPrev: Boolean,

    @SerializedName("quantity")
    val quantity: Int,

    @SerializedName("offset")
    val offset: Int,

    @SerializedName("page")
    val page: Int,

    @SerializedName("page_size")
    val pageSize: Int
)

data class SortDTO(
    @SerializedName("field_sort")
    val fieldSort: String,

    @SerializedName("sort")
    val sort: String
)
