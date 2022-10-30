data class Topic(val key: String, val title: String, val studies: MutableList<Study> = mutableListOf()) {
    fun assignStudy(study: Study) {
        studies.add(study)
    }
}