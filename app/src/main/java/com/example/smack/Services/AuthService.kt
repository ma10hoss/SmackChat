package com.example.smack.Services

import android.content.Context
import com.example.smack.Utilities.URL_REGISTER

object AuthService {

 fun registerUSer(context: Context, email: String, password:String, complete: (Boolean) ->Unit){
     val url = URL_REGISTER

     val JsonBody = JSONObject()
     JsonBody.put("email,",email)
 }

}