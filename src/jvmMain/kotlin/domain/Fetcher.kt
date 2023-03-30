package domain

import com.google.gson.Gson
import common.MAIN_URL
import domain.model.Channel
import domain.model.Tv
import org.http4k.client.JavaHttpClient
import org.http4k.core.HttpHandler
import org.http4k.core.Method
import org.http4k.core.Request

fun fetch():String{
    val request = Request(Method.GET, MAIN_URL)

    val client: HttpHandler = JavaHttpClient()

    val result = client(request)
    println()
    return result.bodyString()
}

fun getTv(jsonTv:String):String{
    val tv = Gson().fromJson(jsonTv, Tv::class.java)
    println(jsonTv)
    if (tv == null) {
        return "nan"
    }
    return tv.channels.size.toString()
}