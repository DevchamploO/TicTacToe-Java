package board;

import java.util.ArrayList;

/**
 * Created by tiffany on 10/4/17.
 */
public class GameBoard {

    private Cell[] board;

    private ArrayList<Integer> availableSpots;

    public GameBoard(int n) {
        availableSpots = new ArrayList<Integer>();

        //the game board
        board = new Cell[n];
        for (int i = 0; i < n; i++) {
            board[i] = new Cell();
        }

        //list of initial open cells
        for (int i = 0; i < 9; i++) {
            availableSpots.add(i);
        }
    }


    public Cell[] getBoard() {
        return board;
    }

    public void addMarker(int n, String s) {
        if (availableSpots.contains(n)) {
            board[n].setMarker(s);
            removeSpotFromList(n);
            //System.out.println(availableSpots.size());
        }
        else {
                System.out.println("Cell not available");

            }
    }

    public String getCellValue(int n) {
        return board[n].getMarker();
    }

    public ArrayList<Integer> getAvailableSpots() {
        return availableSpots;
    }

    //remove number from arraylist
    public void removeSpotFromList(int n) {
        availableSpots.set(n, null);
        availableSpots.trimToSize();
        for (int i=0; i<availableSpots.size(); i++) {
            //System.out.println(availableSpots.get(i) + ", ");
        }
    }

}
