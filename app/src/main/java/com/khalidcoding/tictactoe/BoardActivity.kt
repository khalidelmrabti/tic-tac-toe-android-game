package com.khalidcoding.tictactoe

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_board.*
import java.util.*

/**
 * Created by KHALID EL MRABTI / Khalid Coding on 30/05/20.
 */

class BoardActivity : AppCompatActivity(),View.OnClickListener {
    lateinit var gameMode: GameMode
    var currentPlayer = PLAYER1
    var scoreXPlayer = 0
    var scoreOPlayer = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_board)

        // get game mode
        if (intent.extras!=null){
            when(intent.extras!!["gameMode"]){
                AI->{
                    gameMode = GameMode.PLAY_WITH_AI
                    labelOScore.text = "AI: $scoreOPlayer"
                    labelXScore.text = "PLAYER1: $scoreXPlayer"
                }
                friends->{
                    gameMode = GameMode.PLAY_WITH_FRIENDS
                    labelOScore.text = "PLAYER2: $scoreOPlayer"
                    labelXScore.text = "PLAYER1: $scoreXPlayer"
                }
            }
        }

        btn_1.setOnClickListener(this)
        btn_2.setOnClickListener(this)
        btn_3.setOnClickListener(this)
        btn_4.setOnClickListener(this)
        btn_5.setOnClickListener(this)
        btn_6.setOnClickListener(this)
        btn_7.setOnClickListener(this)
        btn_8.setOnClickListener(this)
        btn_9.setOnClickListener(this)
        reset_btn.setOnClickListener(this)
        back.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        if(view?.id==R.id.reset_btn){
            reset(board)
        }else if(view?.id==R.id.back){
            super.onBackPressed()
        }else{
            playGame(view?.id,currentPlayer)
        }
    }

    private fun playGame(id: Int?, player: Char?) {
        when(id){
            R.id.btn_1->{
               if(gameMode==GameMode.PLAY_WITH_FRIENDS){
                   if(player== PLAYER1){
                       btn_1.text = "X"
                       board[0][0] = 'x'
                       currentPlayer = PLAYER2
                       btn_1.setTextColor(Color.parseColor("#FF0000"))
                       btn_1.isEnabled = false
                   }else{
                       btn_1.text = "O"
                       board[0][0] = 'o'
                       currentPlayer = PLAYER1
                       btn_1.setTextColor(Color.parseColor("#FFFF00"))
                       btn_1.isEnabled = false
                   }
               }else{
                   if(player== PLAYER1){
                       btn_1.text = "X"
                       board[0][0] = 'x'
                       currentPlayer = AI
                       btn_1.setTextColor(Color.parseColor("#FF0000"))
                       btn_1.isEnabled = false
                   }
               }
            }
            R.id.btn_2->{
                if(gameMode==GameMode.PLAY_WITH_FRIENDS){
                    if(player== PLAYER1){
                        btn_2.text = "X"
                        board[0][1] = 'x'
                        currentPlayer = PLAYER2
                        btn_2.setTextColor(Color.parseColor("#FF0000"))
                        btn_2.isEnabled = false
                    }else{
                        btn_2.text = "O"
                        board[0][1] = 'o'
                        currentPlayer = PLAYER1
                        btn_2.setTextColor(Color.parseColor("#FFFF00"))
                        btn_2.isEnabled = false
                    }
                }else{
                    if(player== PLAYER1){
                        btn_2.text = "X"
                        board[0][1] = 'x'
                        currentPlayer = AI
                        btn_2.setTextColor(Color.parseColor("#FF0000"))
                        btn_2.isEnabled = false
                    }
                }
            }
            R.id.btn_3->{
                if(gameMode==GameMode.PLAY_WITH_FRIENDS){
                    if(player== PLAYER1){
                        btn_3.text = "X"
                        board[0][2] = 'x'
                        currentPlayer = PLAYER2
                        btn_3.setTextColor(Color.parseColor("#FF0000"))
                        btn_3.isEnabled = false
                    }else{
                        btn_3.text = "O"
                        board[0][2] = 'o'
                        currentPlayer = PLAYER1
                        btn_3.setTextColor(Color.parseColor("#FFFF00"))
                        btn_3.isEnabled = false
                    }
                }else{
                    if(player == PLAYER1){
                        btn_3.text = "X"
                        board[0][2] = 'x'
                        currentPlayer = AI
                        btn_3.setTextColor(Color.parseColor("#FF0000"))
                        btn_3.isEnabled = false

                    }
                }
            }
            R.id.btn_4->{
                if(gameMode==GameMode.PLAY_WITH_FRIENDS){
                    if(player== PLAYER1){
                        btn_4.text = "X"
                        board[1][0] = 'x'
                        currentPlayer = PLAYER2
                        btn_4.setTextColor(Color.parseColor("#FF0000"))
                        btn_4.isEnabled = false
                    }else{
                        btn_4.text = "O"
                        board[1][0] = 'o'
                        currentPlayer = PLAYER1
                        btn_4.setTextColor(Color.parseColor("#FFFF00"))
                        btn_4.isEnabled = false
                    }
                }else{
                    if(player== PLAYER1){
                        btn_4.text = "X"
                        board[1][0] = 'x'
                        currentPlayer = AI
                        btn_4.setTextColor(Color.parseColor("#FF0000"))
                        btn_4.isEnabled = false
                    }
                }
            }
            R.id.btn_5->{
                if(gameMode==GameMode.PLAY_WITH_FRIENDS){
                    if(player== PLAYER1){
                        btn_5.text = "X"
                        board[1][1] = 'x'
                        currentPlayer = PLAYER2
                        btn_5.setTextColor(Color.parseColor("#FF0000"))
                        btn_5.isEnabled = false
                    }else{
                        btn_5.text = "O"
                        board[1][1] = 'o'
                        currentPlayer = PLAYER1
                        btn_5.setTextColor(Color.parseColor("#FFFF00"))
                        btn_5.isEnabled = false
                    }
                }else{
                    if(player== PLAYER1){
                        btn_5.text = "X"
                        board[1][1] = 'x'
                        currentPlayer = AI
                        btn_5.setTextColor(Color.parseColor("#FF0000"))
                        btn_5.isEnabled = false
                    }
                }
            }
            R.id.btn_6->{
                if(gameMode==GameMode.PLAY_WITH_FRIENDS){
                    if(player== PLAYER1){
                        btn_6.text = "X"
                        board[1][2] = 'x'
                        currentPlayer = PLAYER2
                        btn_6.setTextColor(Color.parseColor("#FF0000"))
                        btn_6.isEnabled = false
                    }else{
                        btn_6.text = "O"
                        board[1][2]  = 'o'
                        currentPlayer = PLAYER1
                        btn_6.setTextColor(Color.parseColor("#FFFF00"))
                        btn_6.isEnabled = false

                    }
                }else{
                    if(player== PLAYER1){
                        btn_6.text = "X"
                        board[1][2]  = 'x'
                        currentPlayer = AI
                        btn_6.setTextColor(Color.parseColor("#FF0000"))
                        btn_6.isEnabled = false
                    }
                }
            }
            R.id.btn_7->{
                if(gameMode==GameMode.PLAY_WITH_FRIENDS){
                    if(player== PLAYER1){
                        btn_7.text = "X"
                        board[2][0] = 'x'
                        currentPlayer = PLAYER2
                        btn_7.setTextColor(Color.parseColor("#FF0000"))
                        btn_7.isEnabled = false
                    }else{
                        btn_7.text = "O"
                        board[2][0] = 'o'
                        currentPlayer = PLAYER1
                        btn_7.setTextColor(Color.parseColor("#FFFF00"))
                        btn_7.isEnabled = false
                    }
                }else{
                    if(player== PLAYER1){
                        btn_7.text = "X"
                        board[2][0] = 'x'
                        currentPlayer = AI
                        btn_7.setTextColor(Color.parseColor("#FF0000"))
                    }
                }
            }
            R.id.btn_8->{
                if(gameMode==GameMode.PLAY_WITH_FRIENDS){
                    if(player== PLAYER1){
                        btn_8.text = "X"
                        board[2][1] = 'x'
                        currentPlayer = PLAYER2
                        btn_8.setTextColor(Color.parseColor("#FF0000"))
                        btn_8.isEnabled = false
                    }else{
                        btn_8.text = "O"
                        board[2][1] = 'o'
                        currentPlayer = PLAYER1
                        btn_8.setTextColor(Color.parseColor("#FFFF00"))
                        btn_8.isEnabled = false
                    }
                }else{
                    if(player== PLAYER1){
                        btn_8.text = "X"
                        board[2][1] = 'x'
                        currentPlayer = AI
                        btn_8.setTextColor(Color.parseColor("#FF0000"))
                        btn_8.isEnabled = false
                    }
                }
            }
            R.id.btn_9->{
                if(gameMode==GameMode.PLAY_WITH_FRIENDS){
                    if(player== PLAYER1){
                        btn_9.text = "X"
                        board[2][2] = 'x'
                        currentPlayer = PLAYER2
                        btn_9.setTextColor(Color.parseColor("#FF0000"))
                        btn_9.isEnabled = false
                    }else{
                        btn_9.text = "O"
                        board[2][2] = 'o'
                        currentPlayer = PLAYER1
                        btn_9.setTextColor(Color.parseColor("#FFFF00"))
                        btn_9.isEnabled = false
                    }
                }else{
                    if(player== PLAYER1){
                        btn_9.text = "X"
                        board[2][2] = 'x'
                        currentPlayer = AI
                        btn_9.setTextColor(Color.parseColor("#FF0000"))
                        btn_9.isEnabled = false
                    }
                }
            }
        }

        checkWinner(board)
        aIMove(board,currentPlayer)
    }

    private fun checkWinner(board: Array<CharArray>) {
       if(evaluate(board)!=NOTHING) {
           when(evaluate(board)){
               PLAYER1_WIN ->{
                   scoreXPlayer++
                   Toast.makeText(this,"PLAYER 1 WIN !",Toast.LENGTH_SHORT).show()
                   labelXScore.text = "PLAYER1: $scoreXPlayer"
                   reset(board)
               }
               PLAYER2_WIN ->{
                   scoreOPlayer++
                   Toast.makeText(this,"PLAYER 2 WIN !",Toast.LENGTH_SHORT).show()
                   labelOScore.text = "PLAYER2: $scoreOPlayer"
                   reset(board)
               }
               AI_WIN ->{
                   scoreOPlayer++
                   Toast.makeText(this,"AI WIN !",Toast.LENGTH_SHORT).show()
                   labelOScore.text = "AI: $scoreOPlayer"
                   reset(board)
               }
               TIE ->{
                   Toast.makeText(this,"TIE !",Toast.LENGTH_SHORT).show()
                   reset(board)
               }
           }
       }
    }


    private fun evaluate(board: Array<CharArray>):Int{

        // Checking for Rows for X or O victory

        for (row in 0..2) {
            if (board[row][0] == PLAYER1 && board[row][1] == PLAYER1 && board[row][2] == PLAYER1) {
                return PLAYER1_WIN
            } else if (board[row][0] == PLAYER2 && board[row][1] == PLAYER2 && board[row][2] == PLAYER2&&gameMode==GameMode.PLAY_WITH_FRIENDS) {
                return PLAYER2_WIN
            } else if (board[row][0] == AI && board[row][1] == AI && board[row][2] == AI) {
                return AI_WIN
            }
        }


        // Checking for Columns for X or O victory

        for (col in 0..2) {
            // check if empty cell
            if (board[0][col] == PLAYER1 && board[1][col] == PLAYER1 && board[2][col] == PLAYER1) {
                return PLAYER1_WIN
            } else if (board[0][col] == PLAYER2 && board[1][col] == PLAYER2 && board[2][col] == PLAYER2&&gameMode==GameMode.PLAY_WITH_FRIENDS) {
                return PLAYER2_WIN
            } else if (board[0][col] == AI && board[1][col] == AI && board[2][col] == AI) {
                return AI_WIN
            }

        }

        // Checking for Diagonals for X or O victory.
        if (board[0][0] == PLAYER1 && board[1][1] == PLAYER1 && board[2][2] == PLAYER1) {
            return PLAYER1_WIN
        } else if (board[0][0] == PLAYER2 && board[1][1] == PLAYER2 && board[2][2] == PLAYER2&&gameMode==GameMode.PLAY_WITH_FRIENDS) {
            return PLAYER2_WIN
        } else if (board[0][0] == AI && board[1][1] == AI && board[2][2] == AI) {
            return AI_WIN
        }


        // Checking for Diagonals for X or O victory.
        if (board[0][2] == PLAYER1 && board[1][1] == PLAYER1 && board[2][0] == PLAYER1) {
            return PLAYER1_WIN
        } else if (board[0][2] == PLAYER2 && board[1][1] == PLAYER2 && board[2][0] == PLAYER2&&gameMode==GameMode.PLAY_WITH_FRIENDS) {
            return PLAYER2_WIN
        } else if (board[0][2] == AI && board[1][1] == AI && board[2][0] == AI) {
            return AI_WIN
        }

        if(!isSpotAvailable(board)){
            return TIE
        }

        return NOTHING

    }

    private fun isSpotAvailable(board: Array<CharArray>): Boolean {
      for(row in 0..2){
          for (col in 0..2){
              if(board[row][col]=='_'){
                 return true
              }
          }
      }
        return false
    }

    private fun reset(board: Array<CharArray>) {

     for (row in 0..2){
         for (col in 0..2){
             board[row][col] = '_'
         }
     }

        btn_1.text = ""
        btn_1.isEnabled = true
        btn_2.text = ""
        btn_2.isEnabled = true
        btn_3.text = ""
        btn_3.isEnabled = true
        btn_4.text = ""
        btn_4.isEnabled = true
        btn_5.text = ""
        btn_5.isEnabled = true
        btn_6.text = ""
        btn_6.isEnabled = true
        btn_7.text = ""
        btn_7.isEnabled = true
        btn_8.text = ""
        btn_8.isEnabled = true
        btn_9.text = ""
        btn_9.isEnabled = true
    }

    private fun aIMove(board: Array<CharArray>,player: Char?){
       if(player== AI&&gameMode==GameMode.PLAY_WITH_AI){
           simpleAi(board)
       }
    }

    private fun simpleAi(board: Array<CharArray>) {
        val availableSpot = getAvailableSpot(board)
        // is spot available ?
        if(availableSpot.size>0){
            val random = Random()
            val move = random.nextInt(availableSpot.size)
            val row = availableSpot[move][0]
            val col = availableSpot[move][1]

            if(row==0&&col==0){
                btn_1.text = "O"
                btn_1.isEnabled = false
                board[0][0] = AI
                btn_1.setTextColor(Color.parseColor("#FFFF00"))
                currentPlayer = PLAYER1
            }else if(row==0&&col==1){
                btn_2.text = "O"
                btn_2.isEnabled = false
                board[0][1] = AI
                btn_2.setTextColor(Color.parseColor("#FFFF00"))
                currentPlayer = PLAYER1
            }else if(row==0&&col==2){
                btn_3.text = "O"
                btn_3.isEnabled = false
                board[0][2] = AI
                btn_3.setTextColor(Color.parseColor("#FFFF00"))
                currentPlayer = PLAYER1
            }else if(row==1&&col==0){
                btn_4.text = "O"
                btn_4.isEnabled = false
                board[1][0] = AI
                btn_4.setTextColor(Color.parseColor("#FFFF00"))
                currentPlayer = PLAYER1
            }
            else if(row==1&&col==1){
                btn_5.text = "O"
                btn_5.isEnabled = false
                board[1][1] = AI
                btn_5.setTextColor(Color.parseColor("#FFFF00"))
                currentPlayer = PLAYER1
            }else if(row==1&&col==2){
                btn_6.text = "O"
                btn_6.isEnabled = false
                board[1][2] = AI
                btn_6.setTextColor(Color.parseColor("#FFFF00"))
                currentPlayer = PLAYER1
            }
            else if(row==2&&col==0){
                btn_7.text = "O"
                btn_7.isEnabled = false
                board[2][0] = AI
                btn_7.setTextColor(Color.parseColor("#FFFF00"))
                currentPlayer = PLAYER1
            }
            else if(row==2&&col==1){
                btn_8.text = "O"
                btn_8.isEnabled = false
                board[2][1] = AI
                btn_8.setTextColor(Color.parseColor("#FFFF00"))
                currentPlayer = PLAYER1
            }
            else if(row==2&&col==2){
                btn_9.text = "O"
                btn_9.isEnabled = false
                board[2][2] = AI
                btn_9.setTextColor(Color.parseColor("#FFFF00"))
                currentPlayer = PLAYER1
            }

            checkWinner(board)

        }

    }

    private fun getAvailableSpot(board: Array<CharArray>): ArrayList<Array<Int>> {
        val availableSpot : ArrayList<Array<Int>> = arrayListOf()
        for (row in 0..2){
            for (col in 0..2){
                if(board[row][col]=='_'){
                    availableSpot.add(arrayOf(row,col))
                }
            }
        }
        return availableSpot
    }


}
