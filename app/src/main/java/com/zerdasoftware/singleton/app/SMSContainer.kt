package com.zerdasoftware.singleton.app

import com.zerdasoftware.singleton.Interface.ISmsSender
import com.zerdasoftware.singleton.factory.SmsSenderFactory
import com.zerdasoftware.singleton.model.Vodafone

object SMSContainer {

    private val smsSender: ISmsSender = Vodafone()
    private val smsSenderFactory: SmsSenderFactory = SmsSenderFactory()

    fun getSmsSender(phone: String): ISmsSender {
        return smsSenderFactory.createSender(phone)
    }
}