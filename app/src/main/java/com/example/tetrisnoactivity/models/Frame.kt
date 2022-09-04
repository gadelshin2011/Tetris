package com.example.tetrisnoactivity.models

import com.example.tetrisnoactivity.helper.array2dofByte

class Frame(private val width: Int) {
    private val data: ArrayList<ByteArray> = ArrayList()
    fun addRow(byteStr: String): Frame {
        val row = ByteArray(byteStr.length)
        for (index in byteStr.indices) {
            row[index] = "${byteStr[index]}".toByte()
        }
        data.add(row)
        return this
    }

    fun as2ByteArray(): Array<ByteArray> {
        val bytes = array2dofByte(data.size, width)
        return data.toArray(bytes)
    }

}