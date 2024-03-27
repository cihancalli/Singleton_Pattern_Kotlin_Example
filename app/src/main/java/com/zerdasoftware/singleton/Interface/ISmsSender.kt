package com.zerdasoftware.singleton.Interface

interface ISmsSender {

    fun sendMessage(phone:String,message:String)
}