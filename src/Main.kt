


val FIR_board = FourInARow()

/** The entry main method (the program starts here)  */
fun main() {
 val currentState: Int = GameConstants.PLAYING
 val userInput = ""
 //game loop
 //test
 do {
  FIR_board.printBoard()
  /** TODO implement the game loop
   * 1- accept user move
   * 2- call getComputerMove
   * 3- Check for winner
   * 4- Print game end messages in case of Win , Lose or Tie !
   */
  print("Please provide which col you'd like to drop in (1-36), or q to quit: ")
  val userInput = readln()
  if(userInput != "q"){
   FIR_board.setMove(GameConstants.RED, userInput.toInt() - 1)
   FIR_board.setMove(GameConstants.BLUE, FIR_board.computerMove)
  }
 } while (currentState == GameConstants.PLAYING && userInput != "q")
// repeat if not game-over
}