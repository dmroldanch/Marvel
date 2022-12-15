package com.aptivist.marvel.presentation

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aptivist.marvel.core.utils.Resource
import com.aptivist.marvel.domain.models.Result
import com.aptivist.marvel.domain.repository.RemoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: RemoteRepository
) : ViewModel(){

    private var _charactersList = mutableStateListOf<Result>()
    val charactersList: List<Result> get() = _charactersList


    init {
        getCharacters()
    }

    fun getCharacters() {
       // _viewState.value = HomeViewState.Loading
        _charactersList.clear()
        viewModelScope.launch(Dispatchers.IO) {
            try {
                when (val result = repository.getCharacters()) {
                    is Resource.Failure -> {
                        Log.e("Error",result.message.toString())
                    }

                    is Resource.Success -> {
                        _charactersList.clear()
                        _charactersList.addAll(result.data)
                    }
                }
            } catch (e: Exception) {
             //   ListUIEvents.ShowErrorEvent(e.message ?: stringProvider.getString(R.string.unknown))
            } finally {
             //   _viewState.value = HomeViewState.Idle
            }
        }
    }
}