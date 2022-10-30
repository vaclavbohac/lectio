import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TopicTest {
    @Test
    fun assignStudy() {
        val topic = Topic("foo", "Foo")
        topic.assignStudy(Study("bar", "Bar"))

        assertEquals(1, topic.studies.size)
    }
}