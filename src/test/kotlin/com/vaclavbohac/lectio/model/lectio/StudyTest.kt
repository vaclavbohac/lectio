package src.test.kotlin.com.vaclavbohac.lectio.model.lectio

import com.vaclavbohac.lectio.model.lectio.Study
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import src.main.kotlin.lectio.exceptions.StudyAlreadyPublishedException
import src.main.kotlin.lectio.exceptions.StudyAlreadyUnpublishedException

internal class StudyTest {
    @Test
    fun studyIsByDefaultUnpublished() {
        assertEquals(false, subject().isPublished)
    }

    @Test
    fun studyCanBePublished() {
        val s = subject()

        s.publish()

        assertEquals(true, s.isPublished)
    }

    @Test
    fun studyCannotBePublishedTwice() {
        val s = subject()

        val exception: Exception = assertThrows(StudyAlreadyPublishedException::class.java) {
            s.publish()
            s.publish()
        }

        assertEquals("Study 'Numbers' already published", exception.message)
    }

    @Test
    fun studyCanBeUnpublished() {
        val s = subject()

        s.publish()
        s.unpublish()

        assertEquals(false, s.isPublished)
    }


    @Test
    fun studyCannotBeUnpublishedTwice() {
        val s = subject()

        val exception: Exception = assertThrows(StudyAlreadyUnpublishedException::class.java) {
            s.unpublish()
        }

        assertEquals("Study 'Numbers' already unpublished", exception.message)
    }

    @Test
    fun studyDoesntHaveVideoByDefault() {
        val s = subject()

        assertEquals(false, s.hasVideo())
    }

    @Test
    fun studyHasVideoIfVideoUrlIsSet() {
        val s = Study("Numbers", "# Numbers", "https://example.com")

        assertEquals(true, s.hasVideo())
    }

    private fun subject(): Study {
        return Study("Numbers", "# Numbers")
    }
}