package players;

import board.GameBoard;
import consuleInput.InputReader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tiffany on 10/5/17.
 */
public interface Playable {


    public String getMarker();

    public int playerMove(ArrayList<Integer> spots);

}
