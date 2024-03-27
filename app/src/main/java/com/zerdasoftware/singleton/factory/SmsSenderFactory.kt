package com.zerdasoftware.singleton.factory

import com.zerdasoftware.singleton.Interface.ISmsSender
import com.zerdasoftware.singleton.model.TurkTelekom
import com.zerdasoftware.singleton.model.Turkcell
import com.zerdasoftware.singleton.model.Vodafone

class SmsSenderFactory  {

    fun createSender(phone: String): ISmsSender {

        val firstChar = phone[1]

        println("firstChar: $firstChar")

        return when (firstChar) {
            '4' -> Vodafone()
            '5' -> TurkTelekom()
            else -> Turkcell()
        }
    }
}