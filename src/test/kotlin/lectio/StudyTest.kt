package src.test.kotlin.lectio

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import src.main.kotlin.lectio.Study
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

    private fun subject(): Study {
        return Study("Numbers", "# Numbers")
    }
}