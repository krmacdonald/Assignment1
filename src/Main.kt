


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
  print("Please provide which col you'd like to drop in (1-6), or q to quit: ")
  val userInput = readln()
  when(userInput){
   "1" -> 
  }
 } while (currentState == GameConstants.PLAYING && userInput != "q")
// repeat if not game-over
}
 