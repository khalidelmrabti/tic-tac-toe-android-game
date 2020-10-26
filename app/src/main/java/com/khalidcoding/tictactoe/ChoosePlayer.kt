package com.khalidcoding.tictactoe

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
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
            intent.putExtra("gameMode", FRIENDS)
            startActivity(intent)
        }


        play_with_ai.setOnClickListener{
            onCreateDialog().show()
        }




    }

fun onCreateDialog(): Dialog {
    return this.let {
        val builder = AlertDialog.Builder(it)
        builder.setTitle("Choose one:")
            .setItems(
                arrayOf("Simple","Smart"),
                DialogInterface.OnClickListener { dialog, which ->
                    // Interpret user input
                    interpretLevels(this,which)
                })
        builder.create()
    } ?: throw IllegalStateException("Activity cannot be null")
}

fun interpretLevels(context: Context, position: Int) {
    val intent = Intent(context, BoardActivity::class.java)
    when (position) {
        0 -> {
            intent.putExtra("level",AiLevels.SIMPLE)
            intent.putExtra("gameMode", AI)
            context.startActivity(intent)
        }
        1 -> {
            intent.putExtra("level",AiLevels.SMART)
            intent.putExtra("gameMode", AI)
            context.startActivity(intent)
        }

    }

}

}

