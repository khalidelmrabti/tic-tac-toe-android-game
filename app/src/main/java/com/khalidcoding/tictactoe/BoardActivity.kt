package com.khalidcoding.tictactoe

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_board.*
import java.util.*

/**
 * Created by KHALID EL MRABTI / Khalid Coding on 30/05/20.
 */

class BoardActivity : AppCompatActivity(),View.OnClickListener {
    var currentPlayer: Char? = null
    lateinit var gameMode: GameMode
    var playerXScore = 0
    var playerOScore = 0
    lateinit var aiLevels : AiLevels
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_board)


        btn_1.setOnClickListener(this)
        btn_2.setOnClickListener(this)
        btn_3.setOnClickListener(this)
        btn_4.setOnClickListener(this)
        btn_5.setOnClickListener(this)
        btn_6.setOnClickListener(this)
        btn_7.setOnClickListener(this)
        btn_8.setOnClickListener(this)
        btn_9.setOnClickListener(this)
        btn_reset.setOnClickListener(this)
        back.setOnClickListener(this)

        //  get game mode
        if (intent.extras != null) {
            when (intent.extras!!["gameMode"]) {
                AI -> {
                    currentPlayer = PLAYER1
                    gameMode = GameMode.PLAY_WITH_AI
                    labelOScore.text = "Ai:  $playerOScore"
                }
                FRIENDS -> {
                    currentPlayer = PLAYER1
                    gameMode = GameMode.PLAY_WITH_FRIENDS
                    labelOScore.text = "Player2:  $playerOScore"
                }
            }
        }

        //  get Ai Level
        if(intent.extras!!["level"]!=null){
            when(intent.extras!!["level"]){
                AiLevels.SIMPLE->{
                    aiLevels = AiLevels.SIMPLE
                }

                AiLevels.SMART->{
                    aiLevels = AiLevels.SMART
                }
            }

        }
    }

    override fun onClick(view: View?) {
        if (view?.id == R.id.btn_reset) {
            reset(board)
        } else if (view?.id == R.id.back) {
            super.onBackPressed()
        } else {
            playGame(view?.id, currentPlayer)
        }

        getAvailableSpot(board)
    }

    private fun playGame(btnId: Int?, player: Char?) {
        when (btnId) {
            R.id.btn_1 -> {
                if (gameMode == GameMode.PLAY_WITH_FRIENDS) {
                    if (player == PLAYER1) {
                        btn_1.isEnabled = false
                        btn_1.text = "X"
                        btn_1.setTextColor(Color.parseColor("#FF0000"))
                        currentPlayer = PLAYER2
                        board[0][0] = PLAYER1
                    } else {
                        btn_1.isEnabled = false
                        btn_1.text = "O"
                        btn_1.setTextColor(Color.parseColor("#FFFF00"))
                        currentPlayer = PLAYER1
                        board[0][0] = PLAYER2
                    }
                } else {
                    if (player == PLAYER1) {
                        btn_1.isEnabled = false
                        btn_1.text = "X"
                        btn_1.setTextColor(Color.parseColor("#FF0000"))
                        currentPlayer = AI
                        board[0][0] = PLAYER1
                    }
                }
            }
            R.id.btn_2 -> {
                if (gameMode == GameMode.PLAY_WITH_FRIENDS) {
                    if (player == PLAYER1) {
                        btn_2.isEnabled = false
                        btn_2.text = "X"
                        btn_2.setTextColor(Color.parseColor("#FF0000"))
                        currentPlayer = PLAYER2
                        board[0][1] = PLAYER1
                    } else {
                        btn_2.isEnabled = false
                        btn_2.text = "O"
                        btn_2.setTextColor(Color.parseColor("#FFFF00"))
                        currentPlayer = PLAYER1
                        board[0][1] = PLAYER2

                    }
                } else {
                    if (player == PLAYER1) {
                        btn_2.isEnabled = false
                        btn_2.text = "X"
                        btn_2.setTextColor(Color.parseColor("#FF0000"))
                        currentPlayer = AI
                        board[0][1] = PLAYER1
                    }
                }
            }
            R.id.btn_3 -> {
                if (gameMode == GameMode.PLAY_WITH_FRIENDS) {
                    if (player == PLAYER1) {
                        btn_3.isEnabled = false
                        btn_3.text = "X"
                        btn_3.setTextColor(Color.parseColor("#FF0000"))
                        currentPlayer = PLAYER2
                        board[0][2] = PLAYER1
                    } else {
                        btn_3.isEnabled = false
                        btn_3.text = "O"
                        btn_3.setTextColor(Color.parseColor("#FFFF00"))
                        currentPlayer = PLAYER1
                        board[0][2] = PLAYER2
                    }
                } else {
                    if (player == PLAYER1) {
                        btn_3.isEnabled = false
                        btn_3.text = "X"
                        btn_3.setTextColor(Color.parseColor("#FF0000"))
                        currentPlayer = AI
                        board[0][2] = PLAYER1
                    }
                }
            }
            R.id.btn_4 -> {
                if (gameMode == GameMode.PLAY_WITH_FRIENDS) {
                    if (player == PLAYER1) {
                        btn_4.isEnabled = false
                        btn_4.text = "X"
                        btn_4.setTextColor(Color.parseColor("#FF0000"))
                        currentPlayer = PLAYER2
                        board[1][0] = PLAYER1
                    } else {
                        btn_4.isEnabled = false
                        btn_4.text = "O"
                        btn_4.setTextColor(Color.parseColor("#FFFF00"))
                        currentPlayer = PLAYER1
                        board[1][0] = PLAYER2
                    }
                } else {
                    if (player == PLAYER1) {
                        btn_4.isEnabled = false
                        btn_4.text = "X"
                        btn_4.setTextColor(Color.parseColor("#FF0000"))
                        currentPlayer = AI
                        board[1][0] = PLAYER1
                    }
                }
            }
            R.id.btn_5 -> {
                if (gameMode == GameMode.PLAY_WITH_FRIENDS) {
                    if (player == PLAYER1) {
                        btn_5.isEnabled = false
                        btn_5.text = "X"
                        btn_5.setTextColor(Color.parseColor("#FF0000"))
                        currentPlayer = PLAYER2
                        board[1][1] = PLAYER1
                    } else {
                        btn_5.isEnabled = false
                        btn_5.text = "O"
                        btn_5.setTextColor(Color.parseColor("#FFFF00"))
                        currentPlayer = PLAYER1
                        board[1][1] = PLAYER2
                    }
                } else {
                    if (player == PLAYER1) {
                        btn_5.isEnabled = false
                        btn_5.text = "X"
                        btn_5.setTextColor(Color.parseColor("#FF0000"))
                        currentPlayer = AI
                        board[1][1] = PLAYER1
                    }
                }
            }
            R.id.btn_6 -> {
                if (gameMode == GameMode.PLAY_WITH_FRIENDS) {
                    if (player == PLAYER1) {
                        btn_6.isEnabled = false
                        btn_6.text = "X"
                        btn_6.setTextColor(Color.parseColor("#FF0000"))
                        currentPlayer = PLAYER2
                        board[1][2] = PLAYER1
                    } else {
                        btn_6.isEnabled = false
                        btn_6.text = "O"
                        btn_6.setTextColor(Color.parseColor("#FFFF00"))
                        currentPlayer = PLAYER1
                        board[1][2] = PLAYER2
                    }
                } else {
                    if (player == PLAYER1) {
                        btn_6.isEnabled = false
                        btn_6.text = "X"
                        btn_6.setTextColor(Color.parseColor("#FF0000"))
                        currentPlayer = AI
                        board[1][2] = PLAYER1
                    }
                }
            }
            R.id.btn_7 -> {
                if (gameMode == GameMode.PLAY_WITH_FRIENDS) {
                    if (player == PLAYER1) {
                        btn_7.isEnabled = false
                        btn_7.text = "X"
                        btn_7.setTextColor(Color.parseColor("#FF0000"))
                        currentPlayer = PLAYER2
                        board[2][0] = PLAYER1
                    } else {
                        btn_7.isEnabled = false
                        btn_7.text = "O"
                        btn_7.setTextColor(Color.parseColor("#FFFF00"))
                        currentPlayer = PLAYER1
                        board[2][0] = PLAYER2
                    }
                } else {
                    if (player == PLAYER1) {
                        btn_7.isEnabled = false
                        btn_7.text = "X"
                        btn_7.setTextColor(Color.parseColor("#FF0000"))
                        currentPlayer = AI
                        board[2][0] = PLAYER1
                    }
                }
            }
            R.id.btn_8 -> {
                if (gameMode == GameMode.PLAY_WITH_FRIENDS) {
                    if (player == PLAYER1) {
                        btn_8.isEnabled = false
                        btn_8.text = "X"
                        btn_8.setTextColor(Color.parseColor("#FF0000"))
                        currentPlayer = PLAYER2
                        board[2][1] = PLAYER1
                    } else {
                        btn_8.isEnabled = false
                        btn_8.text = "O"
                        btn_8.setTextColor(Color.parseColor("#FFFF00"))
                        currentPlayer = PLAYER1
                        board[2][1] = PLAYER2
                    }
                } else {
                    if (player == PLAYER1) {
                        btn_8.isEnabled = false
                        btn_8.text = "X"
                        btn_8.setTextColor(Color.parseColor("#FF0000"))
                        currentPlayer = AI
                        board[2][1] = PLAYER1
                    }
                }
            }
            R.id.btn_9 -> {
                if (gameMode == GameMode.PLAY_WITH_FRIENDS) {
                    if (player == PLAYER1) {
                        btn_9.isEnabled = false
                        btn_9.text = "X"
                        btn_9.setTextColor(Color.parseColor("#FF0000"))
                        currentPlayer = PLAYER2
                        board[2][2] = PLAYER1
                    } else {
                        btn_9.isEnabled = false
                        btn_9.text = "O"
                        btn_9.setTextColor(Color.parseColor("#FFFF00"))
                        currentPlayer = PLAYER1
                        board[2][2] = PLAYER2
                    }
                } else {
                    if (player == PLAYER1) {
                        btn_9.isEnabled = false
                        btn_9.text = "X"
                        btn_9.setTextColor(Color.parseColor("#FF0000"))
                        currentPlayer = AI
                        board[2][2] = PLAYER1
                    }
                }
            }
        }

        checkWinner(board)

        aIMove(board,currentPlayer)
    }

    private fun checkWinner(board: Array<CharArray>) {
       if(evaluate(board)!= NULL) {
           when(evaluate(board)){

               PLAYER1_WIN -> {
                   Toast.makeText(this, "Player Win !", Toast.LENGTH_LONG).show()
                   labelXScore.text = "Player1: ${++playerXScore}"
                   Handler().postDelayed({
                       reset(board)
                   },500)
               }
               PLAYER2_WIN ->{
                   Toast.makeText(this, "Player 2 Win !", Toast.LENGTH_LONG).show()
                   labelOScore.text = "Player2: ${++playerOScore}"
                   Handler().postDelayed({
                       reset(board)
                   },500)
               }
               AI_Win -> {
                   Toast.makeText(this, "AI Win !", Toast.LENGTH_LONG).show()
                   labelOScore.text = "AI: ${++playerOScore}"
                   Handler().postDelayed({
                       reset(board)
                   },500)

               }
               TIE->{
                   Toast.makeText(this, "Tie !", Toast.LENGTH_LONG).show()
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
                return AI_Win
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
                return AI_Win
            }

        }

        // Checking for Diagonals for X or O victory.
        if (board[0][0] == PLAYER1 && board[1][1] == PLAYER1 && board[2][2] == PLAYER1) {
            return PLAYER1_WIN
        } else if (board[0][0] == PLAYER2 && board[1][1] == PLAYER2 && board[2][2] == PLAYER2&&gameMode==GameMode.PLAY_WITH_FRIENDS) {
            return PLAYER2_WIN
        } else if (board[0][0] == AI && board[1][1] == AI && board[2][2] == AI) {
            return AI_Win
        }


        // Checking for Diagonals for X or O victory.
        if (board[0][2] == PLAYER1 && board[1][1] == PLAYER1 && board[2][0] == PLAYER1) {
            return PLAYER1_WIN
        } else if (board[0][2] == PLAYER2 && board[1][1] == PLAYER2 && board[2][0] == PLAYER2&&gameMode==GameMode.PLAY_WITH_FRIENDS) {
            return PLAYER2_WIN
        } else if (board[0][2] == AI && board[1][1] == AI && board[2][0] == AI) {
            return AI_Win
        }else if (!isSpotAvailable(board)){
            return TIE
        }

        return NULL

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
        if(player == AI&&aiLevels==AiLevels.SIMPLE&&gameMode==GameMode.PLAY_WITH_AI){
            Handler().postDelayed({
                simpleAi(board)
            },500)
        }else if (player == AI&&aiLevels==AiLevels.SMART&&gameMode==GameMode.PLAY_WITH_AI){
            Handler().postDelayed({
                smartAi(board)
            },500)
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

    fun smartAi(board:Array<CharArray>){
        var bestMove = Move()
        bestMove = findBestMove(board)
        if(bestMove.row==0&&bestMove.col==0){
            btn_1.isEnabled = false
            btn_1.text = "O"
            btn_1.setTextColor(Color.parseColor("#FFFF00"))
            currentPlayer = PLAYER1
            board[bestMove.row][bestMove.col] = AI
        }else if(bestMove.row==0&&bestMove.col==1){
            btn_2.isEnabled = false
            btn_2.text = "O"
            btn_2.setTextColor(Color.parseColor("#FFFF00"))
            currentPlayer = PLAYER1
            board[bestMove.row][bestMove.col] = AI
        }else if(bestMove.row==0&&bestMove.col==2){
            btn_3.isEnabled = false
            btn_3.text = "O"
            btn_3.setTextColor(Color.parseColor("#FFFF00"))
            currentPlayer = PLAYER1
            board[bestMove.row][bestMove.col] = AI
        }else if(bestMove.row==1&&bestMove.col==0){
            btn_4.isEnabled = false
            btn_4.text = "O"
            btn_4.setTextColor(Color.parseColor("#FFFF00"))
            currentPlayer = PLAYER1
            board[bestMove.row][bestMove.col] = AI
        }else if(bestMove.row==1&&bestMove.col==1){
            btn_5.isEnabled = false
            btn_5.text = "O"
            btn_5.setTextColor(Color.parseColor("#FFFF00"))
            currentPlayer = PLAYER1
            board[bestMove.row][bestMove.col] = AI
        }else if(bestMove.row==1&&bestMove.col==2){
            btn_6.isEnabled = false
            btn_6.text = "O"
            btn_6.setTextColor(Color.parseColor("#FFFF00"))
            currentPlayer = PLAYER1
            board[bestMove.row][bestMove.col] = AI
        }else if(bestMove.row==2&&bestMove.col==0){
            btn_7.isEnabled = false
            btn_7.text = "O"
            btn_7.setTextColor(Color.parseColor("#FFFF00"))
            currentPlayer = PLAYER1
            board[bestMove.row][bestMove.col] = AI
        }else if(bestMove.row==2&&bestMove.col==1){
            btn_8.isEnabled = false
            btn_8.text = "O"
            btn_8.setTextColor(Color.parseColor("#FFFF00"))
            currentPlayer = PLAYER1
            board[bestMove.row][bestMove.col] = AI
        }else if(bestMove.row==2&&bestMove.col==2){
            btn_9.isEnabled = false
            btn_9.text = "O"
            btn_9.setTextColor(Color.parseColor("#FFFF00"))
            currentPlayer = PLAYER1
            board[bestMove.row][bestMove.col] = AI
        }

        checkWinner(board)

    }

    fun findBestMove(board: Array<CharArray>):Move{
        var bestScore = -1000
        val bestMove = Move()
        bestMove.col = -1
        bestMove.col = -1


        // Traverse all cells, evaluate minimax function for all empty cells. And return the cell with optimal value.

        for (row in 0..2){
            for(col in 0..2){
                // check if cell is empty
                if(board[row][col]=='_'){
                    // make move
                    board[row][col] = AI
                    // compute evaluation function for this move.
                    val score = miniMax(board,0,false)
                    board[row][col] = '_'

                    if(score>bestScore){
                        bestScore = score
                        bestMove.row = row
                        bestMove.col = col
                    }
                }
            }
        }

        return bestMove
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

    fun miniMax(board: Array<CharArray>, depth:Int, isMax:Boolean):Int{
        val score = evaluate(board)

        // If Ai has won return his value
        if (score==10){
            return score
        }

        // If human has won return his value
        if (score==-10){
            return score
        }

        // If there are no more moves and no winner then it is a tie
        if (!isSpotAvailable(board)){
            return 0
        }

        if(isMax){
            var bestScore = -1000
            for (row in 0..2){
                for(col in 0..2){
                    // check if cell is empty
                    if(board[row][col]=='_'){
                        // make move
                        board[row][col] = AI
                        // compute evaluation function for this move.
                        val maxScore = miniMax(board,depth+1,false)
                        board[row][col] = '_'
                        bestScore = Math.max(bestScore, maxScore)
                    }
                }
            }

            return bestScore
        }else{
            var bestScore = 1000
            for (row in 0..2){
                for(col in 0..2){
                    // check if cell is empty
                    if(board[row][col]=='_'){
                        // make human move
                        board[row][col] = PLAYER1
                        // compute evaluation function for this move.
                        val minScore = miniMax(board,depth+1,true)
                        board[row][col] = '_'
                        bestScore = Math.min(bestScore, minScore)
                        bestScore = Math.min(bestScore, minScore)
                    }
                }
            }

            return bestScore
        }
    }

}
