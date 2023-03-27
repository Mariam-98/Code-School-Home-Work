package com.example.codeschoolhomework.students.mariam.myHomework4

enum class BusinessCardViewTextStyleEnum(val value: Int) {
    BOLD(0),
    ITALIC(1),
    NORMAL(2);

    companion object {
        private val map = values().associateBy(BusinessCardViewTextStyleEnum::value)
        fun from(value:Int) = map[value]
    }
}