import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

fun main() {
    val url = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"
    val doc: Document = Jsoup.connect(url).get()
    val elements: Elements = doc.select(QUOTE_CSS_CLASS)

    for(element in elements) {
        println(element.text())
    }
}

const val QUOTE_CSS_CLASS = ".sc-2aegk7-2"