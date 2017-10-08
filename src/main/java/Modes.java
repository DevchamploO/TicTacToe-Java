import consuleInput.InputReader;
import players.*;

/**
 * Created by tiffany on 10/5/17.
 */
public class Modes {

    //choose a game mode based on menu option
    public void chooseMode(int mode, PlayerGroup pg) {

        switch (mode) {

            case 1:
                createHumanPlayers(pg);
                break;
            case 2:
                createHumanAndBotPlayers(pg);
                break;
        }
    }

    //player vs player
    public void createHumanPlayers(PlayerGroup playerGroup) {
        InputReader reader = new InputReader();
        String m = reader.reader("What mark (x or O)?");
        String n;
        int o = reader.toIntegerReader("First or second?");
        if(m.equals("X")) {
            n = "O";
        } else {
            n = "X";
        }

        playerGroup.setPlayers(new HumanPlayer(m, new HumanMove()), new HumanPlayer(n, new HumanMove()), o);

    }

   // player vs computer
    public  void createHumanAndBotPlayers(PlayerGroup playerGroup) {
        InputReader reader = new InputReader();
        String m = reader.reader("What mark (x or O)?");
        String n;
        int o = reader.toIntegerReader("First or second?");
        if(m.equals("X")) {
            n = "O";
        } else {
            n = "X";
        }

        playerGroup.setPlayers(new HumanPlayer(m, new HumanMove()), new ComputerPlayer(n, new ComputerMove()),o);
    }
}
