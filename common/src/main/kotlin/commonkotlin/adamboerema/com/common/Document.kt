package commonkotlin.adamboerema.com.common

data class Document(
        val revisions: Array<Revision>
) {

    fun getLatestRevision(): Revision? {
        return revisions.filter { !it.name.isEmpty() }
                .sortedByDescending { it.order }
                .first()
    }
}