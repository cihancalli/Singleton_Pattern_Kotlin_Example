package com.zerdasoftware.singleton.model

import com.zerdasoftware.singleton.Interface.IMailSender
import com.zerdasoftware.singleton.Interface.ISmsSender

class TurkTelekom  : ISmsSender ,IMailSender {
    private fun turkTelekomSendSMS(phone: String, message: String) {
        println("Turk Telekom $phone : $message")
    }

    override fun sendMessage(phone: String, message: String) {
        turkTelekomSendSMS(phone,message)
    }

    override fun sendMail(mail: String, message: String) {
        println("Turk Telekom $mail : $message")
    }
}