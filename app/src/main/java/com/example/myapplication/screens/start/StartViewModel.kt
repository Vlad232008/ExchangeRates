package com.example.myapplication.screens.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.repository.Repository
import com.example.myapplication.model.curse.Kurse
import com.example.myapplication.model.nal.Nalichka
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel:ViewModel() {

    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Kurse>> = MutableLiveData()

    fun getNalMoney(){
        viewModelScope.launch {
            myMoneyList.value = repo.getNal()
        }
    }
}