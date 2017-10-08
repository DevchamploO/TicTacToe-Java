import board.Cell;
import board.GameBoard;
import players.Playable;

/**
 * Created by tiffany on 10/5/17.
 */
public class GameStateChecker {

    //check for a winner
    public boolean checkPatterns(GameBoard gameBoard, Playable currentPlayer) {
        Cell[] board = gameBoard.getBoard();
        if ((board[0].getMarker().equals(currentPlayer.getMarker()) && board[1].getMarker().equals(currentPlayer.getMarker()) && board[2].getMarker().equals(currentPlayer.getMarker())) ||
                (board[3].getMarker().equals(currentPlayer.getMarker()) && board[4].getMarker().equals(currentPlayer.getMarker()) && board[5].getMarker().equals(currentPlayer.getMarker())) ||
                (board[6].getMarker().equals(currentPlayer.getMarker()) && board[7].getMarker().equals(currentPlayer.getMarker()) && board[8].getMarker().equals(currentPlayer.getMarker())) ||
                (board[0].getMarker().equals(currentPlayer.getMarker()) && board[3].getMarker().equals(currentPlayer.getMarker()) && board[6].getMarker().equals(currentPlayer.getMarker())) ||
                (board[1].getMarker().equals(currentPlayer.getMarker()) && board[4].getMarker().equals(currentPlayer.getMarker()) && board[5].getMarker().equals(currentPlayer.getMarker())) ||
                (board[2].getMarker().equals(currentPlayer.getMarker()) && board[5].getMarker().equals(currentPlayer.getMarker()) && board[8].getMarker().equals(currentPlayer.getMarker())) ||
                (board[0].getMarker().equals(currentPlayer.getMarker()) && board[4].getMarker().equals(currentPlayer.getMarker()) && board[8].getMarker().equals(currentPlayer.getMarker())) ||
                (board[2].getMarker().equals(currentPlayer.getMarker()) && board[4].getMarker().equals(currentPlayer.getMarker()) && board[6].getMarker().equals(currentPlayer.getMarker()))) {
            System.out.println("The winner is " + currentPlayer.getMarker());
            return true;
        }
        else {
            return false;
        }
    }

}
