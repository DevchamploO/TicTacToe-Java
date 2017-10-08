package players;

import board.GameBoard;
import consuleInput.InputReader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tiffany on 10/5/17.
 */
public class HumanPlayer implements Playable {

    public HumanPlayer(String marker, Movable movable) {
        this.marker = marker;
        hMove = new HumanMove();
    }

    private String marker;

    private Movable hMove;

    public String getMarker() {
        return marker;
    }

    public int playerMove(ArrayList<Integer> spots) {

        return hMove.movement(spots);
    }


}
