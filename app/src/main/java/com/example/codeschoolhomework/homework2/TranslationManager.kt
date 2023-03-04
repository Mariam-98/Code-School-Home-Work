package com.example.codeschoolhomework.homework2

import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import java.sql.Time
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.concurrent.schedule

class TranslationManager {
    private val scanner = Scanner(System.`in`)

    fun start() {
        "Please, input action".log()

        when (TranslationActionEnum.valueOf(scanner.next().uppercase())) {
            TranslationActionEnum.ADD -> addTranslation()
            TranslationActionEnum.GET -> getTranslation()
            TranslationActionEnum.REMOVE -> remove()
            TranslationActionEnum.EDIT -> edit()
            else -> println("try again")
        }

        if (LocalesDataController.locales.values.toMutableList().map {
                it.values.toMutableList()
            }.flatten().size > 1) {



            "i am going to rest".log()
            Timer().schedule(5000) {
                "i am coming back".log()
            }
        }
        start()
    }

    fun addTranslation() {
        val language = chooseLanguage()
        "Please insert text".log()
        val text = scanner.next()

        val translatedText = LocalesDataController.add(language.key, text)
        "text: $text , translate: $translatedText".log()

    }

    fun getTranslation() {
        val language = chooseLanguage()
        "Please insert text".log()
        val text = scanner.next()

        val translatedText = LocalesDataController.get(language.key, text)
        "text: $text , translate: $translatedText".log()
    }

    fun remove() {
        val language = chooseLanguage()
        "Please insert text".log()
        val text = scanner.next()

        LocalesDataController.remove(language.key, text)
    }


    fun chooseLanguage(): LocalesEnum {
        "Please insert language".log()
        val languageIndex = scanner.nextInt()
        return if (languageIndex >= LocalesEnum.values().size) LocalesEnum.ENGLISH
        else LocalesEnum.values()[languageIndex]
    }

    fun edit() {
        val language = chooseLanguage()
        "Please insert text".log()
        val text = scanner.next()
        "Please insert new word to edit".log()
        val newText = scanner.next()
        LocalesDataController.edit(language.key, text, newText)
    }


    private

    fun String.log() {
        println(this)
    }
}