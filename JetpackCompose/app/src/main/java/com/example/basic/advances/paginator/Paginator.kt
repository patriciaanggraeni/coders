package com.example.basic.advances.paginator

interface Paginator<Key, Item> {
    suspend fun loadNextItem()
    fun reset()
}

data class ListItem(
    val title: String,
    val description: String
)

class DefaultPaginator<Key, Item>(
    private val initialKey: Key,
    private inline val onLoadingUpdated: (Boolean) -> Unit,
    private inline val onRequest: suspend (nextKey: Key) -> Result<List<Item>>,
    private inline val getNextKey: suspend (List<Item>) -> Key,
    private inline val onError: suspend (Throwable?) -> Unit,
    private inline val onSuccess: suspend (items: List<Item>, newKey: Key) -> Unit
): Paginator<Key, Item> {

    private var currentKey = initialKey
    private var isMakingRequest = false

    override suspend fun loadNextItem() {
        if (isMakingRequest) { return }

        isMakingRequest = true
        onLoadingUpdated(true)

        val result = onRequest(currentKey)
        isMakingRequest = false

        val items = result.getOrElse {
            onError(it)
            onLoadingUpdated(false)
            return
        }

        currentKey = getNextKey(items)
        onSuccess(items, currentKey)
        onLoadingUpdated(false)
    }

    override fun reset() {
        currentKey = initialKey
    }

}