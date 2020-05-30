package com.khalidcoding.tictactoe

/**
 * Created by KHALID EL MRABTI / Khalid Coding on 30/05/20.
 */

val PLAYER1 = 'x'
val PLAYER2 = 'o'
val AI = 'o'
var friends = PLAYER1
val NOTHING = -1
val AI_WIN = 10
val PLAYER1_WIN = -10
val PLAYER2_WIN = -20
val TIE = 0

enum class GameMode{
    PLAY_WITH_FRIENDS,PLAY_WITH_AI
}


val board : Array<CharArray> = arrayOf(
    charArrayOf('_','_','_'),
    charArrayOf('_','_','_'),
    charArrayOf('_','_','_')
)




