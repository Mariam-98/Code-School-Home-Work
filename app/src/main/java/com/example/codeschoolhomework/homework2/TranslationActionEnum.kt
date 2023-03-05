package com.example.codeschoolhomework.homework2

enum class TranslationActionEnum {
    UNDEFINED,
    ADD,
    GET,
    REMOVE,
    EDIT,
    CHANGE_LOCALE;

    companion object {
        private val map = values().associateBy(TranslationActionEnum::name)
        fun from(name: String) = map[name.uppercase()] ?: UNDEFINED
    }
}