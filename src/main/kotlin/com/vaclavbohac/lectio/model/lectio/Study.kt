package com.vaclavbohac.lectio.model.lectio

import src.main.kotlin.lectio.exceptions.StudyAlreadyPublishedException
import src.main.kotlin.lectio.exceptions.StudyAlreadyUnpublishedException

data class Study(val title: String, val content: String, var videoUrl: String = "", var isPublished: Boolean = false) {
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

    fun hasVideo(): Boolean {
        return videoUrl.isNotEmpty()
    }
}