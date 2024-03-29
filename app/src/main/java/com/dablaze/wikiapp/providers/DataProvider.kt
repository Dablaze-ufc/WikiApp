package com.dablaze.wikiapp.providers

import com.dablaze.wikiapp.models.Urls
import com.dablaze.wikiapp.models.WikiResult
import com.github.kittinunf.fuel.core.FuelManager
import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.github.kittinunf.fuel.httpGet
import com.google.gson.Gson
import java.io.Reader


class DataProvider {
    init {
        FuelManager.instance.baseHeaders = mapOf("User-Agent" to "Dablaze wikipedia")
    }

    fun search(term: String, skip: Int, take: Int, responseHandler: (result: WikiResult) -> Unit?) {
        Urls.getsearchUrl(term, skip, take).httpGet()
            .responseObject(WikiDataDeserialzer()) { _, response, result ->
                if (response.statusCode != 200) {
                    throw Exception("Unable to get articles")
                }
                val (data, _) = result
                responseHandler.invoke(data as WikiResult)
            }
    }

    fun getRandom(take: Int, responseHandler: (result: WikiResult) -> Unit?) {
        Urls.getRandomUrl(take).httpGet()
            .responseObject(WikiDataDeserialzer()) { _, response, result ->
                if (response.statusCode != 200) {
                    throw Exception("Unable to get articles")
                }
                val (data, _) = result
                responseHandler.invoke(data as WikiResult)
            }
    }

    class WikiDataDeserialzer : ResponseDeserializable<WikiResult> {
        override fun deserialize(reader: Reader) = Gson().fromJson(reader, WikiResult::class.java)
    }
}
