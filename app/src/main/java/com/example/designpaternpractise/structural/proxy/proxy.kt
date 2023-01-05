package com.example.designpaternpractise.structural

fun main() {

    val youTubeCacheProxy=YouTubeCacheProxy(ThirdPartyYouTubeImp())

    //not in cache
    youTubeCacheProxy.getVideo("11111")
    youTubeCacheProxy.popularVideos()
}

interface ThirdPartyYouTubeLib {
    fun popularVideos(): HashMap<String, Video>
    fun getVideo(videoId: String): Video

}

class ThirdPartyYouTubeImp : ThirdPartyYouTubeLib {
    override fun popularVideos(): HashMap<String, Video> {
        connectToServer("http://www.youtube.com")
        return hashMapOf<String, Video>(
            "1" to Video("43", "sdf", "ww"),
            "2" to Video("12", "sdfa", "ww"),)
    }

    override fun getVideo(videoId: String): Video {
        connectToServer("http://www.youtube.com")
        return Video(videoId, "test", "some value");
    }

    private fun connectToServer(s: String) {
        println("connectin to $s")
        Thread.sleep(100)
        println("connected to $s")

    }
}

data class Video(val id: String, val title: String, val data: String)

class YouTubeCacheProxy(private val thirdPartyYouTubeLib: ThirdPartyYouTubeLib) : ThirdPartyYouTubeLib {

    private var cachePopular = HashMap<String, Video>()
    private var cacheAl = HashMap<String, Video>()
    override fun popularVideos(): HashMap<String, Video> {
        if (cachePopular.isEmpty()) {
            cachePopular = thirdPartyYouTubeLib.popularVideos()
        }
        return cachePopular
    }
    override fun getVideo(videoId: String): Video {
        var video = cacheAl[videoId]
        if (video == null) {
            video = thirdPartyYouTubeLib.getVideo(videoId)
            cacheAl[videoId] = video
        }
        return video
    }
    fun reset(){
        cachePopular.clear()
        cacheAl.clear()
    }
}