package src.test.kotlin.lectio

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import src.main.kotlin.lectio.Topic
import src.main.kotlin.lectio.Study

internal class TopicTest {
    @Test
    fun assignStudy() {
        val topic = Topic("foo", "Foo")
        topic.assignStudy(Study("bar", "Bar"))

        assertEquals(1, topic.studies.size)
    }
}