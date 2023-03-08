package com.example.codeschoolhomework.homework2

import java.util.*

class Translator : OnRestEndListener {

    private val scanner = Scanner(System.`in`)

    var onRestListener: OnRestListener? = null


    fun translate(languageKey: String, text: String): String {
        LocalesDataController.onRestEndListener = this
        var translatedText = ""
        if (translatedCount == 2) {
            if (!isInRest) {
                onRestListener?.onRestStarted()
                isInRest = true
            }
            LocalesDataController.translateLater[languageKey]?.put(text, "")
        } else {
            println(
                "Please translate  $text into ${
                    LocalesEnum.values().find { it.alpha2 == languageKey }?.name
                }"
            )
            translatedText = scanner.nextLine()

            println("Translation completed!\n$text: $translatedText")
            translatedCount++
        }

        return translatedText
    }

    companion object {
        var translatedCount: Int = 0
        var isInRest: Boolean = false
    }

    override fun onRestEnd() {
        translatedCount = 0
        isInRest = false
    }

    interface OnRestListener {
        fun onRestStarted()
        fun onRestCompleted()
    }
}

