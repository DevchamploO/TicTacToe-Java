package players;

/**
 * Created by tiffany on 10/5/17.
 */
public class PlayerGroup {

    Playable[] players = new Playable[2];

    public void setPlayers(Playable player1,  Playable player2, int pos) {
        if (pos == 1) {
            players[0] = player1;
            players[1] = player2;
        }
        else {
            players[0] = player2;
            players[1] = player1;
        }

    }

    public Playable getPlayer(int n) {
        return players[n];
    }
}