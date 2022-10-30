package src.main.kotlin.lectio.exceptions

class StudyAlreadyUnpublishedException(title: String): Exception("Study '$title' already unpublished") {}