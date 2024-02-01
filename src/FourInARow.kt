/**
 * TicTacToe class implements the interface
 * @author relkharboutly
 * @date 2/12/2022
 */
class FourInARow
/**
 * clear board and set current player
 */
    : IGame {
    // game board in 2D array initialized to zeros
      private val board = Array(GameConstants.ROWS) { IntArray(GameConstants.COLS){0} }

    override fun clearBoard() {
        for (row in 0..<GameConstants.ROWS) {
            for (col in 0..<GameConstants.COLS) {
                board[row][col] = GameConstants.EMPTY;
            }
        }
    }

    override fun setMove(player: Int, location: Int) {
        if(player == GameConstants.RED){
            if(board[location/6][location%6] == GameConstants.EMPTY) {
                board[location / 6][location % 6] = GameConstants.RED
            }
        }else if(player == GameConstants.BLUE){
            if(board[location/6][location%6] == GameConstants.EMPTY) {
                board[location / 6][location % 6] = GameConstants.BLUE
            }
        }

    }

    override val computerMove: Int
        get() = generateComputerMove()

    private fun generateComputerMove(): Int{
        for(i in 0 ..< 35){
            if(board[i/6][i%6] == GameConstants.EMPTY){
                return i
            }
        }
        return -1
    }

    override fun checkForWinner(): Int {
        for(i in 0..< 3){
            for(j in 0 ..< 6){
                if(board[i][j] == board[i + 1][j] && board[i+1][j] == board[i+2][j] && board[i+2][j] == board[i+3][j]){
                    if(board[i][j] == GameConstants.RED)
                        return GameConstants.RED_WON
                    else
                        return GameConstants.BLUE_WON
                }else if(board[j][i] == board[j][i + 1] && board[j][i + 1] == board[j][i + 2] && board[j][i + 2] == board[j][i + 3]){
                    if(board[j][i] == GameConstants.RED)
                        return GameConstants.RED_WON
                    else
                        return GameConstants.BLUE_WON
                }
            }
        }
        return GameConstants.PLAYING
    }

    /**
     * Print the game board
     */
    fun printBoard() {
        for (row in 0 until GameConstants.ROWS) {
            for (col in 0 until GameConstants.COLS) {
                printCell(board[row][col]) // print each of the cells
                if (col != GameConstants.COLS - 1) {
                    print("|") // print vertical partition
                }
            }
            println()
            if (row != GameConstants.ROWS - 1) {
                println("---------------------") // print horizontal partition
            }
        }
        println()
    }

    /**
     * Print a cell with the specified "content"
     * @param content either BLUE, RED or EMPTY
     */
    fun printCell(content: Int) {
        when (content) {
            GameConstants.EMPTY -> print("   ")
            GameConstants.BLUE -> print(" B ")
            GameConstants.RED -> print(" R ")
        }
    }
}

