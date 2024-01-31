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
        if(player == 0){
            board[location/6][location%6] = GameConstants.RED
        }else if(player == 1){
            board[location/6][location%6] = GameConstants.BLUE
        }
    }

    override val computerMove: Int
        get() =// TODO Auto-generated method stub
            0

    override fun checkForWinner(): Int {
        // TODO Auto-generated method stub
        return 0
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

