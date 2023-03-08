package com.example.codeschoolhomework.homework2

import java.util.*

class TranslationManager {
    private val scanner = Scanner(System.`in`)
    private var locale: LocalesEnum? = null

    fun start() {
        if (locale == null) {
            "We have \n${LocalesEnum.values()}\navailable languages".log()
            "Please insert language key(alpha2)".log()
            locale = LocalesEnum.from(scanner.nextLine())
        }

        "Please, input action".log()
        when (TranslationActionEnum.from(scanner.next())) {
            TranslationActionEnum.ADD -> addTranslation()
            TranslationActionEnum.GET -> getTranslation()
            TranslationActionEnum.REMOVE -> remove()
            TranslationActionEnum.EDIT -> edit()
            TranslationActionEnum.CHANGE_LOCALE -> changeLocale()
            TranslationActionEnum.UNDEFINED -> {
                "Wrong action".log()
                start()
            }
        }
        start()
    }

    private fun changeLocale() {
        "We have \n${LocalesEnum.values()}\navailable languages".log()
        "Please insert language key(alpha2)".log()
        locale = LocalesEnum.from(scanner.nextLine())
    }

    private fun addTranslation() {
        "Please insert text".log()
        val text = scanner.next()

        locale?.alpha2?.let {
            val translatedText = LocalesDataController.add(it, text)
            "text: $text , translate: $translatedText".log()
        }
    }

    private fun getTranslation() {
        "Please insert text".log()
        val text = scanner.next()

        locale?.alpha2?.let {
            val translatedText = LocalesDataController.get(it, text)
            "text: $text , translate: $translatedText".log()
        }
    }

    private fun remove() {
        "Please insert text".log()
        val text = scanner.next()

        locale?.alpha2?.let {
            LocalesDataController.remove(it, text)
        }
    }

    private fun edit() {
        "Please insert text".log()
        val text = scanner.next()
        "Please insert new word to edit".log()
        val newText = scanner.next()
        locale?.alpha2?.let {
            LocalesDataController.edit(it, text, newText)
        }
    }

    private fun String.log() {
        println(this)
    }
}