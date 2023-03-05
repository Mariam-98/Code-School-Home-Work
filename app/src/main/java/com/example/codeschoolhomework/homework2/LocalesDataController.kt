package com.example.codeschoolhomework.homework2

object LocalesDataController {
     val locales = mutableMapOf<String, MutableMap<String, String>>()
    private val translator = Translator()
    translator.setOnRestListener(...)

    fun get(languageKey: String, textKey: String): String? {
        return locales[languageKey]?.get(textKey) ?: add(languageKey, textKey)
    }

//    fun add(languageKey: String, textKey: String): String? {
//        if (locales[languageKey] != null)
//            locales[languageKey]?.put(textKey, translator.translate(languageKey, textKey))
//        else {
//            locales[languageKey] = mutableMapOf(textKey to translator.translate(languageKey, textKey))
//        }
//        return locales[languageKey]?.get(textKey)
//    }

    fun remove(languageKey: String, textKey: String){
        if (locales[languageKey]?.get(textKey) != null) {
            locales[languageKey]?.remove(textKey)
            println("text $textKey is removed")
        } else {
            println("$textKey is not exist")
        }
    }

    fun edit(languageKey: String, textKey: String, newText: String) {
        if (locales[languageKey]?.get(textKey) != null) {
            locales[languageKey]?.put(textKey, newText)
            println("text $textKey is replaced to $newText")
        } else {
            println("$textKey is not exist")
        }
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