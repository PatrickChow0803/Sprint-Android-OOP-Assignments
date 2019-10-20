package com.patrickchow.design.viewmodel

import android.text.TextUtils
import android.util.Patterns
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR
import com.patrickchow.design.model.User

class LoginViewModel:BaseObservable(){

    private var user: User = User("", "")
    private val successMessage = "Login succeeded"
    private val failureMessage = "Login failed"

    @Bindable
    var toastMessage: String ?= null
        //Notify the observer that a change happened
        set(value){
            field = value
            notifyPropertyChanged(BR.toastMessage)

        }

    @Bindable
    fun getUserEmail(): String?{
        return user.email
    }

    @Bindable
    fun getUserPassword(): String?{
        return user.password
    }

    fun setUserEmail(email: String){
        user.email = email
        notifyPropertyChanged(BR.userEmail)
    }

    fun setUserPassword(password: String){
        user.password = password
        notifyPropertyChanged(BR.userPassword)
    }

    fun onLoginClicked(){
        toastMessage =  if(isValid()){
            successMessage
        }
        else{
            failureMessage
        }
    }

    fun isValid(): Boolean{
                //Make sure that the email isn't empty
        return  !TextUtils.isEmpty(getUserEmail()) &&

                //Make sure it's in a typical email address pattern
                Patterns.EMAIL_ADDRESS.matcher(getUserEmail()).matches() &&

                //Make sure that the length of the password is greater than 7
                (getUserPassword()?.length ?: 0) >  7
    }
}