package com.project.ousontlestoilettes.viewmodels

class HomeViewModel {
}

//@HiltViewModel
//class UserViewModel @Inject constructor(
//    private val getUserUseCase: GetUserUseCase
//) : ViewModel() {
//
//    private val _state = MutableStateFlow(UserUiState())
//    val state = _state.asStateFlow()
//
//    fun loadUser(id: String) {
//        viewModelScope.launch {
//            val user = getUserUseCase(id)
//            _state.value = UserUiState(user.name)
//        }
//    }
//}