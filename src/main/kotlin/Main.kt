import src.main.kotlin.lectio.Topic
import src.main.kotlin.lectio.Study

fun main() {
    val numbers = Topic(key = "numbers", title = "Numbers")

    numbers.assignStudy(Study("Basic operations", "# Basic operations"))
    numbers.assignStudy(Study("Advanced operations", "# Modulo division"))

    val strings = Topic(key = "strings", title = "Strings")

    strings.assignStudy(Study("Basic operations", "# Basic operations"))

    val topics = arrayOf<Topic>(numbers, strings)

    topics.forEach {
        println(it.title)

        for (study in it.studies) {
            println("\t${study.title}")
        }
    }
}