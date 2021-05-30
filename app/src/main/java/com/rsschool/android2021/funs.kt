package com.rsschool.android2021

fun checkInput(min:String,max:String):Boolean{
    if (min == "") return false
    if (max == "") return false
    if (min.toLong() > 2147483647) return false
    if (max.toLong() > 2147483647) return false
    if (min.toInt() >= max.toInt()) return false
    return true
}
