package com.patrickchow.design.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import com.patrickchow.design.R
import com.patrickchow.design.databinding.ActivityLoginBinding
import com.patrickchow.design.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity() {

    //private val viewModel = LoginViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Sets up the bind
        val binding = DataBindingUtil.setContentView<ActivityLoginBinding>(this, R.layout.activity_login)
        binding.viewModel = LoginViewModel()
        binding.executePendingBindings()

    }

    companion object{
        @BindingAdapter("toastMessage")
        @JvmStatic
        fun showToast(view: View, message: String?){
            message.let {
                Toast.makeText(view.context, it, Toast.LENGTH_SHORT).show()
            }
        }
    }
}


/*
How the login would normally be done
button.setOnClickListener {
            val message = viewModel.onLoginClicked()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }

        inEmail.addTextChangedListener(object: )*/