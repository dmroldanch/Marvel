package com.aptivist.marvel.presentation

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aptivist.marvel.core.utils.Resource
import com.aptivist.marvel.domain.models.Result
import com.aptivist.marvel.domain.repository.RemoteRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel (private val repository: RemoteRepository) : ViewModel(){
    private var _charactersList = mutableStateListOf<Result>()
    val charactersList: List<Result> get() = _charactersList

    init {
        getCharacters()
    }

    private fun getCharacters() {
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
                Log.e("Exception", e.message.toString())
            }
        }
    }
}