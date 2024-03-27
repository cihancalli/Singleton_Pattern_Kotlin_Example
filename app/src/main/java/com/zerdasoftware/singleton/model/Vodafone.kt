package com.zerdasoftware.singleton.model

import com.zerdasoftware.singleton.Interface.ISmsSender

class Vodafone : ISmsSender {

    private fun vodafoneSendSMS(phone: String, message: String) {
        println("vodafone $phone : $message")
    }

    override fun sendMessage(phone: String, message: String) {
        vodafoneSendSMS(phone,message)
    }
}