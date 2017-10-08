package board;

/**
 * Created by tiffany on 10/4/17.
 */
public class PrintBoard {

    public void print(GameBoard board) {
        System.out.println(board.getCellValue(0) + "|" + board.getCellValue(1) + "|" + board.getCellValue(2));
        System.out.println("------");
        System.out.println(board.getCellValue(3) + "|" + board.getCellValue(4) + "|" + board.getCellValue(5));
        System.out.println("------");
        System.out.println(board.getCellValue(6) + "|" + board.getCellValue(7) + "|" + board.getCellValue(8));
    }

}
