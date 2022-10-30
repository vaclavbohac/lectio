import java.lang.Exception

class StudyAlreadyPublishedException(title: String): Exception("Study '$title' already published") {}
class StudyAlreadyUnpublishedException(title: String): Exception("Study '$title' already unpublished") {}

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