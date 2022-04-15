package com.example.myapplication.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.repository.Repository
import com.example.myapplication.model.beznal.Beznal
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel: ViewModel() {
    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Beznal>> = MutableLiveData()

    fun getBezNalMoney(){
        viewModelScope.launch {
            myMoneyList.value = repo.getBezNal()
        }
    }
}