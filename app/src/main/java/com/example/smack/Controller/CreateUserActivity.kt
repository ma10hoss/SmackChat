package com.example.smack.Controller

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.smack.R
import kotlinx.android.synthetic.main.activity_create_user.*
import java.util.*

class CreateUserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
    }
    var userAvatar = "profileDefault"
    var avatarColor = "[0.5, 0.5, 0.5, 1]"

    fun generateUserAvatar (view: View){
        val random = Random()
        val color = random.nextInt(2)
        val avatar = random.nextInt(28)

        if (color == 0) {
            userAvatar = "light$avatar"
        }else{
            userAvatar = "dark$avatar"
        }
        val resourceID = resources.getIdentifier(userAvatar, "drawable", packageName)
        createAvatarImageView.setImageResource(resourceID)
    }
    fun generateColorClicked(view: View){
        val random = Random()
        val r= random.nextInt(255)
        val g= random.nextInt(255)
        val b= random.nextInt(255)

        createAvatarImageView.setBackgroundColor(Color.rgb(r,g,b))

        val savedR = r.toDouble() / 255

        val savedG = g.toDouble() / 255

        val savedB = b.toDouble() / 255

        avatarColor = "[$savedR,$savedG,$savedB, 1 ]"
        println(avatarColor)
    }

    fun createUserClicked (view: View){

    }
}
