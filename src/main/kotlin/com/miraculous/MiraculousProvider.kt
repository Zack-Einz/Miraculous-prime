package com.miraculous

import com.lagradost.cloudstream3.*

class MiraculousProvider : MainAPI() {
    override var mainUrl = "https://miraculous.to"
    override var name = "Miraculous"
    override val supportedTypes = setOf(TvType.Cartoon)

    override suspend fun search(query: String): List<SearchResponse> {
        return listOf(
            TvSeriesSearchResponse(
                "Ejemplo Miraculous",
                mainUrl,
                this.name,
                TvType.Cartoon,
                false
            )
        )
    }
}
