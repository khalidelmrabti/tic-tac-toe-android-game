package com.khalidcoding.tictactoe

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.choose_player.*

/**
 * Created by KHALID EL MRABTI / Khalid Coding on 30/05/20.
 */
class ChoosePlayer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.choose_player)

        play_with_friends.setOnClickListener{
            val intent = Intent(this,BoardActivity::class.java)
            intent.putExtra("gameMode", friends)
            startActivity(intent)
        }


        play_with_ai.setOnClickListener{
            val intent = Intent(this,BoardActivity::class.java)
            intent.putExtra("gameMode", AI)
            startActivity(intent)
        }




    }
}
