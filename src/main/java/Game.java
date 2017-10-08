import board.GameBoard;
import board.PrintBoard;
import consuleInput.InputReader;
import players.Playable;
import players.PlayerGroup;

/**
 * Created by tiffany on 10/4/17.
 */
public class Game {

    public static void play() {
        Modes modes =  new Modes();
        InputReader ir = new InputReader();
        GameBoard bg = new GameBoard(9);
        PrintBoard pb = new PrintBoard();
        PlayerGroup pg = new PlayerGroup();
        GameStateChecker gsc = new GameStateChecker();
        System.out.println("choose a mode:");
        System.out.println("1. Player vs player");
        System.out.println("2. player v computer");
        System.out.println("3. computer vs computer");

        int mode =  ir.toIntegerReader("type below");

        modes.chooseMode(mode, pg);

        pb.print(bg);

        int counter = 9;
        Playable currentPlayer;
        boolean hasWinner = false;
        int player = 0;
        //int choice;
        do{
            currentPlayer = pg.getPlayer(player);
            //int choice = ir.toIntegerReader("pick a square (0-8):");
            bg.addMarker(currentPlayer.playerMove(bg.getAvailableSpots()), currentPlayer.getMarker());
            pb.print(bg);
            hasWinner = gsc.checkPatterns(bg, currentPlayer);
            //System.out.println("is there a winner " + hasWinner);
            counter--;
            if (player == 0) {
                player = 1;
            }
            else {
                player = 0;
            }
            /*
            currentPlayer = pg.getPlayer(1);
            choice = ir.toIntegerReader("pick a square (0-8):");
            bg.addMarker(choice, currentPlayer.getMarker());
            pb.print(bg);
            hasWinner = gsc.checkPatterns(bg, currentPlayer);
            counter--;
            */
        }
        while (!hasWinner);


    }
}
