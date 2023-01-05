package com.example.designpaternpractise.structural.facade

import com.example.designpaternpractise.structural.facade.BitrateReader.convert
import com.example.designpaternpractise.structural.facade.BitrateReader.read
import java.io.File

class VideoFile(var name: String) {
    val codecType: String = name.substring(name.indexOf(".") + 1)
}

interface Codec

class MPEG4CompressionCodec : Codec {
    val type: String = "mp4"
}

class OggCompressionCodec : Codec {
    var type = "ogg"
}

object CodecFactory {
    fun extract(file: VideoFile): Codec {
        return if (file.codecType == "mp4") {
            println("CodecFactory: extracting mpeg audio...")
            MPEG4CompressionCodec()
        } else {
            println("CodecFactory: extracting ogg audio...")
            OggCompressionCodec()
        }
    }
}

class VideoConversionFacade {

    fun convertVideo(fileName: String, format: String) :File {

        println("VideoConversionFacade: conversion started.")
        val videoFile = VideoFile(fileName)
        val sourceCode = CodecFactory.extract(videoFile)
        var destinationCode: Codec = if (format == "mp4")
            MPEG4CompressionCodec()
        else
            OggCompressionCodec()

        val buffer = read(videoFile, sourceCode)
        val intermediateResult = convert(buffer, destinationCode)
        val result = AudioMixer().fix(intermediateResult)
        println("VideoConversionFacade: conversion completed.")
        return result

    }
}

fun main() {
    val converter = VideoConversionFacade()
    val mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4")
}


object BitrateReader {
    fun read(file: VideoFile, codec: Codec?): VideoFile {
        println("BitrateReader: reading file...")
        return file
    }

    fun convert(buffer: VideoFile, codec: Codec?): VideoFile {
        println("BitrateReader: writing file...")
        return buffer
    }
}


class AudioMixer {
    fun fix(result: VideoFile?): File {
        println("AudioMixer: fixing audio...")
        return File("tmp")
    }
}