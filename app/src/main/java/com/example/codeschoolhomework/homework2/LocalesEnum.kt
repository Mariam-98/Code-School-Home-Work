package com.example.codeschoolhomework.homework2

enum class LocalesEnum(val alpha2: String) {
    ENGLISH("en"),
    RUSSIAN("ru"),
    ARMENIAN("hy");

    companion object {
        private val map = values().associateBy(LocalesEnum::alpha2)
        fun from(alpha2: String) = map[alpha2] ?: ENGLISH
    }
}