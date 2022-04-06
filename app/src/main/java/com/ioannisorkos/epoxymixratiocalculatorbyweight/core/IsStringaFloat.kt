package com.ioannisorkos.epoxymixratiocalculatorbyweight.core

fun String.isFloat() : Boolean {
    val regex = """^(-)?[0-9]{0,}((\.){1}[0-9]{0,}){0,1}$""".toRegex()
    return if (this.isNullOrEmpty()) false
    else regex.matches(this)
}


