/**
 * Main program for the four in a row game
 * @author Kyle Macdonald
 * @date 2/4/2024
 */


val FIR_board = FourInARow()

/** The entry main method (the program starts here)  */
fun main() {
 var currentState: Int = GameConstants.PLAYING
 var userInput: String
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

  //takes user input
  print("Please provide which spot you'd like to drop your piece in (1-36), or q to quit: ")
  userInput = readln()

  //only sets position if user didn't input q or y to quit/continue
  if(userInput != "q" && userInput != "y"){
   //Sets player move based on input if they didn't quit
   FIR_board.setMove(GameConstants.RED, userInput.toInt() - 1)

   //Sets cpu position
   FIR_board.setMove(GameConstants.BLUE, FIR_board.computerMove)

   //Checks if there's a row matching
   currentState = FIR_board.checkForWinner()
  }

  //Handles playing again logic, displays messages based on who wins
  if(currentState != GameConstants.PLAYING){
   FIR_board.printBoard();
   println("GAME OVER")
   if(currentState == GameConstants.RED_WON){
    println("RED WON!");
   }else{
    println("BLUE WON!");
   }
   println("Would you like to play again? (y for yes, q for quit)")
   userInput = readln()
   if(userInput == "y"){
    FIR_board.clearBoard()
    currentState = GameConstants.PLAYING;
   }
  }
 } while (currentState == GameConstants.PLAYING && userInput != "q")
// repeat if not game-over
}