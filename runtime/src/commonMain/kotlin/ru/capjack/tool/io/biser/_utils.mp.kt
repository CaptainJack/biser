package ru.capjack.tool.io.biser

internal expect fun String.charCodeAt(index: Int): Int

internal expect fun ByteArray.decodeToUtf8String(offset: Int, length: Int): String