package com.zerdasoftware.singleton.model

import com.zerdasoftware.singleton.Interface.ISmsSender

class Turkcell : ISmsSender {

    private fun turkcellSendSMS(phone: String, message: String) {
        println("turkcell $phone : $message")
    }

    override fun sendMessage(phone: String, message: String) {
        turkcellSendSMS(phone,message)
    }

}