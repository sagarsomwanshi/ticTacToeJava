import java.util.*;
public class TicTacToeGame {
    public static void main(String[] args) {
        UC1();

    }
    public static void UC1(){
        String [] board = new String[10];
        for(int i = 1; i< board.length; i++){
            board[i] = String.valueOf(i);
        }
    }
}
