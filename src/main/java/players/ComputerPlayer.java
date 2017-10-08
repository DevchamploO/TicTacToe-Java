package players;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by tiffany on 10/6/17.
 */
public class ComputerPlayer implements Playable {

    public ComputerPlayer(String marker, Movable movable) {
        this.marker = marker;
        cMove = movable;
    }

    private String marker;

    private Movable cMove;

    public String getMarker() {
        return marker;
    }

    public int playerMove(ArrayList<Integer> spots) {
        return cMove.movement(spots);
    }

}
