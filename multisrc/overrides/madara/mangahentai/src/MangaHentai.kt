package eu.kanade.tachiyomi.extension.en.mangahentai

import eu.kanade.tachiyomi.multisrc.madara.Madara
import eu.kanade.tachiyomi.annotations.Nsfw


@Nsfw
class MangaHentai : Madara("Manga Hentai", "https://mangahentai.me", "en") {
    override val useNewChapterEndpoint: Boolean = true
}