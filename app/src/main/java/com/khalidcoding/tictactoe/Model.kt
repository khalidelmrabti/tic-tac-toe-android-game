package com.khalidcoding.tictactoe

/**
 * Created by KHALID EL MRABTI / Khalid Coding on 30/05/20.
 */

val PLAYER1 = 'X'
val PLAYER2 = 'O'
val AI = 'O'
val FRIENDS = PLAYER1
val AI_Win = 10
val PLAYER1_WIN = -10
val PLAYER2_WIN = -20
val TIE = 0
val NULL = -2

enum class GameMode{
    PLAY_WITH_FRIENDS,PLAY_WITH_AI
}


val board : Array<CharArray> = arrayOf(
    charArrayOf('_','_','_'),
    charArrayOf('_','_','_'),
    charArrayOf('_','_','_')
)

enum class AiLevels {
    SMART, SIMPLE
}


class Move {
    var row = 0
    var col = 0
}




