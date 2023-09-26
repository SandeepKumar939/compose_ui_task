package com.example.sandeep_kumar_task.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sandeep_kumar_task.model.User
import com.example.sandeep_kumar_task.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(private var userRepository: UserRepository) : ViewModel() {


    val users: StateFlow<List<User>>
        get() = userRepository.users

    /**
     * here fetching the data from USER REPOSITORY
     */
    init {
        viewModelScope.launch {
            userRepository.getUsers()

        }
    }
}