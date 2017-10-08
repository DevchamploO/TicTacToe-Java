package players;

import board.GameBoard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by tiffany on 10/6/17.
 */
public class ComputerMove implements Movable {

    public int movement(ArrayList<Integer> spots) {
        Random rand = new Random();
        int n = rand.nextInt(spots.size());
        System.out.println("computer moves to " + n);
        return n;
    }

}
