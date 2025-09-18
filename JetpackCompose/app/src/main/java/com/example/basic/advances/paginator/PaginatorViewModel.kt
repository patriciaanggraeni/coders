package com.example.basic.advances.paginator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

data class ScreenState(
    val isLoading: Boolean = false,
    val items: List<ListItem> = emptyList(),
    val error: String? = null,
    val endReached: Boolean = false,
    val page: Int = 0
)

class PaginatorViewModel : ViewModel() {

//    var state by mutableStateOf(ScreenState())
//
//    private val paginator = DefaultPaginator(
//        initialKey = state.page,
//        onLoadingUpdated = {
//            state = state.copy(isLoading = it)
//        },
//        onRequest = { nextPage ->
//
//        },
//        getNextKey = {
//            state.page + 1
//        },
//        onError = {
//            state = state.copy(error = it?.localizedMessage)
//        },
//        onSuccess = { items, newKey ->
//            state = state.copy(
//                items = state.items + items,
//                page = newKey,
//                endReached = items.isEmpty()
//            )
//        }
//    )

}