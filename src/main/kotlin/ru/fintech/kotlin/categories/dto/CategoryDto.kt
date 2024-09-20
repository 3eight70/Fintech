package ru.fintech.kotlin.categories.dto

import kotlinx.serialization.Serializable

@Serializable
class CategoryDto(
    val id: Long,
    val name: String,
    val slug: String
)