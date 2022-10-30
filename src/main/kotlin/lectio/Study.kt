package src.main.kotlin.lectio

import src.main.kotlin.lectio.exceptions.StudyAlreadyPublishedException
import src.main.kotlin.lectio.exceptions.StudyAlreadyUnpublishedException

data class Study(val title: String, val content: String, var isPublished: Boolean = false) {
    fun publish() {
        if (isPublished) {
            throw StudyAlreadyPublishedException(title = title)
        }

        isPublished = true
    }

    fun unpublish() {
        if (!isPublished) {
            throw StudyAlreadyUnpublishedException(title = title)
        }

        isPublished = false
    }
}