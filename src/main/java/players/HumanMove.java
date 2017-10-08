package players;

import board.GameBoard;
import consuleInput.InputReader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tiffany on 10/5/17.
 */
public class HumanMove implements Movable {

    InputReader inputReader = new InputReader();

    int choice;

    public int movement(ArrayList<Integer> spots) {
        choice = inputReader.toIntegerReader("Choose a vacant square (0-8):");
        return choice;
    }

}
