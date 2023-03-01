package com.example.codeschoolhomework.homework2

object LocalesDataController {
    private val locales = mutableMapOf<String, String>()
    private val translator = Translator()

    fun get(key: String): String {
        if (!locales.containsKey(key)) locales[key] = translator.translate(key)
        return locales[key] ?: throw java.lang.RuntimeException("Please, make sure that your translator class translate fun() works correctly")
//        return locales[key]!!
    }
}




//hello : Hello map.get(key)
//goodbye : -> translating goodbye, putting to map, map.get(key)

/**
 * hello: Hello
 * goodbye: Goodbye
 *
 * get("car")
 *
 * homework
 * 1) անցած տնայինը վերջացնել
 * 2) ունենալ command ներ, add, remove, edit <-սա աշխատելու ա հիմնական while ում.
 * key:value map ը փոխել map<key, map<key, value>
 * translator limit logic, with rest time.
 * callbacks for limit (endLimit)
 * after X minutes
 * translator can continue translating. must send call.
 * also.
 * don't lose added words during rest time. (we need some stack)
 *
 */