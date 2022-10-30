package src.main.kotlin.lectio.exceptions

import java.lang.Exception

class StudyAlreadyPublishedException(title: String): Exception("Study '$title' already published") {}