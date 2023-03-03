package com.example.codeschoolhomework.homework2

object LocalesDataController {
    private val _locales = mutableMapOf<String, MutableMap<String, String>>()
    val locales: Map<String, Map<String, String>>
        get() = _locales
    private val translator = Translator()


    fun get(languageKey: String, textKey: String): String? {
        return _locales[languageKey]?.get(textKey) ?: add(languageKey, textKey)
    }

    fun add(languageKey: String, textKey: String): String? {
        if (_locales[languageKey] != null)
            _locales[languageKey]?.put(textKey, translator.translate(languageKey, textKey))
        else {
            _locales[languageKey] = mutableMapOf(textKey to translator.translate(languageKey, textKey))
        }
        return _locales[languageKey]?.get(textKey)
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